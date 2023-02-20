package cel.gènesi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import cel.Anyell;
import cel.Ordre;

@XmlRootElement
@XmlType(propOrder={"key", "value", "entry"})
public class TimeMaster extends Dona<Hiperespai, Espaitemps> {

	private static final long serialVersionUID = 349428359088025708L;

	@Override
	@XmlElement
	public Hiperespai getKey() {
		return obtenirClau();
	}
	@Override
	public Hiperespai setKey(Hiperespai key) {
		return establirClau(key);
	}
	@Override
	@XmlElement
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
		super();
	}
	public TimeMaster(String nom) {
		super(nom);
	}
	public TimeMaster(String nom, Hiperespai clau, Espaitemps valor) {
		super(Aaron.class, nom, clau, valor);
	}
	public TimeMaster(TimeMaster pare) {
		super(pare);
	}
	public TimeMaster(TimeMaster pare, Hiperespai clau, Espaitemps valor) {
		super(Aaron.class, pare, clau, valor);
	}
	public TimeMaster(TimeMaster déu, String nom) {
		super(déu, nom);
	}
	public TimeMaster(TimeMaster déu, String nom, Hiperespai clau, Espaitemps valor) {
		super(Aaron.class, déu, nom, clau, valor);
	}
	
	@Override
	public void esdeveniment(Ordre manament) {
		// TODO Auto-generated method stub
		super.esdeveniment(manament);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}
	@Override
	public int compareTo(Anyell<Espaitemps, Hiperespai> o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
