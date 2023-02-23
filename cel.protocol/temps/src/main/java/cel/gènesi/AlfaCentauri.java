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
public class AlfaCentauri extends Dona<Mar, Terra> {

	private static final long serialVersionUID = -8847168674216359054L;
	
	@Override
	public String obtenirNom() {
		return obtenirClau().obtenirNom();
	}	@Override
	@XmlElement
	public Mar getKey() {
		return obtenirClau();
	}
	@Override
	public Mar setKey(Mar key) {
		return establirClau(key);
	}
	@Override
	@XmlElement
	public Terra getValue() {
		return obtenirValor();
	}
	@Override
	public Terra setValue(Terra value) {
		return establirValor(value);
	}
	@Override
	@XmlElement
	public AlfaCentauri getEntry() {
		return obtenirPassat() == obtenirDéu() ? null : (AlfaCentauri) obtenirPassat();
	}

	public AlfaCentauri() {
		super();
	}
	public AlfaCentauri(Paritat paritat) {
		super(paritat);
	}
	public AlfaCentauri(Paritat paritat, Mar clau, Terra valor) {
		super(Sol.class, paritat, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public AlfaCentauri(AlfaCentauri pare) {
		super(pare);
	}
	public AlfaCentauri(AlfaCentauri pare, Mar clau, Terra valor) {
		super(Sol.class, pare, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public AlfaCentauri(AlfaCentauri déu, Paritat paritat) {
		super(déu, paritat);
	}
	public AlfaCentauri(AlfaCentauri déu, Paritat paritat, Mar clau, Terra valor) {
		super(Sol.class, déu, paritat, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}

	@Override
	public int compareTo(Anyell<Terra, Mar> o) {
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
			case Manament.GÈNESI:
				if(sócDéu()) {
					execute(establirClau(terra, (Mar) terra.obtenirFill()));
				}
				break;
			default:
				break;
			}
		}
		else if(manament.getSource() instanceof AlfaCentauri) {
			AlfaCentauri alfaCentauri = (AlfaCentauri) manament.getSource();
			switch (manament.obtenirManament()) {
				case Manament.VIU:
					alfaCentauri.comparador(alfaCentauri.getValue(), alfaCentauri.getKey()).compara(alfaCentauri, obtenirFill());
					Anyell<Terra,Mar> anyell = alfaCentauri.comparador().font();
					donarManament(new Ordre(anyell));
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