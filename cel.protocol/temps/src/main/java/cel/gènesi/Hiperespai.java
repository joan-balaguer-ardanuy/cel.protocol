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
public class Hiperespai extends Dona<Interestellar,Supercúmul> {

	private static final long serialVersionUID = -7763397311549664178L;

	@Override
	public String obtenirNom() {
		StringBuilder stringBuilder = new StringBuilder();
		for(Anyell<Interestellar,Supercúmul> anyell : this) {
			stringBuilder.append(anyell.obtenirClau().obtenirNom());
		}
		return stringBuilder.toString();
	}
	@Override
	public Interestellar getKey() {
		return obtenirClau();
	}
	@Override
	public Interestellar setKey(Interestellar key) {
		return establirClau(key);
	}
	@Override
	public Supercúmul getValue() {
		return obtenirValor();
	}
	@Override
	public Supercúmul setValue(Supercúmul value) {
		return establirValor(value);
	}
	@Override
	@XmlElement
	public Hiperespai getEntry() {
		return obtenirPassat() == obtenirDéu() ? null : (Hiperespai) obtenirPassat();
	}

	public Hiperespai() {
		this(Espaitemps.class, Paritat.aleatòria());
	}
	public Hiperespai(Paritat paritat) {
		super(paritat);
	}
	public Hiperespai(Class<Espaitemps> classeFill, Paritat paritat) {
		super(Espaitemps.class, paritat);
	}
	public Hiperespai(Hiperespai pare) {
		super(pare);
	}
	public Hiperespai(Hiperespai pare, Interestellar clau, Supercúmul valor) {
		super(Espaitemps.class, pare, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public Hiperespai(Hiperespai déu, Paritat paritat) {
		super(déu, paritat);
	}
	public Hiperespai(Hiperespai déu, Paritat paritat, Interestellar clau, Supercúmul valor) {
		super(Espaitemps.class, déu, paritat, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}

	@Override
	public int compareTo(Anyell<Supercúmul, Interestellar> o) {
		obtenirClau().comparador(new Supercúmul()).compara(obtenirClau(), o.obtenirClau());
		Anyell<ViaLàctia,Andròmeda> anyell = obtenirClau().comparador().font();
		comparador((Supercúmul) anyell, (Interestellar) anyell.obtenirFill());
		return 0;
	}
	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		if(manament.getSource() instanceof Supercúmul) {
			switch (manament.obtenirManament()) {
			case Manament.GÈNESI:
				if(sócDéu()) {
					Supercúmul supercúmul = (Supercúmul) manament.getSource();
					obtenirMareDeDéu().establirValor(supercúmul, (Interestellar) supercúmul.obtenirFill());
				}
				break;
			default:
				break;
			}
		} else if(manament.getSource() instanceof Hiperespai) {
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				Hiperespai hiperespai = (Hiperespai) manament.getSource();
				comparador(new Espaitemps()).compara(hiperespai, obtenirMareDeDéu());
				donarManament(new Ordre(comparador().font()));
				break;
			default:
				break;
			}
		}
	}
	@Override
	public void run() {
		obtenirClau().run();
		super.run();
	}
}