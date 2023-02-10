package cel;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;

import cel.arca.Ramat;
import cel.nombres.Nombre;

/**
 * <tt>
 * <center>
 * <h3>Visió preparatòria: litúrgia celestial</h3>
 * <sup>1</sup> Després d'això, vaig veure una porta oberta en el cel, i vaig sentir aquella veu semblant al toc de trompeta que abans m'havia parlat. Em deia:<br/>
 * --Puja aquí dalt i et faré conèixer allò que aviat, després d'aquestes coses, s'ha de complir.<br/>
 * <sup>2</sup> Immediatament, l'Esperit es va apoderar de mi, i vaig veure un tron posat en el cel. Hi seia algú
 * <sup>3</sup> que resplendia amb un esclat semblant al del jaspi i la cornalina, i el tron era nimbat per un cercle de llum que brillava com la maragda.
 * <sup>4</sup> Al seu voltant hi havia vint-i-quatre trons, on seien vint-i-quatre ancians, vestits de blanc i coronats amb corones d'or.
 * <sup>5</sup> El tron espurnejava de llampecs, seguits pel retruny de la tronada. Davant el tron cremaven set torxes enceses, que són els set esperits de Déu,
 * <sup>6</sup> i per terra s'estenia com un mar de vidre semblant al glaç. Als quatre costats del tron hi havia quatre vivents plens d'ulls, que miraven endavant i endarrere.
 * <sup>7</sup> El primer vivent era semblant a un lleó; el segon, a un toro; el tercer tenia aspecte d'home, i el quart era semblant a una àguila en ple vol.
 * <sup>8</sup> Cada un dels quatre vivents tenia sis ales, i estaven plens d'ulls que miraven tot al voltant i cap al tron. Nit i dia no paraven de repetir: «Sant, sant, sant és el Senyor, Déu de l'univers, el qui era, el qui és i el qui ve.»<br/>
 * <sup>9</sup> I sempre que aquells vivents glorificaven i honoraven el qui seu al tron i viu pels segles dels segles i li donaven gràcies,
 * <sup>10</sup> els vint-i-quatre ancians es prosternaven davant el qui seu al tron, adorant el qui viu pels segles dels segles. Posaven les seves corones davant el tron i proclamaven:<br/>
 * <sup>11</sup> --Ets digne, Senyor Déu nostre,<br/>
 * de rebre la glòria, l'honor i el poder,<br/>
 * perquè has creat tot l'univers.<br/>
 * Quan res no existia,<br/>
 * tu vas voler que tot fos creat.<br/>
 * </center>
 * </tt>
 * 
 * @author joan
 *
 */
public abstract class Déu implements Esperit {

	private static final long serialVersionUID = 5479249085887728066L;
	
	String nom;
	String ordre;
	Nombre<Esperit> escoltadors;
	
	@Override
	@XmlElement
	public String obtenirNom() {
		return nom;
	}
	@Override
	public void establirNom(String nom) {
		this.nom = nom;
	}
	@Override
	@XmlElement
	public String obtenirOrdre() {
		return ordre;
	}
	@Override
	public void establirOrdre(String ordre) {
		this.ordre = ordre;
		donarManament(new Ordre(this));
	}

	public Déu() {
		this.ordre = Manament.GÈNESI;
	}
	public Déu(String nom) {
		this.nom = nom;
		this.ordre = Manament.GÈNESI;
	}

	@Override
	public void afegirEscoltador(Esperit esperit) {
		if(escoltadors == null) {
			escoltadors = new Nombre<>();
		}
		escoltadors.establir(esperit);
	}
	@Override
	public void alliberarEscoltador(Esperit esperit) {
		if(escoltadors == null) {
			return;
		}
		escoltadors.alliberar(esperit);
	}
	protected void donarManament(Ordre manament) {
		if(escoltadors != null) {
			Ramat<Esperit> iterador = escoltadors.ramat();
			for (Esperit esperit = iterador.següent(); iterador.téMés(); esperit = iterador.següent()) {
				esperit.esdeveniment(manament);			
			}
		}
	}
	@Override
	public abstract Object clone();
	
	@Override
	public void esdeveniment(Ordre manament) {
		donarManament(manament);
	}
	
	@Override
	public void run() {
		establirOrdre(Manament.MOR);
	}
	
	@Override
	public String toString() {
		return Déu.corda(this);
	}
	
	/**
	 * Crea un objecte de classe X.
	 * @param <X> la classe de paràmetre de l'objecte retornat
	 * @param classe la classe del objecte retornat.
	 * @param arguments els arguments de la creació de l'objecte
	 * @return el nou objecte <X> creat
	 */
	protected static <X> X crea(Class<X> classe, Object... arguments) {
		try {
			return classe.getDeclaredConstructor(obtenirClasses(arguments)).newInstance(arguments);
		}
		catch(Throwable t) {
			throw new Error(t);
		}
	}
	/**
	 * Obté les classes dels objectes introduits com a arguments.
	 * @param objectes els objectes dels quals se'n vol obtenir les classes
	 * @return les classes dels objectes introduits com a arguments
	 */
	private static Class<?>[] obtenirClasses(Object... objectes) {
		Class<?>[] classes = new Class<?>[objectes.length];
		for(int i = 0; i < objectes.length; i++) {
			classes[i] = objectes[i].getClass();
		}
		return classes;
	}
	/**
	 * Reprodueix l'objecte com a corda.
	 * @param object {@link Object} l'objecte a reproduir
	 * @return la corda reproduïda
	 */
	protected static String corda(Object object) {
		try {
			// instances new JAXBContext for current class
			JAXBContext context = JAXBContext.newInstance(object.getClass());
			// create marshaller
			Marshaller marshaller = context.createMarshaller();
			
			// output pretty printed
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
			// instances new StringWriter
			StringWriter sw = new StringWriter();
			// marshall XML message into StringWriter
			marshaller.marshal(object, sw);
			// get the XML message as string
			String strXml = sw.toString();
			// return string XML message
			return strXml;
		} 
		catch (JAXBException e) {
			// if something is wrong print stack trace
			e.printStackTrace();
			return null;
		}
	}
	/**
	 * Escriu l'objecte especificat a un arxiu.
	 * @param object l'objecte que es vol escriure
	 * @param destinació {@link String} la destinació de l'arxiu
	 */
	public static void escriuArxiu(Object object, String destinació) {
		// parse XML message into string.
		String str = Déu.corda(object);
		// declare new buffered writer
	    BufferedWriter writer;
		try {
			// instances buffered writer with new file writer with destination path as argument
			writer = new BufferedWriter(new FileWriter(destinació));
			// write the string to the file
		    writer.write(str);
		    // close writer
		    writer.close();
		} catch (IOException e) {
			// if something is wrong print stack trace
			e.printStackTrace();
		}
	}
	/**
	 * Llegeix el feix entrant i l'entèn com a objecte de classe <T>.
	 * @param <T> la classe d'objecte la qual retornarà
	 * @param classe la classe d'objecte que es vol llegir
	 * @param feixEntrada {@link InputStream} el feix entrant
	 * @return l'objecte llegit.
	 * @throws JAXBException si falla l'operació
	 */
	@SuppressWarnings("unchecked")
	public static <T> T llegir(Class<T> classe, InputStream feixEntrada) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(classe);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		return (T) unmarshaller.unmarshal(feixEntrada);
	}
	/**
	 * Escriu l'objecte especificat en el feix sortint.
	 * @param feixSortida {@link OutputStream} el feix sortint
	 * @throws JAXBException si falla l'operació
	 */
	public final void escriure(Object object, OutputStream feixSortida) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(object.getClass());
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
		marshaller.marshal(object, feixSortida);
	}
}