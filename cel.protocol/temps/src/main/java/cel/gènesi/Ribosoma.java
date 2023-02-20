package cel.gènesi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import cel.Anyell;
import cel.Manament;
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
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public Ribosoma(Ribosoma pare) {
		super(pare);
	}
	public Ribosoma(Ribosoma pare, Cromosoma clau, Diploide valor) {
		super(Tetraploide.class, pare, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public Ribosoma(Ribosoma  déu, String nom) {
		super(déu, nom);
	}
	public Ribosoma(Ribosoma déu, String nom, Cromosoma clau, Diploide valor) {
		super(Tetraploide.class, déu, nom, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}

	@Override
	public int compareTo(Anyell<Diploide, Cromosoma> o) {
		obtenirClau().comparador().compara(obtenirClau(), o.obtenirClau());
		Anyell<Genomapa,Haploide> anyell = obtenirClau().comparador().font();
		comparador((Cromosoma) anyell, (Diploide) anyell.obtenirFill());
		return 0;
	}
	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		if(manament.getSource() instanceof Cromosoma) {
			Cromosoma cromosoma = (Cromosoma) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				obtenirClau().comparador().compara(cromosoma, obtenirValor());
				Anyell<Genomapa,Haploide> anyell = obtenirClau().comparador().font();
				establir((Cromosoma) anyell, (Diploide) anyell.obtenirFill());
				break;
			case Manament.MOR:
				cromosoma.alliberar();
				obtenirValor().establirValor(cromosoma.obtenirValor(), cromosoma.obtenirClau());
				break;
			default:
				return;
			}
		}
		else if(manament.getSource() instanceof Ribosoma) {
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				Ribosoma ribosoma = (Ribosoma) manament.getSource();
				permutarFill(ribosoma, ribosoma.obtenirFill());
				break;
			default:
				break;
			}
		}
	}
	@Override
	public void run() {
//		getKey().run();
		for(Anyell<Genomapa,Haploide> anyell : getKey()) {
			anyell.run();
		}
		super.run();
	}
}