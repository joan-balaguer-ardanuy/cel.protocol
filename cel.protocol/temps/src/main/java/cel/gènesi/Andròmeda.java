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
	public Andròmeda(Paritat paritat, AlfaCentauri clau, Sol valor) {
		super(ViaLàctia.class, paritat, clau, valor);
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
	public Andròmeda(Andròmeda déu, Paritat paritat) {
		super(déu, paritat);
	}
	public Andròmeda(Andròmeda déu,	Paritat paritat, AlfaCentauri clau, Sol valor) {
		super(ViaLàctia.class, déu, paritat, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}

	@Override
	public int compareTo(Anyell<Sol,AlfaCentauri> o) {
		obtenirClau().comparador(obtenirClau().obtenirValor(), obtenirClau().obtenirClau()).compara(obtenirClau(), o.obtenirClau());
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
			case Manament.GÈNESI:
				if(sócDéu()) {
					execute(establirClau(sol, (AlfaCentauri) sol.obtenirFill()));
				}
				break;
			default:
				break;
			}
		}
		else if(manament.getSource() instanceof Andròmeda) {
			Andròmeda andròmeda = (Andròmeda) manament.getSource();
			switch (manament.obtenirManament()) {
				case Manament.VIU:
					comparador(obtenirValor(), obtenirClau()).compara(andròmeda.obtenirDéu(), obtenirMareDeDéu());
					donarManament(new Ordre(comparador().font()));
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
