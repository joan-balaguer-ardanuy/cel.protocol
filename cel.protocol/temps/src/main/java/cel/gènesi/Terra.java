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
public class Terra extends Home<Operó,Poliploide> {

	private static final long serialVersionUID = -5835390333613517553L;
	
	@Override
	public String obtenirNom() {
		return obtenirClau().obtenirNom();
	}
	@Override
	@XmlElement
	public Operó getKey() {
		return obtenirClau();
	}
	@Override
	public Operó setKey(Operó key) {
		return establirClau(key);
	}
	@Override
	@XmlElement
	public Poliploide getValue() {
		return obtenirValor();
	}
	@Override
	public Poliploide setValue(Poliploide value) {
		return establirValor(value);
	}
	@Override
	@XmlElement
	public Terra getEntry() {
		return obtenirPassat() == obtenirDéu() ? null : (Terra) obtenirPassat();
	}
	
	public Terra() {
		super();
	}
	public Terra(Paritat paritat) {
		super(paritat);
	}
	public Terra(Paritat paritat, Operó clau, Poliploide valor) {
		super(Mar.class, paritat, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public Terra(Terra pare) {
		super(pare);
	}
	public Terra(Terra pare, Operó clau, Poliploide valor) {
		super(Mar.class, pare, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public Terra(Terra déu, Paritat paritat) {
		super(déu, paritat);
	}
	public Terra(Terra déu, Paritat paritat, Operó clau, Poliploide valor) {
		super(Mar.class, déu, paritat, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}

	@Override
	public int compareTo(Anyell<Poliploide, Operó> o) {
		obtenirClau().comparador().compara(obtenirClau(), o.obtenirClau());
		Anyell<Tetraploide,Ribosoma> anyell = obtenirClau().comparador().font();
		comparador((Poliploide) anyell, (Operó) anyell.obtenirFill());
		return 0;
	}
	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		if(manament.getSource() instanceof Terra) {
			Terra operó = (Terra) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				operó.permutarFill(obtenirPassat(), obtenirFutur());
				break;
			case Manament.MOR:
				operó.alliberar();
				establirValor(operó.obtenirClau(), operó.obtenirValor());
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