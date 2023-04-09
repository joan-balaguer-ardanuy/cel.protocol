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
	public Mar(Paritat paritat) {
		super(paritat);
	}
	public Mar(Paritat paritat, Poliploide clau, Operó valor) {
		super(Terra.class, paritat, clau, valor);
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
		obtenirClau().comparador(obtenirClau().obtenirValor(), obtenirClau().obtenirClau()).compara(obtenirClau(), o.obtenirClau());
		Anyell<Ribosoma,Tetraploide> anyell = obtenirClau().comparador().font();
		comparador((Operó) anyell, (Poliploide) anyell.obtenirFill());
		return 0;
	}
	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		if(manament.getSource() instanceof Operó) {
			Operó operó = (Operó) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.GÈNESI:
				if(sócDéu()) {
					execute(establirClau(operó, (Poliploide) operó.obtenirFill()));
				}
				break;
			default:
				break;
			}
		}
		else if(manament.getSource() instanceof Mar) {
			Mar mar = (Mar) manament.getSource();
			switch (manament.obtenirManament()) {
				case Manament.VIU:
					comparador(obtenirValor(), obtenirClau()).compara(mar.obtenirDéu(), obtenirMareDeDéu());
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