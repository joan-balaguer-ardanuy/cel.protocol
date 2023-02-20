package cel.gènesi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import cel.Anyell;
import cel.Ordre;

@XmlRootElement
@XmlType(propOrder={"key", "value", "entry"})
public class Espaitemps extends Home<Supercúmul,Interestellar> {

	private static final long serialVersionUID = -6584596587851190399L;
	@Override
	@XmlElement
	public Supercúmul getKey() {
		return obtenirClau();
	}
	@Override
	public Supercúmul setKey(Supercúmul key) {
		return establirClau(key);
	}
	@Override
	@XmlElement
	public Interestellar getValue() {
		return obtenirValor();
	}
	@Override
	public Interestellar setValue(Interestellar value) {
		return establirValor(value);
	}
	@Override
	@XmlElement
	public Espaitemps getEntry() {
		return obtenirPassat() == obtenirDéu() ? null : (Espaitemps) obtenirPassat();
	}

	public Espaitemps() {
		super();
	}
	public Espaitemps(String nom) {
		super(nom);
	}
	public Espaitemps(String nom, Supercúmul clau, Interestellar valor) {
		super(Hiperespai.class, nom, clau, valor);
	}
	public Espaitemps(Espaitemps pare) {
		super(pare);
	}
	public Espaitemps(Espaitemps pare, Supercúmul clau, Interestellar valor) {
		super(Hiperespai.class, pare, clau, valor);
	}
	public Espaitemps(Espaitemps déu, String nom) {
		super(déu, nom);
	}
	public Espaitemps(Espaitemps déu, String nom, Supercúmul clau, Interestellar valor) {
		super(Hiperespai.class, déu, nom, clau, valor);
	}

	@Override
	public void esdeveniment(Ordre manament) {
		// TODO Auto-generated method stub
		super.esdeveniment(manament);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}
	@Override
	public int compareTo(Anyell<Interestellar, Supercúmul> o) {
		// TODO Auto-generated method stub
		return 0;
	}
}