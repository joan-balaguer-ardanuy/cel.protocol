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
		super();
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
		valor.afegirTestimoni(this);
		clau.afegirTestimoni(obtenirFill());
	}
	public ViaLàctia(ViaLàctia déu, Paritat paritat) {
		super(déu, paritat);
	}
	public ViaLàctia(ViaLàctia déu, Paritat paritat, Sol clau, AlfaCentauri valor) {
		super(Andròmeda.class, déu, paritat, clau, valor);
		valor.afegirTestimoni(this);
		clau.afegirTestimoni(obtenirFill());
	}

	@Override
	public int compareTo(Anyell<AlfaCentauri, Sol> o) {
		obtenirClau().comparador(new AlfaCentauri(Sol.class, o.obtenirParitat().oposada())).compara(obtenirClau(), o.obtenirClau());
		Anyell<Mar,Terra> anyell = obtenirClau().comparador().font();
		comparador((AlfaCentauri) anyell, (Sol) anyell.obtenirFill());
		return 0;
	}
	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		if(manament.getSource() instanceof Terra) {
			Terra terra = (Terra) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.GÈNESI:
				if(sócDéu()) {
					Sol sol = new Sol(AlfaCentauri.class, terra.obtenirParitat());
					sol.establirValor(terra, (Mar) terra.obtenirFill());
					donarManament(new Ordre(sol));
				}
				break;
			default:
				break;
			}
		} else if(manament.getSource() instanceof AlfaCentauri) {
			AlfaCentauri alfaCentauri = (AlfaCentauri) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				alfaCentauri.comparador(new Sol(AlfaCentauri.class, Paritat.aleatòria())).compara(alfaCentauri, obtenirClau());
				Sol sol = (Sol) alfaCentauri.comparador().font();
				obtenirMareDeDéu().establirClau(sol, (AlfaCentauri) sol.obtenirFill());
				break;
			default:
				break;
			}
		}
	}
	@Override
	public void run() {
		getValue().run();
		super.run();
	}
}