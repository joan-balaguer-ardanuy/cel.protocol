package cel.gènesi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import cel.Anyell;
import cel.Ordre;

@XmlRootElement
@XmlType(propOrder={"key", "value", "entry"})
public class Hiperespai extends Dona<Interestellar,Supercúmul> {

	private static final long serialVersionUID = -7763397311549664178L;

	@Override
	@XmlElement
	public Interestellar getKey() {
		return obtenirClau();
	}
	@Override
	public Interestellar setKey(Interestellar key) {
		return establirClau(key);
	}
	@Override
	@XmlElement
	public Supercúmul getValue() {
		return obtenirValor();
	}
	@Override
	public Supercúmul setValue(Supercúmul value) {
		return establirValor(value);
	}
	@Override
	@XmlElement
	public Hiperespai getEntry() {
		return obtenirPassat() == obtenirDéu() ? null : (Hiperespai) obtenirPassat();
	}

	public Hiperespai() {
		super();
	}
	public Hiperespai(String nom) {
		super(nom);
	}
	public Hiperespai(String nom, Interestellar clau, Supercúmul valor) {
		super(Espaitemps.class, nom, clau, valor);
	}
	public Hiperespai(Hiperespai pare) {
		super(pare);
	}
	public Hiperespai(Hiperespai pare, Interestellar clau, Supercúmul valor) {
		super(Espaitemps.class, pare, clau, valor);
	}
	public Hiperespai(Hiperespai déu, String nom) {
		super(déu, nom);
	}
	public Hiperespai(Hiperespai déu, String nom, Interestellar clau, Supercúmul valor) {
		super(Espaitemps.class, déu, nom, clau, valor);
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
	public int compareTo(Anyell<Supercúmul, Interestellar> o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
