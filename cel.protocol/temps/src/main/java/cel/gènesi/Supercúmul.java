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
public class Supercúmul extends Home<ViaLàctia, Andròmeda> {

	private static final long serialVersionUID = -5993795274429700449L;

	@Override
	public String obtenirNom() {
		StringBuilder stringBuilder = new StringBuilder();
		for(Anyell<ViaLàctia,Andròmeda> anyell : this) {
			stringBuilder.append(anyell.obtenirClau().obtenirNom());
		}
		return stringBuilder.toString();
	}
	@Override
	public ViaLàctia getKey() {
		return obtenirClau();
	}
	@Override
	public ViaLàctia setKey(ViaLàctia key) {
		return establirClau(key);
	}
	@Override
	public Andròmeda getValue() {
		return obtenirValor();
	}
	@Override
	public Andròmeda setValue(Andròmeda value) {
		return establirValor(value);
	}
	@Override
	@XmlElement
	public Supercúmul getEntry() {
		return obtenirPassat() == obtenirDéu() ? null : (Supercúmul) obtenirPassat();
	}

	public Supercúmul() {
		super();
	}
	public Supercúmul(Paritat paritat) {
		super(paritat);
	}
	public Supercúmul(Class<Interestellar> classeFill, Paritat paritat) {
		super(Interestellar.class, paritat);
	}
	public Supercúmul(Supercúmul pare) {
		super(pare);
	}
	public Supercúmul(Supercúmul pare, ViaLàctia clau, Andròmeda valor) {
		super(Interestellar.class, pare, clau, valor);
		valor.afegirTestimoni(this);
		clau.afegirTestimoni(obtenirFill());
	}
	public Supercúmul(Supercúmul déu, Paritat paritat) {
		super(déu, paritat);
	}
	public Supercúmul(Supercúmul déu, Paritat paritat, ViaLàctia clau, Andròmeda valor) {
		super(Interestellar.class, déu, paritat, clau, valor);
		valor.afegirTestimoni(this);
		clau.afegirTestimoni(obtenirFill());
	}

	@Override
	public int compareTo(Anyell<Andròmeda, ViaLàctia> o) {
		obtenirClau().comparador(new Andròmeda(ViaLàctia.class, o.obtenirParitat().oposada())).compara(obtenirClau(), o.obtenirClau());
		Anyell<AlfaCentauri,Sol> anyell = obtenirClau().comparador().font();
		comparador((Andròmeda) anyell, (ViaLàctia) anyell.obtenirFill());
		return 0;
	}
	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		if(manament.getSource() instanceof AlfaCentauri) {
			switch (manament.obtenirManament()) {
			case Manament.GÈNESI:
				AlfaCentauri alfaCentauri = (AlfaCentauri) manament.getSource();
				Andròmeda andròmeda = new Andròmeda(ViaLàctia.class, Paritat.aleatòria());
				andròmeda.establirValor(alfaCentauri, (Sol) alfaCentauri.obtenirFill());
				donarManament(new Ordre(andròmeda));
				break;
			default:
				break;
			}
		}
		else if(manament.getSource() instanceof Supercúmul) {
			Supercúmul supercúmul = (Supercúmul) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				supercúmul.permutarFill(obtenirPassat(), obtenirFutur());
				break;
			case Manament.MOR:
				supercúmul.alliberar();
				break;
			default:
				return;
			}
		} else if(manament.getSource() instanceof Andròmeda) {
			Andròmeda andròmeda = (Andròmeda) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.MOR:
				if (!sócDéu() && andròmeda.sócDéu()) {
					obtenirValor().comparador(new ViaLàctia(Andròmeda.class, Paritat.aleatòria())).compara(andròmeda, obtenirClau());
					ViaLàctia viaLàctia = (ViaLàctia) obtenirValor().comparador().font();
					obtenirMareDeDéu().establirClau(viaLàctia, (Andròmeda) viaLàctia.obtenirFill());
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