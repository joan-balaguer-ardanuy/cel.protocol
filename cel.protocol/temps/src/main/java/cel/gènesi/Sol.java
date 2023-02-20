package cel.gènesi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import cel.Anyell;
import cel.Manament;
import cel.Ordre;

@XmlRootElement
@XmlType(propOrder={"key", "value", "entry"})
public class Sol extends Home<Terra,Mar> {

	private static final long serialVersionUID = 7129534749982938093L;
	
	@Override
	@XmlElement
	public Terra getKey() {
		return obtenirClau();
	}
	@Override
	public Terra setKey(Terra key) {
		return establirClau(key);
	}
	@Override
	@XmlElement
	public Mar getValue() {
		return obtenirValor();
	}
	@Override
	public Mar setValue(Mar value) {
		return establirValor(value);
	}
	@Override
	@XmlElement
	public Sol getEntry() {
		return obtenirPassat() == obtenirDéu() ? null : (Sol) obtenirPassat();
	}

	public Sol() {
		super();
	}
	public Sol(String nom) {
		super(nom);
	}
	public Sol(String nom, Terra clau, Mar valor) {
		super(AlfaCentauri.class, nom, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public Sol(Sol pare) {
		super(pare);
	}
	public Sol(Sol pare, Terra clau, Mar valor) {
		super(AlfaCentauri.class, pare, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public Sol(Sol déu, String nom) {
		super(déu, nom);
	}
	public Sol(Sol déu, String nom, Terra clau, Mar valor) {
		super(AlfaCentauri.class, déu, nom, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}

	@Override
	public int compareTo(Anyell<Mar, Terra> o) {
		obtenirClau().comparador().compara(obtenirClau(), o.obtenirClau());
		Anyell<Operó,Poliploide> anyell = obtenirClau().comparador().font();
		comparador((Terra) anyell, (Mar) anyell.obtenirFill());
		return 0;
	}
	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		if(manament.getSource() instanceof Terra) {
			Terra terra = (Terra) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				obtenirClau().comparador().compara(terra, obtenirValor());
				Anyell<Operó,Poliploide> anyell = obtenirClau().comparador().font();
				establir((Terra) anyell, (Mar) anyell.obtenirFill());
				break;
			case Manament.MOR:
				terra.alliberar();
				obtenirValor().establirValor(terra.obtenirValor(), terra.obtenirClau());
				break;
			default:
				return;
			}
		}
		else if(manament.getSource() instanceof Sol) {
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				Sol sol = (Sol) manament.getSource();
				permutarFill(sol, sol.obtenirFill());
				break;
			default:
				break;
			}
		}
	}
	@Override
	public void run() {
//		getKey().run();
		for(Anyell<Operó,Poliploide> anyell : getKey()) {
			anyell.run();
		}
		super.run();
	}
}