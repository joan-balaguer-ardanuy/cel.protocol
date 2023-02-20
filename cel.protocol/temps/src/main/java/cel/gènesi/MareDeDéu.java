package cel.gènesi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import cel.Anyell;
import cel.Ordre;

@XmlRootElement
@XmlType(propOrder={"key", "value", "entry"})
public class BigBong extends Dona<TimeMaster, Aaron> {

	private static final long serialVersionUID = 8747126417822477895L;

	@Override
	@XmlElement
	public TimeMaster getKey() {
		return obtenirClau();
	}
	@Override
	public TimeMaster setKey(TimeMaster key) {
		return establirClau(key);
	}
	@Override
	@XmlElement
	public Aaron getValue() {
		return obtenirValor();
	}
	@Override
	public Aaron setValue(Aaron value) {
		return establirValor(value);
	}
	@Override
	@XmlElement
	public BigBong getEntry() {
		return obtenirPassat() == obtenirDéu() ? null : (BigBong) obtenirPassat();
	}

	public BigBong() {
		super();
	}
	public BigBong(String nom) {
		super(nom);
	}
	public BigBong(String nom, TimeMaster clau, Aaron valor) {
		super(BigBang.class, nom, clau, valor);
	}
	public BigBong(BigBong pare) {
		super(pare);
	}
	public BigBong(BigBong pare, TimeMaster clau, Aaron valor) {
		super(BigBang.class, pare, clau, valor);
	}
	public BigBong(BigBong déu, String nom) {
		super(déu, nom);
	}
	public BigBong(BigBong déu, String nom, TimeMaster clau, Aaron valor) {
		super(BigBang.class, déu, nom, clau, valor);
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
	public int compareTo(Anyell<Aaron, TimeMaster> o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
