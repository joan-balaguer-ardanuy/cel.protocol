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
public class Sol extends Home<Terra,Mar> {

	private static final long serialVersionUID = 7129534749982938093L;
	
	@Override
	public String obtenirNom() {
		StringBuilder stringBuilder = new StringBuilder();
		for(Anyell<Terra,Mar> anyell : this) {
			stringBuilder.append(anyell.obtenirClau().obtenirNom());
		}
		return stringBuilder.toString();
	}
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
	public Sol(Paritat paritat) {
		super(paritat);
	}
	public Sol(Paritat paritat, Terra clau, Mar valor) {
		super(AlfaCentauri.class, paritat, clau, valor);
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
	public Sol(Sol déu, Paritat paritat) {
		super(déu, paritat);
	}
	public Sol(Sol déu, Paritat paritat, Terra clau, Mar valor) {
		super(AlfaCentauri.class, déu, paritat, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}

	@Override
	public int compareTo(Anyell<Mar, Terra> o) {
		obtenirClau().comparador().compara(obtenirClau(), o.obtenirClau());
		Anyell<Poliploide,Operó> anyell = obtenirClau().comparador().font();
		comparador((Mar) anyell, (Terra) anyell.obtenirFill());
		return 0;
	}
	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		if(manament.getSource() instanceof Sol) {
			Sol operó = (Sol) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				operó.permutarFill(obtenirPassat(), obtenirFutur());
				break;
			case Manament.MOR:
				operó.alliberar();
				establirValor(operó.obtenirClau(), operó.obtenirValor());
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