package cel.gènesi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import cel.Anyell;
import cel.Manament;
import cel.Ordre;

@XmlRootElement
@XmlType(propOrder={"key", "value", "entry"})
public class Hipercub extends Home<Character,Integer> {

	private static final long serialVersionUID = 7927408443586096486L;

	@Override
	@XmlElement
	public Character getKey() {
		return obtenirClau();
	}
	@Override
	public Character setKey(Character key) {
		return establirClau(key);
	}
	@Override
	@XmlElement
	public Integer getValue() {
		return obtenirValor();
	}
	@Override
	public Integer setValue(Integer value) {
		return establirValor(value);
	}
	@Override
	@XmlElement
	public Hipercub getEntry() {
		return obtenirPassat() == obtenirDéu() ? null : (Hipercub) obtenirPassat();
	}
	
	public Hipercub() {
		super();
	}
	public Hipercub(String nom) {
		super(nom);
	}
	public Hipercub(String nom, Character clau, Integer valor) {
		super(Hipercadena.class, nom, clau, valor);
	}
	public Hipercub(Hipercub pare) {
		super(pare);
	}
	public Hipercub(Hipercub pare, Character clau, Integer valor) {
		super(Hipercadena.class, pare, clau, valor);
	}
	public Hipercub(Hipercub déu, String nom) {
		super(déu, nom);
	}
	public Hipercub(Hipercub déu, String nom, Character clau, Integer valor) {
		super(Hipercadena.class, déu, nom, clau, valor);
	}
	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		System.out.println("Hipercub.class: " + manament.getSource().getClass());
		switch (manament.obtenirManament()) {
		case Manament.VIU:
			Hipercub hipercub = (Hipercub) manament.getSource();
			permutarFill(hipercub, hipercub.obtenirFill());
			break;
		default:
			return;
		}
	}
	
	@Override
	public int compareTo(Anyell<Integer,Character> o) {
		int resultat = Character.compare(obtenirClau(), o.obtenirValor());
		if(resultat > 0) {
			comparador(obtenirClau(), obtenirValor());
		} else {
			comparador(o.obtenirValor(), o.obtenirClau());
		}		
		return resultat;
	}
	@Override
	public void run() {
		try {
			Thread.sleep(obtenirValor());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		super.run();
	}
}