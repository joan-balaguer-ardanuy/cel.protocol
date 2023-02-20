package cel.gènesi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import cel.Anyell;
import cel.Manament;
import cel.Ordre;

@XmlRootElement
@XmlType(propOrder={"key", "value", "entry"})
public class Andròmeda extends Dona<AlfaCentauri,Sol> {

	private static final long serialVersionUID = -7857749006423635285L;
	
	@Override
	@XmlElement
	public AlfaCentauri getKey() {
		return obtenirClau();
	}
	@Override
	public AlfaCentauri setKey(AlfaCentauri key) {
		return establirClau(key);
	}
	@Override
	@XmlElement
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
	public Andròmeda(String nom) {
		super(nom);
	}
	public Andròmeda(String nom, AlfaCentauri clau, Sol valor) {
		super(ViaLàctia.class, nom, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public Andròmeda(Andròmeda pare) {
		super(pare);
	}
	public Andròmeda(Andròmeda pare, AlfaCentauri clau, Sol valor) {
		super(ViaLàctia.class, pare, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public Andròmeda(Andròmeda déu, String nom) {
		super(déu, nom);
	}
	public Andròmeda(Andròmeda déu,	String nom, AlfaCentauri clau, Sol valor) {
		super(ViaLàctia.class, déu, nom, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}

	@Override
	public int compareTo(Anyell<Sol,AlfaCentauri> o) {
		obtenirClau().comparador().compara(obtenirClau(), o.obtenirClau());
		Anyell<Mar,Terra> anyell = obtenirClau().comparador().font();
		comparador((AlfaCentauri) anyell, (Sol) anyell.obtenirFill());
		return 0;
	}
	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		if(manament.getSource() instanceof AlfaCentauri) {
			AlfaCentauri alfaCentauri = (AlfaCentauri) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				obtenirClau().comparador().compara(alfaCentauri, obtenirValor());
				Anyell<Mar,Terra> anyell = obtenirClau().comparador().font();
				establirValor((AlfaCentauri) anyell, (Sol) anyell.obtenirFill());
				break;
			case Manament.MOR:
				alfaCentauri.alliberar();
				obtenirValor().establirValor(alfaCentauri.obtenirValor(), alfaCentauri.obtenirClau());
				break;
			default:
				return;
			}
		}
		else if(manament.getSource() instanceof Andròmeda) {
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				Andròmeda andròmeda = (Andròmeda) manament.getSource();
				permutarFill(andròmeda, andròmeda.obtenirFill());
				break;
			default:
				break;
			}
		}
	}
	@Override
	public void run() {
//		getKey().run();
		for(Anyell<Mar,Terra> anyell : getKey()) {
			anyell.run();
		}
		super.run();
	}
}
