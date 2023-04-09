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
public class ViaLàctia extends Home<Sol, AlfaCentauri> {

	private static final long serialVersionUID = -1257304010498648715L;

	@Override
	public String obtenirNom() {
		StringBuilder stringBuilder = new StringBuilder();
		for(Anyell<Sol,AlfaCentauri> anyell : this) {
			stringBuilder.append(anyell.obtenirClau().obtenirNom());
		}
		return stringBuilder.toString();
	}
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
	public ViaLàctia(Paritat paritat) {
		super(paritat);
	}
	public ViaLàctia(Paritat paritat, Sol clau, AlfaCentauri valor) {
		super(Andròmeda.class, paritat, clau, valor);
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
	public ViaLàctia(ViaLàctia déu, Paritat paritat) {
		super(déu, paritat);
	}
	public ViaLàctia(ViaLàctia déu, Paritat paritat, Sol clau, AlfaCentauri valor) {
		super(Andròmeda.class, déu, paritat, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}

	@Override
	public int compareTo(Anyell<AlfaCentauri, Sol> o) {
		obtenirClau().comparador(obtenirClau().obtenirValor(), obtenirClau().obtenirClau()).compara(obtenirClau(), o.obtenirClau());
		Anyell<Mar,Terra> anyell = obtenirClau().comparador().font();
		comparador((AlfaCentauri) anyell, (Sol) anyell.obtenirFill());
		return 0;
	}
	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		if(manament.getSource() instanceof ViaLàctia) {
			ViaLàctia viaLàctia = (ViaLàctia) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				viaLàctia.permutarFill(obtenirPassat(), obtenirFutur());
				break;
			case Manament.MOR:
				viaLàctia.alliberar();
				establirValor(viaLàctia.obtenirClau(), viaLàctia.obtenirValor());
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