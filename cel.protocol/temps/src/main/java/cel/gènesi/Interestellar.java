package cel.gènesi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import cel.Anyell;
import cel.Manament;
import cel.Ordre;

@XmlRootElement
@XmlType(propOrder={"key", "value", "entry"})
public class Interestellar extends Dona<Andròmeda, ViaLàctia> {

	private static final long serialVersionUID = 1778472751644972454L;

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
	public Interestellar(String nom) {
		super(nom);
	}
	public Interestellar(String nom, Andròmeda clau, ViaLàctia valor) {
		super(Supercúmul.class, nom, clau, valor);
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
	public Interestellar(Interestellar déu, String nom) {
		super(déu, nom);
	}
	public Interestellar(Interestellar déu,	String nom, Andròmeda clau, ViaLàctia valor) {
		super(Supercúmul.class, déu, nom, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}

	@Override
	public int compareTo(Anyell<ViaLàctia, Andròmeda> o) {
		obtenirClau().comparador().compara(obtenirClau(), o.obtenirClau());
		Anyell<AlfaCentauri,Sol> anyell = obtenirClau().comparador().font();
		comparador((Andròmeda) anyell, (ViaLàctia) anyell.obtenirFill());
		return 0;
	}
	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		if(manament.getSource() instanceof Andròmeda) {
			Andròmeda andròmeda = (Andròmeda) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				obtenirClau().comparador().compara(andròmeda, obtenirValor());
				Anyell<AlfaCentauri,Sol> anyell = obtenirClau().comparador().font();
				establirValor((Andròmeda) anyell, (ViaLàctia) anyell.obtenirFill());
				break;
			case Manament.MOR:
				andròmeda.alliberar();
				obtenirValor().establirValor(andròmeda.obtenirValor(), andròmeda.obtenirClau());
				break;
			default:
				return;
			}
		}
		else if(manament.getSource() instanceof Interestellar) {
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				Interestellar interestel_lar = (Interestellar) manament.getSource();
				permutarFill(interestel_lar, interestel_lar.obtenirFill());
				break;
			default:
				break;
			}
		}
	}
	@Override
	public void run() {
//		getKey().run();
		for(Anyell<AlfaCentauri,Sol> anyell : getKey()) {
			anyell.run();
		}
		super.run();
	}
}