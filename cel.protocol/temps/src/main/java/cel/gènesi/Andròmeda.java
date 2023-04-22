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
public class Andròmeda extends Dona<AlfaCentauri,Sol> {

	private static final long serialVersionUID = -7857749006423635285L;
	
	@Override
	public String obtenirNom() {
		StringBuilder stringBuilder = new StringBuilder();
		for(Anyell<AlfaCentauri,Sol> anyell : this) {
			stringBuilder.append(anyell.obtenirClau().obtenirNom());
		}
		return stringBuilder.toString();
	}
	@Override
	public AlfaCentauri getKey() {
		return obtenirClau();
	}
	@Override
	public AlfaCentauri setKey(AlfaCentauri key) {
		return establirClau(key);
	}
	@Override
	public Sol getValue() {
		return obtenirValor();
	}
	@Override
	public Sol setValue(Sol value) {
		return establirValor(value);
	}
	@XmlElement
	@Override
	public Andròmeda getEntry() {
		return obtenirPassat() == obtenirDéu() ? null : (Andròmeda) obtenirPassat();
	}

	public Andròmeda() {
		super();
	}
	public Andròmeda(Paritat paritat) {
		super(paritat);
	}
	public Andròmeda(Class<ViaLàctia> classeFill, Paritat paritat) {
		super(classeFill, paritat);
	}
	public Andròmeda(Andròmeda pare) {
		super(pare);
	}
	public Andròmeda(Andròmeda pare, AlfaCentauri clau, Sol valor) {
		super(ViaLàctia.class, pare, clau, valor);
		valor.afegirTestimoni(this);
		clau.afegirTestimoni(obtenirFill());
	}
	public Andròmeda(Andròmeda déu, Paritat paritat) {
		super(déu, paritat);
	}
	public Andròmeda(Andròmeda déu,	Paritat paritat, AlfaCentauri clau, Sol valor) {
		super(ViaLàctia.class, déu, paritat, clau, valor);
		valor.afegirTestimoni(this);
		clau.afegirTestimoni(obtenirFill());
	}

	@Override
	public int compareTo(Anyell<Sol,AlfaCentauri> o) {
		obtenirClau().comparador(new Sol(AlfaCentauri.class, o.obtenirParitat().oposada())).compara(obtenirClau(), o.obtenirClau());
		Anyell<Terra,Mar> anyell = obtenirClau().comparador().font();
		comparador((Sol) anyell, (AlfaCentauri) anyell.obtenirFill());
		return 0;
	}
	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		if(manament.getSource() instanceof Andròmeda) {
			Andròmeda andròmeda = (Andròmeda) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				andròmeda.permutarFill(obtenirPassat(), obtenirFutur());
				break;
			case Manament.MOR:
				andròmeda.alliberar();
				establirValor(andròmeda.obtenirClau(), andròmeda.obtenirValor());
				break;
			default:
				return;
			}
		}
	}
	@Override
	public void run() {
		getValue().run(); 
		super.run();
	}
}
