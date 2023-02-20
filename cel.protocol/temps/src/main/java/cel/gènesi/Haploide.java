package cel.gènesi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import cel.Anyell;
import cel.Manament;
import cel.Ordre;

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
	@XmlElement
	public Hipercadena getKey() {
		return obtenirClau();
	}
	@Override
	public Hipercadena setKey(Hipercadena key) {
		return establirClau(key);
	}
	@Override
	@XmlElement
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
		super();
	}
	public Haploide(String nom) {
		super(nom);
	}
	public Haploide(String nom, Hipercadena clau, Hipercub valor) {
		super(Genomapa.class, nom, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public Haploide(Haploide pare) {
		super(pare);
	}
	public Haploide(Haploide pare, Hipercadena clau, Hipercub valor) {
		super(Genomapa.class, pare, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public Haploide(Haploide déu, String nom) {
		super(déu, nom);
	}
	public Haploide(Haploide déu, String nom, Hipercadena clau, Hipercub valor) {
		super(Genomapa.class, déu, nom, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		if(manament.getSource() instanceof Hipercadena) {
			Hipercadena hipercadena = (Hipercadena) manament.getSource();
			switch (manament.obtenirManament()) {
				case Manament.VIU:
					obtenirClau().comparador().compara(hipercadena,obtenirValor());
					Anyell<Integer,Character> anyell = obtenirClau().comparador().font();
					establirValor((Hipercadena)anyell, (Hipercub)anyell.obtenirFill());
					break;
				case Manament.MOR:
					hipercadena.alliberar();
					obtenirValor().establirValor(hipercadena.obtenirValor(), hipercadena.obtenirClau());
					break;
				default:
					return;
			}
		}
		else if(manament.getSource() instanceof Haploide) {
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				Haploide haploide = (Haploide) manament.getSource();
				permutarFill(haploide, haploide.obtenirFill());
				break;
			default:
				break;
			}
		}
	}
	@Override
	public int compareTo(Anyell<Hipercub, Hipercadena> o) {
		obtenirClau().comparador().compara(obtenirClau(), o.obtenirClau());
		Anyell<Integer,Character> anyell = obtenirClau().comparador().font();
		comparador((Hipercadena) anyell, (Hipercub) anyell.obtenirFill());
		return 0;
	}
	@Override
	public void run() {
		getKey().run();
		super.run();
	}
}