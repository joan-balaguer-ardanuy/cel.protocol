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
public class Mar extends Dona<Poliploide,Operó> {

	private static final long serialVersionUID = -4777160976356802960L;

	@Override
	public String obtenirNom() {
		StringBuilder stringBuilder = new StringBuilder();
		for(Anyell<Poliploide,Operó> anyell : this) {
			stringBuilder.append(anyell.obtenirClau().obtenirNom());
		}
		return stringBuilder.toString();
	}
	@Override
	public Poliploide getKey() {
		return obtenirClau();
	}
	@Override
	public Poliploide setKey(Poliploide key) {
		return establirClau(key);
	}
	@Override
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
		this(Terra.class, Paritat.aleatòria());
	}
	public Mar(Paritat paritat) {
		super(paritat);
	}
	public Mar(Class<Terra> classeFill, Paritat paritat) {
		super(classeFill, paritat);
	}
	public Mar(Mar pare) {
		super(pare);
	}
	public Mar(Mar pare, Poliploide clau, Operó valor) {
		super(Terra.class, pare, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public Mar(Mar déu, Paritat paritat) {
		super(déu, paritat);
	}
	public Mar(Mar déu, Paritat paritat, Poliploide clau, Operó valor) {
		super(Terra.class, déu, paritat, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}

	@Override
	public int compareTo(Anyell<Operó, Poliploide> o) {
		obtenirClau().comparador(new Operó()).compara(obtenirClau(), o.obtenirClau());
		Anyell<Ribosoma,Tetraploide> anyell = obtenirClau().comparador().font();
		comparador((Operó) anyell, (Poliploide) anyell.obtenirFill());
		return 0;
	}
	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		if(manament.getSource() instanceof Ribosoma) {
			Ribosoma ribosoma = (Ribosoma) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.GÈNESI:
				if(sócDéu()) {
					Operó operó = new Operó();
					operó.establirValor(ribosoma, (Tetraploide) ribosoma.obtenirFill());
					donarManament(new Ordre(operó));
				}
				break;
			default:
				break;
			}
		} else if(manament.getSource() instanceof Poliploide) {
			Poliploide poliploide = (Poliploide) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				if (!sócDéu()) {
					obtenirClau().comparador(new Operó()).compara(poliploide, obtenirValor());
					donarManament(new Ordre(obtenirClau().comparador().font()));
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