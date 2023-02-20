package cel.gènesi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import cel.Anyell;
import cel.Manament;
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
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public Operó(Operó pare) {
		super(pare);
	}
	public Operó(Operó pare, Ribosoma clau, Tetraploide valor) {
		super(Poliploide.class, pare, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public Operó(Operó déu, String nom) {
		super(déu, nom);
	}
	public Operó(Operó déu, String nom, Ribosoma clau, Tetraploide valor) {
		super(Poliploide.class, déu, nom, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}

	@Override
	public int compareTo(Anyell<Tetraploide, Ribosoma> o) {
		obtenirClau().comparador().compara(obtenirClau(), o.obtenirClau());
		Anyell<Cromosoma,Diploide> anyell = obtenirClau().comparador().font();
		comparador((Ribosoma) anyell, (Tetraploide) anyell.obtenirFill());
		return 0;
	}
	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		if(manament.getSource() instanceof Ribosoma) {
			Ribosoma ribosoma = (Ribosoma) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				obtenirClau().comparador().compara(ribosoma, obtenirValor());
				Anyell<Cromosoma,Diploide> anyell = obtenirClau().comparador().font();
				establir((Ribosoma) anyell, (Tetraploide) anyell.obtenirFill());
				break;
			case Manament.MOR:
				ribosoma.alliberar();
				obtenirValor().establirValor(ribosoma.obtenirValor(), ribosoma.obtenirClau());
				break;
			default:
				return;
			}
		}
		else if(manament.getSource() instanceof Operó) {
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				Operó oberó = (Operó) manament.getSource();
				permutarFill(oberó, oberó.obtenirFill());
				break;
			default:
				break;
			}
		}
	}
	@Override
	public void run() {
//		getKey().run();
		for(Anyell<Cromosoma,Diploide> anyell : getKey()) {
			anyell.run();
		}
		super.run();
	}
}