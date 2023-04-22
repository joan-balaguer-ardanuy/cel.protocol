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
public class Espaitemps extends Home<Supercúmul,Interestellar> {

	private static final long serialVersionUID = -6584596587851190399L;
	
	@Override
	public String obtenirNom() {
		StringBuilder stringBuilder = new StringBuilder();
		for(Anyell<Supercúmul,Interestellar> anyell : this) {
			stringBuilder.append(anyell.obtenirClau().obtenirNom());
		}
		return stringBuilder.toString();
	}
	@Override
	public Supercúmul getKey() {
		return obtenirClau();
	}
	@Override
	public Supercúmul setKey(Supercúmul key) {
		return establirClau(key);
	}
	@Override
	public Interestellar getValue() {
		return obtenirValor();
	}
	@Override
	public Interestellar setValue(Interestellar value) {
		return establirValor(value);
	}
	@Override
	@XmlElement
	public Espaitemps getEntry() {
		return obtenirPassat() == obtenirDéu() ? null : (Espaitemps) obtenirPassat();
	}

	public Espaitemps() {
		super();
	}
	public Espaitemps(Paritat paritat) {
		super(paritat);
	}
	public Espaitemps(Class<Hiperespai> classeFill, Paritat paritat) {
		super(classeFill, paritat);
	}
	public Espaitemps(Espaitemps pare) {
		super(pare);
	}
	public Espaitemps(Espaitemps pare, Supercúmul clau, Interestellar valor) {
		super(Hiperespai.class, pare, clau, valor);
		valor.afegirTestimoni(this);
		clau.afegirTestimoni(obtenirFill());
	}
	public Espaitemps(Espaitemps déu, Paritat paritat) {
		super(déu, paritat);
	}
	public Espaitemps(Espaitemps déu, Paritat paritat, Supercúmul clau, Interestellar valor) {
		super(Hiperespai.class, déu, paritat, clau, valor);
		valor.afegirTestimoni(this);
		clau.afegirTestimoni(obtenirFill());
	}

	@Override
	public int compareTo(Anyell<Interestellar, Supercúmul> o) {
		obtenirClau().comparador(new Interestellar(Supercúmul.class, o.obtenirParitat().oposada())).compara(obtenirClau(), o.obtenirClau());
		Anyell<Andròmeda,ViaLàctia> anyell = obtenirClau().comparador().font();
		comparador((Interestellar) anyell, (Supercúmul) anyell.obtenirFill());
		return 0;
	}
	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		if(manament.getSource() instanceof ViaLàctia) {
			ViaLàctia viaLàctia = (ViaLàctia) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.GÈNESI:
				if(sócDéu()) {
					Supercúmul supercúmul = new Supercúmul(Interestellar.class, viaLàctia.obtenirParitat());
					supercúmul.establirValor(viaLàctia, (Andròmeda) viaLàctia.obtenirFill());
					donarManament(new Ordre(supercúmul));
				}
				break;
			default:
				break;
			}
		} else if(manament.getSource() instanceof Interestellar) {
			Interestellar interestellar = (Interestellar) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				interestellar.comparador(new Supercúmul(Interestellar.class, Paritat.aleatòria())).compara(interestellar, obtenirClau());
				Supercúmul supercúmul = (Supercúmul) interestellar.comparador().font();
				obtenirMareDeDéu().establirClau(supercúmul, (Interestellar) supercúmul.obtenirFill());
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