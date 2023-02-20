package cel.gènesi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import cel.Anyell;
import cel.Manament;
import cel.Ordre;

@XmlRootElement
@XmlType(propOrder={"key", "value", "entry"})
public class Mar extends Dona<Poliploide,Operó> {

	private static final long serialVersionUID = -4777160976356802960L;

	@Override
	@XmlElement
	public Poliploide getKey() {
		return obtenirClau();
	}
	@Override
	public Poliploide setKey(Poliploide key) {
		return establirClau(key);
	}
	@Override
	@XmlElement
	public Operó getValue() {
		return obtenirValor();
	}
	@Override
	public Operó setValue(Operó value) {
		return establirValor(value);
	}
	@Override
	@XmlElement
	public Mar getEntry() {
		return obtenirPassat() == obtenirDéu() ? null : (Mar) obtenirPassat();
	}

	public Mar() {
		super();
	}
	public Mar(String nom) {
		super(nom);
	}
	public Mar(String nom, Poliploide clau, Operó valor) {
		super(Terra.class, nom, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public Mar(Mar pare) {
		super(pare);
	}
	public Mar(Mar pare, Poliploide clau, Operó valor) {
		super(Terra.class, pare, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public Mar(Mar déu, String nom) {
		super(déu, nom);
	}
	public Mar(Mar déu, String nom, Poliploide clau, Operó valor) {
		super(Terra.class, déu, nom, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}

	@Override
	public int compareTo(Anyell<Operó, Poliploide> o) {
		obtenirClau().comparador().compara(obtenirClau(), o.obtenirClau());
		Anyell<Tetraploide,Ribosoma> anyell = obtenirClau().comparador().font();
		comparador((Poliploide) anyell, (Operó) anyell.obtenirFill());
		return 0;
	}
	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		if(manament.getSource() instanceof Poliploide) {
			Poliploide poliploide = (Poliploide) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				obtenirClau().comparador().compara(poliploide, obtenirValor());
				Anyell<Tetraploide,Ribosoma> anyell = obtenirClau().comparador().font();
				establirValor((Poliploide) anyell, (Operó) anyell.obtenirFill());
				break;
			case Manament.MOR:
				poliploide.alliberar();
				obtenirValor().establirValor(poliploide.obtenirValor(), poliploide.obtenirClau());
				break;
			default:
				return;
			}
		}
		else if(manament.getSource() instanceof Mar) {
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				Mar mar = (Mar) manament.getSource();
				permutarFill(mar, mar.obtenirFill());
				break;
			default:
				break;
			}
		}
	}
	@Override
	public void run() {
//		getKey().run();
		for(Anyell<Tetraploide,Ribosoma> anyell : getKey()) {
			anyell.run();
		}
		super.run();
	}
}