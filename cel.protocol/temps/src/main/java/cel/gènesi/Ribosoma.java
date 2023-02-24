package cel.gènesi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import cel.Anyell;
import cel.Manament;
import cel.Ordre;
import cel.Paritat;

@XmlRootElement
@XmlType(propOrder={"key", "value", "entry"})
public class Ribosoma extends Home<Cromosoma, Diploide> {

	/**
	 * 360967584403725750L
	 */
	private static final long serialVersionUID = 360967584403725750L;
	
	@Override
	@XmlElement
	public String obtenirNom() {
		StringBuilder stringBuilder = new StringBuilder();
		for(Anyell<Cromosoma,Diploide> anyell : this) {
			stringBuilder.append(anyell.obtenirClau().obtenirNom());
		}
		return stringBuilder.toString();
	}
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
	public Ribosoma(Paritat paritat) {
		super(paritat);
	}
	public Ribosoma(Paritat paritat, Cromosoma clau, Diploide valor) {
		super(Tetraploide.class, paritat, clau, valor);
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
	public Ribosoma(Ribosoma  déu, Paritat paritat) {
		super(déu, paritat);
	}
	public Ribosoma(Ribosoma déu, Paritat paritat, Cromosoma clau, Diploide valor) {
		super(Tetraploide.class, déu, paritat, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}

	@Override
	public int compareTo(Anyell<Diploide, Cromosoma> o) {
		obtenirClau().comparador().compara(obtenirClau(), o.obtenirClau());
		Anyell<Haploide,Genomapa> anyell = obtenirClau().comparador().font();
		comparador((Diploide) anyell, (Cromosoma) anyell.obtenirFill());
		return 0;
	}
	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		if(manament.getSource() instanceof Ribosoma) {
			Ribosoma ribosoma = (Ribosoma) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				ribosoma.permutarFill(obtenirPassat(), obtenirFutur());
				break;
			case Manament.MOR:
				ribosoma.alliberar();
				establirValor(ribosoma.obtenirClau(), ribosoma.obtenirValor());
				break;
			default:
				return;
			}
		}
	}
	@Override
	public void run() {
		getKey().run();
		super.run();
	}
}