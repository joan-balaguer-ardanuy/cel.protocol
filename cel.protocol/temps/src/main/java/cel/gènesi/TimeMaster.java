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
public class TimeMaster extends Dona<Hiperespai, Espaitemps> {

	private static final long serialVersionUID = 349428359088025708L;

	@Override
	public String obtenirNom() {
		StringBuilder stringBuilder = new StringBuilder();
		for(Anyell<Hiperespai,Espaitemps> anyell : this) {
			stringBuilder.append(anyell.obtenirClau().obtenirNom());
		}
		return stringBuilder.toString();
	}
	@Override
	public Hiperespai getKey() {
		return obtenirClau();
	}
	@Override
	public Hiperespai setKey(Hiperespai key) {
		return establirClau(key);
	}
	@Override
	public Espaitemps getValue() {
		return obtenirValor();
	}
	@Override
	public Espaitemps setValue(Espaitemps value) {
		return establirValor(value);
	}
	@Override
	@XmlElement
	public TimeMaster getEntry() {
		return obtenirPassat() == obtenirDéu() ? null : (TimeMaster) obtenirPassat();
	}
	
	public TimeMaster() {
		this(Aaron.class, Paritat.aleatòria());
	}
	public TimeMaster(Paritat paritat) {
		super(paritat);
	}
	public TimeMaster(Class<Aaron> classeFill, Paritat paritat) {
		super(classeFill, paritat);
	}
	public TimeMaster(TimeMaster pare) {
		super(pare);
	}
	public TimeMaster(TimeMaster pare, Hiperespai clau, Espaitemps valor) {
		super(Aaron.class, pare, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public TimeMaster(TimeMaster déu, Paritat paritat) {
		super(déu, paritat);
	}
	public TimeMaster(TimeMaster déu, Paritat paritat, Hiperespai clau, Espaitemps valor) {
		super(Aaron.class, déu, paritat, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}

	@Override
	public int compareTo(Anyell<Espaitemps, Hiperespai> o) {
		obtenirClau().comparador(new Espaitemps()).compara(obtenirClau(), o.obtenirClau());
		Anyell<Supercúmul,Interestellar> anyell = obtenirClau().comparador().font();
		comparador((Espaitemps) anyell, (Hiperespai) anyell.obtenirFill());
		return 0;
	}
	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		if(manament.getSource() instanceof Espaitemps) {
			switch (manament.obtenirManament()) {
			case Manament.GÈNESI:
				if(sócDéu()) {
					Espaitemps espaitemps = (Espaitemps) manament.getSource();
					obtenirMareDeDéu().establirValor(espaitemps, (Hiperespai) espaitemps.obtenirFill());
				}
				break;
			default:
				break;
			}
		} else if(manament.getSource() instanceof TimeMaster) {
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				TimeMaster timeMaster = (TimeMaster) manament.getSource();
				comparador(new Aaron()).compara(timeMaster, obtenirMareDeDéu());
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