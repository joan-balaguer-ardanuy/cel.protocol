package cel.gènesi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import cel.Anyell;
import cel.Manament;
import cel.Ordre;

@XmlRootElement
@XmlType(propOrder={"key", "value", "entry"})
public class ViaLàctia extends Home<Sol, AlfaCentauri> {

	private static final long serialVersionUID = -1257304010498648715L;

	@Override
	@XmlElement
	public Sol getKey() {
		return obtenirClau();
	}
	@Override
	public Sol setKey(Sol key) {
		return establirClau(key);
	}
	@Override
	@XmlElement
	public AlfaCentauri getValue() {
		return obtenirValor();
	}
	@Override
	public AlfaCentauri setValue(AlfaCentauri value) {
		return establirValor(value);
	}
	@Override
	@XmlElement
	public ViaLàctia getEntry() {
		return obtenirPassat() == obtenirDéu() ? null : (ViaLàctia) obtenirPassat();
	}

	public ViaLàctia() {
		super();
	}
	public ViaLàctia(String nom) {
		super(nom);
	}
	public ViaLàctia(String nom, Sol clau, AlfaCentauri valor) {
		super(Andròmeda.class, nom, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public ViaLàctia(ViaLàctia pare) {
		super(pare);
	}
	public ViaLàctia(ViaLàctia pare, Sol clau, AlfaCentauri valor) {
		super(Andròmeda.class, pare, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public ViaLàctia(ViaLàctia déu, String nom) {
		super(déu, nom);
	}
	public ViaLàctia(ViaLàctia déu, String nom, Sol clau, AlfaCentauri valor) {
		super(Andròmeda.class, déu, nom, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}

	@Override
	public int compareTo(Anyell<AlfaCentauri, Sol> o) {
		obtenirClau().comparador().compara(obtenirClau(), o.obtenirClau());
		Anyell<Terra,Mar> anyell = obtenirClau().comparador().font();
		comparador((Sol) anyell, (AlfaCentauri) anyell.obtenirFill());
		return 0;
	}
	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		if(manament.getSource() instanceof Sol) {
			Sol sol = (Sol) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				obtenirClau().comparador().compara(sol, obtenirValor());
				Anyell<Terra,Mar> anyell = obtenirClau().comparador().font();
				establir((Sol) anyell, (AlfaCentauri) anyell.obtenirFill());
				break;
			case Manament.MOR:
				sol.alliberar();
				obtenirValor().establirValor(sol.obtenirValor(), sol.obtenirClau());
				break;
			default:
				return;
			}
		}
		else if(manament.getSource() instanceof ViaLàctia) {
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				ViaLàctia viaLàctia = (ViaLàctia) manament.getSource();
				permutarFill(viaLàctia, viaLàctia.obtenirFill());
				break;
			default:
				break;
			}
		}
	}
	@Override
	public void run() {
//		getKey().run();
		for(Anyell<Terra,Mar> anyell : getKey()) {
			anyell.run();
		}
		super.run();
	}
}