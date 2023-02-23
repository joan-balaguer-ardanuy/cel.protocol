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
import javax.xml.bind.annotation.XmlRootElement;

/**
 * <tt>
 * <center>
 * <h2>Pròleg (1,1-18)</h2>
 * <big>1</big>
 * <sup>1</sup> Al principi existia<br/>
 * el qui és la Paraula.<br/>
 * La Paraula estava amb {@link Déu}<br/>
 * i la Paraula era {@link Déu}.<br/>
 * <sup>2</sup> Ell estava amb {@link Déu} al principi.<br/>
 * <sup>3</sup> Per ell tot ha vingut a l'existència,<br/>
 * i res no hi ha vingut sense ell.<br/>
 * <sup>4</sup> En ell hi havia la vida,<br/>
 * i la vida era la llum dels homes.<br/>
 * <sup>5</sup> La llum resplendeix en la foscor,<br/>
 * i la foscor no ha pogut ofegar-la.<br/>
 * <sup>6</sup> {@link Déu} envià un home que es deia Joan.<br/>
 * <sup>7</sup> Vingué com a testimoni<br/>
 * a donar testimoni de la llum,<br/>
 * perquè per ell tothom cregués.<br/>
 * <sup>8</sup> Ell no era la llum,<br/>
 * venia solament a donar-ne testimoni.<br/>
 * <sup>9</sup> Existia el qui és la llum veritable,<br/>
 * el qui ve al món<br/>
 * i il·lumina tots els homes.<br/>
 * <sup>10</sup> Era present en el món,<br/>
 * que per ell ha vingut a l'existència,<br/>
 * i el món no l'ha reconegut.<br/>
 * <sup>11</sup> Ha vingut a casa seva,<br/>
 * i els seus no l'han acollit.<br/>
 * <sup>12</sup> Però a tots els qui l'han rebut,<br/>
 * als qui creuen en el seu nom,<br/>
 * els ha concedit de ser fills de {@link Déu}.<br/>
 * <sup>13</sup> No han nascut<br/>
 * per descendència de sang,<br/>
 * ni d'un desig carnal,<br/>
 * ni d'un voler humà,<br/>
 * sinó de {@link Déu} mateix.<br/>
 * <sup>14</sup> El qui és la Paraula s'ha fet home<br/>
 * i ha habitat entre nosaltres,<br/>
 * i hem contemplat la seva glòria,<br/>
 * glòria que ha rebut<br/>
 * com a {@link Fill} únic del {@link Pare},<br/>
 * ple de gràcia i de veritat.<br/>
 * <sup>15</sup> Joan dóna testimoni d'ell<br/>
 * quan proclama:<br/>
 * «És aquell de qui jo deia:<br/>
 * El qui ve després de mi<br/>
 * em passa al davant,<br/>
 * perquè, abans que jo, ell ja existia.»<br/>
 * <sup>16</sup> De la seva plenitud,<br/>
 * tots nosaltres n'hem rebut<br/>
 * gràcia rere gràcia.<br/>
 * <sup>17</sup> La Llei fou donada per Moisès,<br/>
 * però la gràcia i la veritat<br/>
 * han vingut per Jesucrist.<br/>
 * <sup>18</sup> A {@link Déu}, ningú no l'ha vist mai:<br/>
 * el seu {@link Fill} únic, que és {@link Déu}<br/>
 * i està en el si del {@link Pare},<br/>
 * és qui l'ha revelat.<br/>
 * </center>
 * </tt>
 *  
 * @author joan
 *
 */
@XmlRootElement
public abstract class Paraula implements Missatge {

	private static final long serialVersionUID = 3863449976389265284L;
	
	Paritat paritat;
	String ordre;

	@Override
	public abstract String obtenirNom();
	
	@Override
	public String obtenirOrdre() {
		return ordre;
	}
	@Override
	public void establirOrdre(String ordre) {
		this.ordre = ordre;
	}
	@Override
	public Paritat obtenirParitat() {
		return paritat;
	}
	@Override
	public void establirParitat(Paritat paritat) {
		this.paritat = paritat;
	}
	
	public Paraula() {
		this.ordre = Manament.GÈNESI;
		this.paritat = Paritat.YY;
	}
	public Paraula(Paritat paritat) {
		this.ordre = Manament.GÈNESI;
		this.paritat = paritat;
	}

	@Override
	public String toString() {
		return Paraula.corda(this);
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
	 * Llegeix el feix entrant i l'entén com a objecte de classe <T>.
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