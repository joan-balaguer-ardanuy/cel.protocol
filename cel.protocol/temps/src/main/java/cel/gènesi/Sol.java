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
	public Terra getKey() {
		return obtenirClau();
	}
	@Override
	public Terra setKey(Terra key) {
		return establirClau(key);
	}
	@Override
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
	public Sol(Class<AlfaCentauri> classeFill, Paritat paritat) {
		super(classeFill, paritat);
	}
	public Sol(Sol pare) {
		super(pare);
	}
	public Sol(Sol pare, Terra clau, Mar valor) {
		super(AlfaCentauri.class, pare, clau, valor);
		valor.afegirTestimoni(this);
		clau.afegirTestimoni(obtenirFill());
	}
	public Sol(Sol déu, Paritat paritat) {
		super(déu, paritat);
	}
	public Sol(Sol déu, Paritat paritat, Terra clau, Mar valor) {
		super(AlfaCentauri.class, déu, paritat, clau, valor);
		valor.afegirTestimoni(this);
		clau.afegirTestimoni(obtenirFill());
	}

	@Override
	public int compareTo(Anyell<Mar, Terra> o) {
		obtenirClau().comparador(new Mar(Terra.class, o.obtenirParitat().oposada())).compara(obtenirClau(), o.obtenirClau());
		Anyell<Poliploide,Operó> anyell = obtenirClau().comparador().font();
		comparador((Mar) anyell, (Terra) anyell.obtenirFill());
		return 0;
	}
	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		if(manament.getSource() instanceof Poliploide) {
			switch (manament.obtenirManament()) {
			case Manament.GÈNESI:
				Poliploide poliploide = (Poliploide) manament.getSource();
				Mar mar = new Mar(Terra.class, Paritat.aleatòria());
				mar.establirValor(poliploide, (Operó) poliploide.obtenirFill());
				donarManament(new Ordre(mar));
				break;
			default:
				break;
			}
		}
		else if(manament.getSource() instanceof Sol) {
			Sol sol = (Sol) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				sol.permutarFill(obtenirPassat(), obtenirFutur());
				break;
			case Manament.MOR:
				sol.alliberar();
				break;
			default:
				return;
			}
		} else if(manament.getSource() instanceof Mar) {
			Mar mar = (Mar) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.MOR:
				if (!sócDéu() && mar.sócDéu()) {
					obtenirValor().comparador(new Terra(Mar.class, Paritat.aleatòria())).compara(mar, obtenirClau());
					Terra terra = (Terra) obtenirValor().comparador().font();
					obtenirMareDeDéu().establirClau(terra, (Mar) terra.obtenirFill());
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