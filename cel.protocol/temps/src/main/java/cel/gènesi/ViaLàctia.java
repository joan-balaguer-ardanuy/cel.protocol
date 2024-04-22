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
	public Sol getKey() {
		return obtenirClau();
	}
	@Override
	public Sol setKey(Sol key) {
		return establirClau(key);
	}
	@Override
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
		this(Andròmeda.class, Paritat.aleatòria());
	}
	public ViaLàctia(Paritat paritat) {
		super(paritat);
	}
	public ViaLàctia(Class<Andròmeda> classeFill, Paritat paritat) {
		super(Andròmeda.class, paritat);
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
		obtenirClau().comparador(new AlfaCentauri()).compara(obtenirClau(), o.obtenirClau());
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
			default:
				return;
			}
		}
	}
	@Override
	public void run() {
		obtenirClau().run();
		super.run();
	}
}