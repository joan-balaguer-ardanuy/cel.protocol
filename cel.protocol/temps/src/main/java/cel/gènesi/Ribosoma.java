package cel.gènesi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import cel.Anyell;
import cel.Ordre;

@XmlRootElement
@XmlType(propOrder={"key", "value", "entry"})
public class Ribosoma extends Home<Cromosoma, Diploide> {

	/**
	 * 360967584403725750L
	 */
	private static final long serialVersionUID = 360967584403725750L;
	@Override
	@XmlElement
	public Cromosoma getKey() {
		return obtenirClau();
	}
	@Override
	public Cromosoma setKey(Cromosoma key) {
		return establirClau(key);
	}
	@Override
	@XmlElement
	public Diploide getValue() {
		return obtenirValor();
	}
	@Override
	public Diploide setValue(Diploide value) {
		return establirValor(value);
	}
	@Override
	@XmlElement
	public Ribosoma getEntry() {
		return obtenirPassat() == obtenirDéu() ? null : (Ribosoma) obtenirPassat();
	}
	
	public Ribosoma() {
		super();
	}
	public Ribosoma(String nom) {
		super(nom);
	}
	public Ribosoma(String nom, Cromosoma clau, Diploide valor) {
		super(Tetraploide.class, nom, clau, valor);
	}
	public Ribosoma(Ribosoma pare) {
		super(pare);
	}
	public Ribosoma(Ribosoma pare, Cromosoma clau, Diploide valor) {
		super(Tetraploide.class, pare, clau, valor);
	}
	public Ribosoma(Ribosoma  déu, String nom) {
		super(déu, nom);
	}
	public Ribosoma(Ribosoma déu, String nom, Cromosoma clau, Diploide valor) {
		super(Tetraploide.class, déu, nom, clau, valor);
	}

	@Override
	public int compareTo(Anyell<Diploide, Cromosoma> o) {
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