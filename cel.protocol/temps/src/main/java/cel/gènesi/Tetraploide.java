package cel.gènesi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import cel.Anyell;
import cel.Ordre;

@XmlRootElement
@XmlType(propOrder={"key", "value", "entry"})
public class Tetraploide extends Dona<Diploide, Cromosoma> {

	/**
	 * -287450272848358106L
	 */
	private static final long serialVersionUID = -287450272848358106L;

	@Override
	@XmlElement
	public Diploide getKey() {
		return obtenirClau();
	}
	@Override
	public Diploide setKey(Diploide key) {
		return establirClau(key);
	}
	@Override
	@XmlElement
	public Cromosoma getValue() {
		return obtenirValor();
	}
	@Override
	public Cromosoma setValue(Cromosoma value) {
		return establirValor(value);
	}
	@Override
	@XmlElement
	public Tetraploide getEntry() {
		return obtenirPassat() == obtenirDéu() ? null : (Tetraploide) obtenirPassat();
	}
	
	public Tetraploide() {
		super();
	}
	public Tetraploide(String nom) {
		super(nom);
	}
	public Tetraploide(String nom, Diploide clau, Cromosoma valor) {
		super(Ribosoma.class, nom, clau, valor);
	}
	public Tetraploide(Tetraploide pare) {
		super(pare);
	}
	public Tetraploide(Tetraploide pare, Diploide clau, Cromosoma valor) {
		super(Ribosoma.class, pare, clau, valor);
	}
	public Tetraploide(Tetraploide déu, String nom) {
		super(déu, nom);
	}
	public Tetraploide(Tetraploide déu, String nom, Diploide clau, Cromosoma valor) {
		super(Ribosoma.class, déu, nom, clau, valor);
	}
	@Override
	public int compareTo(Anyell<Cromosoma, Diploide> o) {
		return 0;
	}
	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
	}
	@Override
	public void run() {
		super.run();
	}
}