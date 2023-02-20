package cel.gènesi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import cel.Anyell;
import cel.Ordre;

@XmlRootElement
@XmlType(propOrder={"key", "value", "entry"})
public class Diploide
	extends Dona<Haploide,Genomapa> {

	private static final long serialVersionUID = 1392928931896245647L;
	@Override
	@XmlElement
	public Haploide getKey() {
		return obtenirClau();
	}
	@Override
	public Haploide setKey(Haploide key) {
		return establirClau(key);
	}
	@Override
	@XmlElement
	public Genomapa getValue() {
		return obtenirValor();
	}
	@Override
	public Genomapa setValue(Genomapa value) {
		return establirValor(value);
	}
	@Override
	@XmlElement
	public Diploide getEntry() {
		return obtenirPassat() == obtenirDéu() ? null : (Diploide) obtenirPassat();
	}
	
	public Diploide() {
		super();
	}
	public Diploide(String nom) {
		super(nom);
	}
	public Diploide(String nom, Haploide clau, Genomapa valor) {
		super(Cromosoma.class, nom, clau, valor);
	}
	public Diploide(Diploide pare) {
		super(pare);
	}
	public Diploide(Diploide pare, Haploide clau, Genomapa valor) {
		super(Cromosoma.class, pare, clau, valor);
	}
	public Diploide(Diploide déu, String nom) {
		super(déu, nom);
	}
	public Diploide(Diploide déu, String nom, Haploide clau, Genomapa valor) {
		super(Cromosoma.class, déu, nom, clau, valor);
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
	public int compareTo(Anyell<Genomapa,Haploide> o) {
		return 0;
	}
}