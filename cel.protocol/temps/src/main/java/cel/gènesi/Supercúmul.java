package cel.gènesi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import cel.Anyell;
import cel.Manament;
import cel.Ordre;

@XmlRootElement
@XmlType(propOrder={"key", "value", "entry"})
public class Supercúmul extends Home<ViaLàctia, Andròmeda> {

	private static final long serialVersionUID = -5993795274429700449L;

	@Override
	@XmlElement
	public ViaLàctia getKey() {
		return obtenirClau();
	}
	@Override
	public ViaLàctia setKey(ViaLàctia key) {
		return establirClau(key);
	}
	@Override
	@XmlElement
	public Andròmeda getValue() {
		return obtenirValor();
	}
	@Override
	public Andròmeda setValue(Andròmeda value) {
		return establirValor(value);
	}
	@Override
	@XmlElement
	public Supercúmul getEntry() {
		return obtenirPassat() == obtenirDéu() ? null : (Supercúmul) obtenirPassat();
	}

	public Supercúmul() {
		super();
	}
	public Supercúmul(String nom) {
		super(nom);
	}
	public Supercúmul(String nom, ViaLàctia clau, Andròmeda valor) {
		super(Interestellar.class, nom, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public Supercúmul(Supercúmul pare) {
		super(pare);
	}
	public Supercúmul(Supercúmul pare, ViaLàctia clau, Andròmeda valor) {
		super(Interestellar.class, pare, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public Supercúmul(Supercúmul déu, String nom) {
		super(déu, nom);
	}
	public Supercúmul(Supercúmul déu, String nom, ViaLàctia clau, Andròmeda valor) {
		super(Interestellar.class, déu, nom, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}

	@Override
	public int compareTo(Anyell<Andròmeda, ViaLàctia> o) {
		obtenirClau().comparador().compara(obtenirClau(), o.obtenirClau());
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
			case Manament.VIU:
				obtenirClau().comparador().compara(viaLàctia, obtenirValor());
				Anyell<Sol,AlfaCentauri> anyell = obtenirClau().comparador().font();
				establir((ViaLàctia) anyell, (Andròmeda) anyell.obtenirFill());
				break;
			case Manament.MOR:
				viaLàctia.alliberar();
				obtenirValor().establirValor(viaLàctia.obtenirValor(), viaLàctia.obtenirClau());
				break;
			default:
				return;
			}
		}
		else if(manament.getSource() instanceof Supercúmul) {
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				Supercúmul supercúmul = (Supercúmul) manament.getSource();
				permutarFill(supercúmul, supercúmul.obtenirFill());
				break;
			default:
				break;
			}
		}
	}
	@Override
	public void run() {
//		getKey().run();
		for(Anyell<Sol,AlfaCentauri> anyell : getKey()) {
			anyell.run();
		}
		super.run();
	}
}