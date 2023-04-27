package cel.gènesi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import cel.Anyell;
import cel.Paritat;

@XmlRootElement
@XmlType(propOrder={"key", "value", "entry"})
public class Hipercadena extends Dona<Integer,Character> {

	private static final long serialVersionUID = 5271465276828675216L;
	
	@Override
	public String obtenirNom() {
		StringBuilder stringBuilder = new StringBuilder();
		for(Anyell<Integer,Character> entrada : this) {
			stringBuilder.append(entrada.obtenirValor());
		}
		return stringBuilder.toString();
	}
	@Override
	public Integer getKey() {
		return obtenirClau();
	}
	@Override
	public Integer setKey(Integer key) {
		return establirClau(key);
	}
	@Override
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
	public Hipercadena(Paritat paritat) {
		super(paritat); 
	}
	public Hipercadena(Class<Hipercub> classeFill, Paritat paritat) {
		super(classeFill, paritat);
	}
	public Hipercadena(Hipercadena pare) {
		super(pare);
	}
	public Hipercadena(Hipercadena pare, Integer clau, Character valor) {
		super(Hipercub.class, pare, clau, valor);
	}
	public Hipercadena(Hipercadena déu, Paritat paritat) {
		super(déu, paritat);
	}
	public Hipercadena(Hipercadena déu, Paritat paritat, Integer clau, Character valor) {
		super(Hipercub.class, déu, paritat, clau, valor);
	}
	@Override
	public synchronized int compareTo(Anyell<Character, Integer> o) {
		switch (obtenirParitat()) {
		case XY:
			if(obtenirClau() < o.obtenirValor()) {
				comparador(obtenirValor(), obtenirClau());
				return -1;
			} else {
				comparador(o.obtenirClau(), o.obtenirValor());
				return 1;
			}
		default:
			if(obtenirClau() > o.obtenirValor()) {
				comparador(obtenirValor(), obtenirClau());
				return -1;
			} else {
				comparador(o.obtenirClau(), o.obtenirValor());
				return 1;
			}
		}
	}
	@Override
	public void run() {
		try {
			Thread.sleep(obtenirClau());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		super.run();
	}
}