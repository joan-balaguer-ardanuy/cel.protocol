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
	public String obtenirNom() {
		StringBuilder stringBuilder = new StringBuilder();
		for(Anyell<Cromosoma,Diploide> anyell : this) {
			stringBuilder.append(anyell.obtenirClau().obtenirNom());
		}
		return stringBuilder.toString();
	}
	@Override
	public Cromosoma getKey() {
		return obtenirClau();
	}
	@Override
	public Cromosoma setKey(Cromosoma key) {
		return establirClau(key);
	}
	@Override
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
	public Ribosoma(Class<Tetraploide> classeFill, Paritat paritat) {
		super(classeFill, paritat);
	}
	public Ribosoma(Ribosoma pare) {
		super(pare);
	}
	public Ribosoma(Ribosoma pare, Cromosoma clau, Diploide valor) {
		super(Tetraploide.class, pare, clau, valor);
		valor.afegirTestimoni(this);
		clau.afegirTestimoni(obtenirFill());
	}
	public Ribosoma(Ribosoma  déu, Paritat paritat) {
		super(déu, paritat);
	}
	public Ribosoma(Ribosoma déu, Paritat paritat, Cromosoma clau, Diploide valor) {
		super(Tetraploide.class, déu, paritat, clau, valor);
		valor.afegirTestimoni(this);
		clau.afegirTestimoni(obtenirFill());
	}

	@Override
	public int compareTo(Anyell<Diploide, Cromosoma> o) {
		obtenirClau().comparador(new Diploide(Cromosoma.class, o.obtenirParitat().oposada())).compara(obtenirClau(), o.obtenirClau());
		Anyell<Haploide,Genomapa> anyell = obtenirClau().comparador().font();
		comparador((Diploide) anyell, (Cromosoma) anyell.obtenirFill());
		return 0;
	}
	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		if(manament.getSource() instanceof Genomapa) {
			Genomapa genomapa = (Genomapa) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.GÈNESI:
				if(sócDéu()) {
					Cromosoma cromosoma = new Cromosoma(Diploide.class, genomapa.obtenirParitat());
					cromosoma.establirValor(genomapa, (Haploide) genomapa.obtenirFill());
					donarManament(new Ordre(cromosoma));
				}
				break;
			default:
				break;
			}
		} else if(manament.getSource() instanceof Diploide) {
			Diploide diploide = (Diploide) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				if(!sócDéu()) {
					obtenirValor().comparador(new Cromosoma(Diploide.class, Paritat.aleatòria())).compara(diploide, obtenirClau());
					donarManament(new Ordre(obtenirValor().comparador().font()));
				}
				break;
			default:
				break;
			}
		}
	}
	@Override
	public void run() {
		obtenirValor().run();
		super.run();
	}
}