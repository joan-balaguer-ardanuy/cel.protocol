package cel.gènesi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import cel.Anyell;
import cel.Manament;
import cel.Ordre;
import cel.Paritat;

@XmlRootElement
@XmlType(propOrder={"key", "value", "entry"})
public class Hipercub extends Home<Character,Integer> {

	private static final long serialVersionUID = 7927408443586096486L;
	
	@Override
	@XmlElement
	public String obtenirNom() {
		StringBuilder stringBuilder = new StringBuilder();
		for(Anyell<Character,Integer> entrada : this) {
			stringBuilder.append(entrada.obtenirClau());
		}
		return stringBuilder.toString();
	}
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
	public Hipercub(Paritat paritat) {
		super(paritat);
	}
	public Hipercub(Paritat paritat, Character clau, Integer valor) {
		super(Hipercadena.class, paritat, clau, valor);
	}
	public Hipercub(Hipercub pare) {
		super(pare);
	}
	public Hipercub(Hipercub pare, Character clau, Integer valor) {
		super(Hipercadena.class, pare, clau, valor);
	}
	public Hipercub(Hipercub déu, Paritat paritat) {
		super(déu, paritat);
	}
	public Hipercub(Hipercub déu, Paritat paritat, Character clau, Integer valor) {
		super(Hipercadena.class, déu, paritat, clau, valor);
	}
	@Override
	public synchronized void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		if(manament.getSource() instanceof Hipercub) {
			Hipercub hipercub = (Hipercub) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				hipercub.permutarFill(obtenirPassat(), obtenirFutur());	
				break;
			case Manament.MOR:
				hipercub.alliberar();
				establirClau(hipercub.obtenirValor(), hipercub.obtenirClau());
				break;
			default:
				return;
			}
		}
	}
	@Override
	public synchronized int compareTo(Anyell<Integer, Character> o) {
		switch (obtenirParitat()) {
		case XX:
			if (obtenirValor() > o.obtenirClau()) {
				comparador(obtenirValor(), obtenirClau());
				return 1;
			} else {
				comparador(o.obtenirClau(), o.obtenirValor());
				return -1;
			}
		default:
			if (obtenirValor() < o.obtenirClau()) {
				comparador(obtenirValor(), obtenirClau());
				return 1;
			} else {
				comparador(o.obtenirClau(), o.obtenirValor());
				return -1;
			}
		}
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