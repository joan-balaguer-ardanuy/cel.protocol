package cel.gènesi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import cel.Anyell;
import cel.Ordre;

@XmlRootElement
@XmlType(propOrder={"key", "value", "entry"})
public class Aaron extends Home<Espaitemps, Hiperespai> {

	private static final long serialVersionUID = -9071886077186438664L;

	@Override
	@XmlElement
	public Espaitemps getKey() {
		return obtenirClau();
	}
	@Override
	public Espaitemps setKey(Espaitemps key) {
		return establirClau(key);
	}
	@Override
	@XmlElement
	public Hiperespai getValue() {
		return obtenirValor();
	}
	@Override
	public Hiperespai setValue(Hiperespai value) {
		return establirValor(value);
	}
	@Override
	@XmlElement
	public Aaron getEntry() {
		return obtenirPassat() == obtenirDéu() ? null : (Aaron) obtenirPassat();
	}
	
	public Aaron() {
		super();
	}
	public Aaron(String nom) {
		super(nom);
	}
	public Aaron(String nom, Espaitemps clau, Hiperespai valor) {
		super(TimeMaster.class, nom, clau, valor);
	}
	public Aaron(Aaron pare) {
		super(pare);
	}
	public Aaron(Aaron pare, Espaitemps clau, Hiperespai valor) {
		super(TimeMaster.class, pare, clau, valor);
	}
	public Aaron(Aaron déu, String nom) {
		super(déu, nom);
	}
	public Aaron(Aaron déu, String nom, Espaitemps clau, Hiperespai valor) {
		super(TimeMaster.class, déu, nom, clau, valor);
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
	public int compareTo(Anyell<Hiperespai, Espaitemps> o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
