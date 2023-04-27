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
public class Tetraploide extends Dona<Diploide, Cromosoma> {

	/**
	 * -287450272848358106L
	 */
	private static final long serialVersionUID = -287450272848358106L;
	
	@Override
	public String obtenirNom() {
		StringBuilder stringBuilder = new StringBuilder();
		for(Anyell<Diploide,Cromosoma> anyell : this) {
			stringBuilder.append(anyell.obtenirClau().obtenirNom());
		}
		return stringBuilder.toString();
	}
	@Override
	public Diploide getKey() {
		return obtenirClau();
	}
	@Override
	public Diploide setKey(Diploide key) {
		return establirClau(key);
	}
	@Override
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
	public Tetraploide(Paritat paritat) {
		super(paritat);
	}
	public Tetraploide(Class<Ribosoma> classeFill, Paritat paritat) {
		super(classeFill, paritat);
	}
	public Tetraploide(Tetraploide pare) {
		super(pare);
	}
	public Tetraploide(Tetraploide pare, Diploide clau, Cromosoma valor) {
		super(Ribosoma.class, pare, clau, valor);
		valor.afegirTestimoni(this);
		clau.afegirTestimoni(obtenirFill());
	}
	public Tetraploide(Tetraploide déu, Paritat paritat) {
		super(déu, paritat);
	}
	public Tetraploide(Tetraploide déu, Paritat paritat, Diploide clau, Cromosoma valor) {
		super(Ribosoma.class, déu, paritat, clau, valor);
		valor.afegirTestimoni(this);
		clau.afegirTestimoni(obtenirFill());
	}
	@Override
	public int compareTo(Anyell<Cromosoma, Diploide> o) {
		obtenirClau().comparador(new Cromosoma(Diploide.class, o.obtenirParitat().oposada())).compara(obtenirClau(), o.obtenirClau());
		Anyell<Genomapa,Haploide> anyell = obtenirClau().comparador().font();
		comparador((Cromosoma) anyell, (Diploide) anyell.obtenirFill());
		return 0;
	}
	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		if(manament.getSource() instanceof Haploide) {
			switch (manament.obtenirManament()) {
			case Manament.GÈNESI:
				Haploide haploide = (Haploide) manament.getSource();
				Diploide diploide = new Diploide(Cromosoma.class, Paritat.aleatòria());
				diploide.establirValor(haploide, (Genomapa) haploide.obtenirFill());
				donarManament(new Ordre(diploide));
				break;
			default:
				break;
			}
		} 
		else if(manament.getSource() instanceof Tetraploide) {
			Tetraploide tetraploide = (Tetraploide) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				tetraploide.permutarFill(obtenirPassat(), obtenirFutur());
				break;
			case Manament.MOR:
				tetraploide.alliberar();
				break;
			default:
				return;
			}
		} else if(manament.getSource() instanceof Cromosoma) {
			Cromosoma cromosoma = (Cromosoma) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.MOR:
				if (!sócDéu() && cromosoma.sócDéu()) {
					obtenirValor().comparador(new Diploide(Cromosoma.class, Paritat.aleatòria())).compara(cromosoma, obtenirClau());
					Diploide diploide = (Diploide) obtenirValor().comparador().font();
					obtenirMareDeDéu().establirClau(diploide, (Cromosoma) diploide.obtenirFill());
				}
				break;
			default:
				break;
			}
		}
	}
	@Override
	public void run() {
		obtenirClau().run();
		super.run();
	}
}