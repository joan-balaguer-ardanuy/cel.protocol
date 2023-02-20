package cel.gènesi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import cel.Anyell;
import cel.Manament;
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
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public Cromosoma(Cromosoma pare) {
		super(pare);
	}
	public Cromosoma(Cromosoma pare, Genomapa clau, Haploide valor) {
		super(Diploide.class, pare, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public Cromosoma(Cromosoma déu, String nom) {
		super(déu, nom);
	}
	public Cromosoma(Cromosoma déu, String nom, Genomapa clau, Haploide valor) {
		super(Diploide.class, déu, nom, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	@Override
	public int compareTo(Anyell<Haploide,Genomapa> o) {
		obtenirClau().comparador().compara(obtenirClau(), o.obtenirClau());
		Anyell<Hipercub,Hipercadena> anyell = obtenirClau().comparador().font();
		comparador((Genomapa) anyell, (Haploide) anyell.obtenirFill());
		return 0;
	}
	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		if(manament.getSource() instanceof Genomapa) {
			Genomapa genomapa = (Genomapa) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				obtenirClau().comparador().compara(genomapa, obtenirValor());
				Anyell<Hipercub,Hipercadena> anyell = obtenirClau().comparador().font();
				establir((Genomapa) anyell, (Haploide) anyell.obtenirFill());
				break;
			case Manament.MOR:
				genomapa.alliberar();
				obtenirValor().establirValor(genomapa.obtenirValor(), genomapa.obtenirClau());
				break;
			default:
				return;
			}
		}
		else if(manament.getSource() instanceof Cromosoma) {
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				Cromosoma cromosoma = (Cromosoma) manament.getSource();
				permutarFill(cromosoma, cromosoma.obtenirFill());
				break;
			default:
				break;
			}
		}
	}
	@Override
	public void run() {
		for(Anyell<Hipercub,Hipercadena> anyell : getKey()) {
			anyell.run();
		}
		super.run();
	}
}