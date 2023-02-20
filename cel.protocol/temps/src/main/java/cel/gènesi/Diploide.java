package cel.gènesi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import cel.Anyell;
import cel.Manament;
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
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public Diploide(Diploide pare) {
		super(pare);
	}
	public Diploide(Diploide pare, Haploide clau, Genomapa valor) {
		super(Cromosoma.class, pare, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public Diploide(Diploide déu, String nom) {
		super(déu, nom);
	}
	public Diploide(Diploide déu, String nom, Haploide clau, Genomapa valor) {
		super(Cromosoma.class, déu, nom, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	@Override
	public int compareTo(Anyell<Genomapa,Haploide> o) {
		obtenirClau().comparador().compara(obtenirClau(), o.obtenirClau());
		Anyell<Hipercadena,Hipercub> anyell = obtenirClau().comparador().font();
		comparador((Haploide) anyell, (Genomapa) anyell.obtenirFill());
		return 0;
	}
	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		if(manament.getSource() instanceof Haploide) {
			Haploide genomapa = (Haploide) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				obtenirClau().comparador().compara(genomapa, obtenirValor());
				Anyell<Hipercadena,Hipercub> anyell = obtenirClau().comparador().font();
				establirValor((Haploide) anyell, (Genomapa) anyell.obtenirFill());
				break;
			case Manament.MOR:
				genomapa.alliberar();
				obtenirValor().establirValor(genomapa.obtenirValor(), genomapa.obtenirClau());
				break;
			default:
				return;
			}
		}
		else if(manament.getSource() instanceof Diploide) {
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				Diploide diploide = (Diploide) manament.getSource();
				permutarFill(diploide, diploide.obtenirFill());
				break;
			default:
				break;
			}
		}
	}
	@Override
	public void run() {
		for(Anyell<Hipercadena,Hipercub> anyell : getKey()) {
			anyell.run();
		}
		super.run();
	}
}