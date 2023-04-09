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
	public Tetraploide(Paritat paritat) {
		super(paritat);
	}
	public Tetraploide(Paritat paritat, Diploide clau, Cromosoma valor) {
		super(Ribosoma.class, paritat, clau, valor);
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
	public Tetraploide(Tetraploide déu, Paritat paritat) {
		super(déu, paritat);
	}
	public Tetraploide(Tetraploide déu, Paritat paritat, Diploide clau, Cromosoma valor) {
		super(Ribosoma.class, déu, paritat, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	@Override
	public int compareTo(Anyell<Cromosoma, Diploide> o) {
		obtenirClau().comparador(obtenirClau().obtenirValor(), obtenirClau().obtenirClau()).compara(obtenirClau(), o.obtenirClau());
		Anyell<Genomapa,Haploide> anyell = obtenirClau().comparador().font();
		comparador((Cromosoma) anyell, (Diploide) anyell.obtenirFill());
		return 0;
	}
	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		if(manament.getSource() instanceof Cromosoma) {
			Cromosoma entrada = (Cromosoma) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.GÈNESI:
				if(sócDéu()) { 
					execute(establirClau(entrada, (Diploide) entrada.obtenirFill()));
				}
				break;
			default:
				break;
			}
		}
		else if(manament.getSource() instanceof Tetraploide) {
			Tetraploide tretraploide = (Tetraploide) manament.getSource();
			switch (manament.obtenirManament()) {
				case Manament.VIU:
					comparador(obtenirValor(), obtenirClau()).compara(tretraploide.obtenirDéu(), obtenirMareDeDéu());
					donarManament(new Ordre(comparador().font()));
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