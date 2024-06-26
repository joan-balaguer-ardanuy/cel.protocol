package cel.gènesi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import cel.Anyell;
import cel.Manament;
import cel.Ordre;
import cel.Paritat;

/**
 * @author joan
 *
 */
@XmlRootElement
@XmlType(propOrder={"key", "value", "entry"})
public class Haploide 
	extends Dona<Hipercadena, Hipercub> {

	private static final long serialVersionUID = 6303009614734978313L;

	@Override
	public String obtenirNom() {
		StringBuilder stringBuilder = new StringBuilder();
		for(Anyell<Hipercadena,Hipercub> anyell : this) {
			stringBuilder.append(anyell.obtenirClau().obtenirNom());
		}
		return stringBuilder.toString();
	}
	@Override
	public Hipercadena getKey() {
		return obtenirClau();
	}
	@Override
	public Hipercadena setKey(Hipercadena key) {
		return establirClau(key);
	}
	@Override
	public Hipercub getValue() {
		return obtenirValor();
	}
	@Override
	public Hipercub setValue(Hipercub value) {
		return establirValor(value);
	}
	@Override
	@XmlElement
	public Haploide getEntry() {
		return obtenirPare() == obtenirDéu() ? null : (Haploide) obtenirPare();
	}
	
	public Haploide() {
		this(Genomapa.class, Paritat.aleatòria());
	}
	public Haploide(Paritat paritat) {
		super(paritat);
	}
	public Haploide(Class<Genomapa> classeFill, Paritat paritat) {
		super(classeFill, paritat);
	}
	public Haploide(Haploide pare) {
		super(pare);		
	}
	public Haploide(Haploide pare, Hipercadena clau, Hipercub valor) {
		super(Genomapa.class, pare, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public Haploide(Haploide déu, Paritat paritat) {
		super(déu, paritat);
	}
	public Haploide(Haploide déu, Paritat paritat, Hipercadena clau, Hipercub valor) {
		super(Genomapa.class, déu, paritat, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	@Override
	public int compareTo(Anyell<Hipercub, Hipercadena> o) {
		obtenirClau().comparador(new Hipercub()).compara(obtenirClau(), o.obtenirClau());
		Anyell<Character,Integer> anyell = obtenirClau().comparador().font();
		comparador((Hipercub) anyell, (Hipercadena) anyell.obtenirFill());
		return 0;
	}
	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		if(manament.getSource() instanceof Hipercub) {
			switch (manament.obtenirManament()) {
			case Manament.GÈNESI:
				if(sócDéu()) {
					Hipercub hipercub = (Hipercub) manament.getSource();
					obtenirMareDeDéu().establirValor(hipercub, (Hipercadena) hipercub.obtenirFill());
				}
				break;
			default:
				break;
			}
		} else if(manament.getSource() instanceof Haploide) {
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				Haploide haploide = (Haploide) manament.getSource();
				comparador(new Genomapa()).compara(haploide, obtenirMareDeDéu());
				System.out.println(comparador().font().obtenirNom());
				donarManament(new Ordre(comparador().font()));
				break;
			default:
				break;
			}
		}
	}
	@Override
	public void run() {
		obtenirClau().run();
		super.run();
	}
}