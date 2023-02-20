package cel.gènesi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import cel.Anyell;
import cel.Ordre;

@XmlRootElement
@XmlType(propOrder={"key", "value", "entry"})
public class Operó extends Home<Ribosoma,Tetraploide> {

	private static final long serialVersionUID = -5755798448107627330L;

	@Override
	@XmlElement
	public Ribosoma getKey() {
		return obtenirClau();
	}
	@Override
	public Ribosoma setKey(Ribosoma key) {
		return establirClau(key);
	}
	@Override
	@XmlElement
	public Tetraploide getValue() {
		return obtenirValor();
	}
	@Override
	public Tetraploide setValue(Tetraploide value) {
		return establirValor(value);
	}
	@Override
	@XmlElement
	public Operó getEntry() {
		return obtenirPassat() == obtenirDéu() ? null : (Operó) obtenirPassat();
	}
	
	public Operó() {
		super();
	}
	public Operó(String nom) {
		super(nom);
	}
	public Operó(String nom, Ribosoma clau, Tetraploide valor) {
		super(Poliploide.class, nom, clau, valor);
	}
	public Operó(Operó pare) {
		super(pare);
	}
	public Operó(Operó pare, Ribosoma clau, Tetraploide valor) {
		super(Poliploide.class, pare, clau, valor);
	}
	public Operó(Operó déu, String nom) {
		super(déu, nom);
	}
	public Operó(Operó déu, String nom, Ribosoma clau, Tetraploide valor) {
		super(Poliploide.class, déu, nom, clau, valor);
	}

	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
	}
	@Override
	public void run() {
		super.run();
	}
	@Override
	public int compareTo(Anyell<Tetraploide, Ribosoma> o) {
		return 0;
	}
}