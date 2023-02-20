package cel.gènesi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import cel.Anyell;
import cel.Manament;
import cel.Ordre;

@XmlRootElement
@XmlType(propOrder={"key", "value", "entry"})
public class Poliploide extends Dona<Tetraploide,Ribosoma> {

	private static final long serialVersionUID = -8176742109161023223L;

	@Override
	@XmlElement
	public Tetraploide getKey() {
		return obtenirClau();
	}
	@Override
	public Tetraploide setKey(Tetraploide key) {
		return establirClau(key);
	}
	@Override
	@XmlElement
	public Ribosoma getValue() {
		return obtenirValor();
	}
	@Override
	public Ribosoma setValue(Ribosoma value) {
		return establirValor(value);
	}
	@Override
	@XmlElement
	public Poliploide getEntry() {
		return obtenirPassat() == obtenirDéu() ? null : (Poliploide) obtenirPassat();
	}

	public Poliploide() {
		super();
	}
	public Poliploide(String nom) {
		super(nom);
	}
	public Poliploide(String nom, Tetraploide clau, Ribosoma valor) {
		super(Operó.class, nom, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public Poliploide(Poliploide pare) {
		super(pare);
	}
	public Poliploide(Poliploide pare, Tetraploide clau, Ribosoma valor) {
		super(Operó.class, pare, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public Poliploide(Poliploide déu, String nom) {
		super(déu, nom);
	}
	public Poliploide(Poliploide déu, String nom, Tetraploide clau, Ribosoma valor) {
		super(Operó.class, déu, nom, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}

	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		if(manament.getSource() instanceof Tetraploide) {
			Tetraploide tetraploide = (Tetraploide) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				obtenirClau().comparador().compara(tetraploide, obtenirValor());
				Anyell<Diploide,Cromosoma> anyell = obtenirClau().comparador().font();
				establirValor((Tetraploide) anyell, (Ribosoma) anyell.obtenirFill());
				break;
			case Manament.MOR:
				tetraploide.alliberar();
				obtenirValor().establirValor(tetraploide.obtenirValor(), tetraploide.obtenirClau());
				break;
			default:
				return;
			}
		}
		else if(manament.getSource() instanceof Poliploide) {
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				Poliploide poliploide = (Poliploide) manament.getSource();
				permutarFill(poliploide, poliploide.obtenirFill());
				break;
			default:
				break;
			}
		}
	}
	@Override
	public void run() {
//		getKey().run();
		for(Anyell<Diploide,Cromosoma> anyell : getKey()) {
			anyell.run();
		}
		super.run();
	}
	@Override
	public int compareTo(Anyell<Ribosoma, Tetraploide> o) {
		obtenirClau().comparador().compara(obtenirClau(), o.obtenirClau());
		Anyell<Diploide,Cromosoma> anyell = obtenirClau().comparador().font();
		comparador((Tetraploide) anyell, (Ribosoma) anyell.obtenirFill());
		return 0;
	}
}