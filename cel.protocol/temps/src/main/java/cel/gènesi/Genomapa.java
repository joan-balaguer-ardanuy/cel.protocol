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
public class Genomapa
	extends Home<Hipercub,Hipercadena> {

	private static final long serialVersionUID = -8323794104627311597L;
	
	@Override
	@XmlElement
	public String obtenirNom() {
		StringBuilder stringBuilder = new StringBuilder();
		for(Anyell<Character,Integer> anyell : getKey()) {
			stringBuilder.append(anyell.obtenirClau());
		}
		return stringBuilder.toString();
	}
	@Override
	@XmlElement
	public Hipercub getKey() {
		return obtenirClau();
	}
	@Override
	public Hipercub setKey(Hipercub key) {
		return establirClau(key);
	}
	@Override
	@XmlElement
	public Hipercadena getValue() {
		return obtenirValor();
	}
	@Override
	public Hipercadena setValue(Hipercadena value) {
		return establirValor(value);
	}
	@Override
	@XmlElement
	public Genomapa getEntry() {
		return obtenirPare() == obtenirDéu() ? null : (Genomapa) obtenirPare();
	}
		
	public Genomapa() {
		super();
	}
	public Genomapa(Paritat paritat) {
		super(paritat);
	}
	public Genomapa(Paritat paritat, Hipercub clau, Hipercadena valor) {
		super(Haploide.class, paritat, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public Genomapa(Genomapa pare) {
		super(pare);
	}
	public Genomapa(Genomapa pare, Hipercub clau, Hipercadena valor) {
		super(Haploide.class, pare, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public Genomapa(Genomapa déu, Paritat paritat) {
		super(déu, paritat);
	}
	public Genomapa(Genomapa déu, Paritat paritat, Hipercub clau, Hipercadena valor) {
		super(Haploide.class, déu, paritat, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	@Override
	public synchronized int compareTo(Anyell<Hipercadena, Hipercub> o) {
		obtenirClau().comparador().compara(obtenirClau(), o.obtenirClau());
		Anyell<Integer,Character> anyell = obtenirClau().comparador().font();
		comparador((Hipercadena) anyell, (Hipercub) anyell.obtenirFill());
		return 0;
	}
	@Override
	public synchronized void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		if(manament.getSource() instanceof Genomapa) {
			Genomapa genomapa = (Genomapa) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				genomapa.permutarFill(obtenirPassat(), obtenirFutur());
				break;
			case Manament.MOR:
				genomapa.alliberar();
				establirValor(genomapa.obtenirClau(), genomapa.obtenirValor());
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