package cel.gènesi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import cel.Anyell;
import cel.Manament;
import cel.Ordre;

@XmlRootElement
@XmlType(propOrder={"key", "value", "entry"})
public class Hipercadena extends Dona<Integer,Character> {

	private static final long serialVersionUID = 5271465276828675216L;
	
	@Override
	@XmlElement
	public Integer getKey() {
		return obtenirClau();
	}
	@Override
	public Integer setKey(Integer keyh) {
		return establirClau(keyh);
	}
	@Override
	@XmlElement
	public Character getValue() {
		return obtenirValor();
	}
	@Override
	public Character setValue(Character value) {
		return establirValor(value);
	}
	@Override
	@XmlElement
	public Hipercadena getEntry() {
		return obtenirPassat() == obtenirDéu() ? null : (Hipercadena) obtenirPassat();
	}

	public Hipercadena() {
		super();
	}
	public Hipercadena(String nom) {
		super(nom);
	}
	public Hipercadena(String nom, Integer clau, Character valor) {
		super(Hipercub.class, nom, clau, valor);
	}
	public Hipercadena(Hipercadena pare) {
		super(pare);
	}
	public Hipercadena(Hipercadena pare, Integer clau, Character valor) {
		super(Hipercub.class, pare, clau, valor);
	}
	public Hipercadena(Hipercadena déu, String nom) {
		super(déu, nom);
	}
	public Hipercadena(Hipercadena déu, String nom, Integer clau, Character valor) {
		super(Hipercub.class, déu, nom, clau, valor);
	}
	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		switch (manament.obtenirManament()) {
		case Manament.VIU:
			Hipercadena hipercadena = (Hipercadena) manament.getSource();
			permutarFill(hipercadena, hipercadena.obtenirFill());
			break;

		default:
			break;
		}
	}

	@Override
	public int compareTo(Anyell<Character, Integer> o) {
		int resultat = Integer.compare(obtenirClau(), o.obtenirValor());
		if(resultat < 0) {
			comparador(obtenirClau(), obtenirValor());
		} else {
			comparador(o.obtenirValor(), o.obtenirClau());
		}
		return resultat;
	}
}