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
public class Interestellar extends Dona<Andròmeda, ViaLàctia> {

	private static final long serialVersionUID = 1778472751644972454L;

	@Override
	public String obtenirNom() {
		StringBuilder stringBuilder = new StringBuilder();
		for(Anyell<Andròmeda,ViaLàctia> anyell : this) {
			stringBuilder.append(anyell.obtenirClau().obtenirNom());
		}
		return stringBuilder.toString();
	}
	@Override
	@XmlElement
	public Andròmeda getKey() {
		return obtenirClau();
	}
	@Override
	public Andròmeda setKey(Andròmeda key) {
		return establirClau(key);
	}
	@Override
	@XmlElement
	public ViaLàctia getValue() {
		return obtenirValor();
	}
	@Override
	public ViaLàctia setValue(ViaLàctia value) {
		return establirValor(value);
	}
	@Override
	@XmlElement
	public Interestellar getEntry() {
		return obtenirPassat() == obtenirDéu() ? null : (Interestellar) obtenirPassat();
	}

	public Interestellar() {
		super();
	}
	public Interestellar(Paritat paritat) {
		super(paritat);
	}
	public Interestellar(Paritat paritat, Andròmeda clau, ViaLàctia valor) {
		super(Supercúmul.class, paritat, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public Interestellar(Interestellar pare) {
		super(pare);
	}
	public Interestellar(Interestellar pare, Andròmeda clau, ViaLàctia valor) {
		super(Supercúmul.class, pare, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public Interestellar(Interestellar déu, Paritat paritat) {
		super(déu, paritat);
	}
	public Interestellar(Interestellar déu,	Paritat paritat, Andròmeda clau, ViaLàctia valor) {
		super(Supercúmul.class, déu, paritat, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}

	@Override
	public int compareTo(Anyell<ViaLàctia, Andròmeda> o) {
		obtenirClau().comparador(obtenirClau().obtenirValor(), obtenirClau().obtenirClau()).compara(obtenirClau(), o.obtenirClau());
		Anyell<Sol,AlfaCentauri> anyell = obtenirClau().comparador().font();
		comparador((ViaLàctia) anyell, (Andròmeda) anyell.obtenirFill());
		return 0;
	}
	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		if(manament.getSource() instanceof ViaLàctia) {
			ViaLàctia viaLàctia = (ViaLàctia) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.GÈNESI:
				if(sócDéu()) {
					execute(establirClau(viaLàctia, (Andròmeda) viaLàctia.obtenirFill()));
				}
				break;
			default:
				break;
			}
		}
		else if(manament.getSource() instanceof Interestellar) {
			Interestellar interestellar = (Interestellar) manament.getSource();
			switch (manament.obtenirManament()) {
				case Manament.VIU:
					comparador(obtenirValor(), obtenirClau()).compara(interestellar.obtenirDéu(), obtenirMareDeDéu());
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