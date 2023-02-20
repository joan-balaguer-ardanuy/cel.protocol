package cel.gènesi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import cel.Anyell;
import cel.Manament;
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
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public Tetraploide(Tetraploide pare) {
		super(pare);
	}
	public Tetraploide(Tetraploide pare, Diploide clau, Cromosoma valor) {
		super(Ribosoma.class, pare, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public Tetraploide(Tetraploide déu, String nom) {
		super(déu, nom);
	}
	public Tetraploide(Tetraploide déu, String nom, Diploide clau, Cromosoma valor) {
		super(Ribosoma.class, déu, nom, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	@Override
	public int compareTo(Anyell<Cromosoma, Diploide> o) {
		obtenirClau().comparador().compara(obtenirClau(), o.obtenirClau());
		Anyell<Haploide,Genomapa> anyell = obtenirClau().comparador().font();
		comparador((Diploide) anyell, (Cromosoma) anyell.obtenirFill());
		return 0;
	}
	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		if(manament.getSource() instanceof Diploide) {
			Diploide diploide = (Diploide) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				obtenirClau().comparador().compara(diploide, obtenirValor());
				Anyell<Haploide,Genomapa> anyell = obtenirClau().comparador().font();
				establirValor((Diploide) anyell, (Cromosoma) anyell.obtenirFill());
				break;
			case Manament.MOR:
				diploide.alliberar();
				obtenirValor().establirValor(diploide.obtenirValor(), diploide.obtenirClau());
				break;
			default:
				return;
			}
		}
		else if(manament.getSource() instanceof Tetraploide) {
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				Tetraploide tetraploide = (Tetraploide) manament.getSource();
				permutarFill(tetraploide, tetraploide.obtenirFill());
				break;
			default:
				break;
			}
		}
	}
	@Override
	public void run() {
//		getKey().run();
		for(Anyell<Haploide,Genomapa> anyell : getKey()) {
			anyell.run();
		}
		super.run();
	}
}