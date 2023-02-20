package cel.gènesi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import cel.Anyell;
import cel.Ordre;

@XmlRootElement
@XmlType(propOrder={"key", "value", "entry"})
public class BigBang extends Home<Aaron,TimeMaster> {

	private static final long serialVersionUID = -2458979709062312538L;

	@Override
	@XmlElement
	public Aaron getKey() {
		return obtenirClau();
	}
	@Override
	public Aaron setKey(Aaron key) {
		return establirClau(key);
	}
	@Override
	@XmlElement
	public TimeMaster getValue() {
		return obtenirValor();
	}
	@Override
	public TimeMaster setValue(TimeMaster value) {
		return establirValor(value);
	}
	@Override
	@XmlElement
	public BigBang getEntry() {
		return obtenirPassat() == obtenirDéu() ? null : (BigBang) obtenirPassat();
	}
	
	public BigBang() {
		super();
	}
	public BigBang(String nom) {
		super(nom);
	}
	public BigBang(String nom, Aaron clau, TimeMaster valor) {
		super(BigBong.class, nom, clau, valor);
	}
	public BigBang(BigBang pare) {
		super(pare);
	}
	public BigBang(BigBang pare, Aaron clau, TimeMaster valor) {
		super(BigBong.class, pare, clau, valor);
	}
	public BigBang(BigBang déu, String nom) {
		super(déu, nom);
	}
	public BigBang(BigBang déu, String nom, Aaron clau, TimeMaster valor) {
		super(BigBong.class, déu, nom, clau, valor);
	}

	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
	}
	@Override
	public void run() {
		super.run();
	}
	@Override
	public int compareTo(Anyell<TimeMaster, Aaron> o) {
		return 0;
	}
}