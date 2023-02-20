package cel.gènesi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import cel.Anyell;
import cel.Ordre;

@XmlRootElement
@XmlType(propOrder={"key", "value", "entry"})
public class Cromosoma
	extends Home<Genomapa,Haploide> {

	/**
	 * 521019328663282200L
	 */
	private static final long serialVersionUID = -521019328663282200L;
	
	@Override
	@XmlElement
	public Genomapa getKey() {
		return obtenirClau();
	}
	@Override
	public Genomapa setKey(Genomapa key) {
		return establirClau(key);
	}
	@XmlElement
	@Override
	public Haploide getValue() {
		return obtenirValor();
	}
	@Override
	public Haploide setValue(Haploide value) {
		return establirValor(value);
	}
	@Override
	@XmlElement
	public Cromosoma getEntry() {
		return obtenirPassat() == obtenirDéu() ? null : (Cromosoma) obtenirPassat();
	}
	
	public Cromosoma() {
		super();
	}
	public Cromosoma(String nom) {
		super(nom);
	}
	public Cromosoma(String nom, Genomapa clau, Haploide valor) {
		super(Diploide.class, nom, clau, valor);
	}
	public Cromosoma(Cromosoma pare) {
		super(pare);
	}
	public Cromosoma(Cromosoma pare, Genomapa clau, Haploide valor) {
		super(Diploide.class, pare, clau, valor);
	}
	public Cromosoma(Cromosoma déu, String nom) {
		super(déu, nom);
	}
	public Cromosoma(Cromosoma déu, String nom, Genomapa clau, Haploide valor) {
		super(Diploide.class, déu, nom, clau, valor);
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
	public int compareTo(Anyell<Haploide,Genomapa> o) {
		return 0;
	}
}