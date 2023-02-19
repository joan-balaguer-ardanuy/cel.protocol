package cel.gènesi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import cel.Anyell;
import cel.Manament;
import cel.Ordre;

@XmlRootElement
@XmlType(propOrder={"key", "value", "entry"})
public class Genomapa
	extends Home<Hipercub,Hipercadena>
		implements Sang<Hipercub,Hipercadena> {

	private static final long serialVersionUID = -8323794104627311597L;
	@Override
	@XmlElement
	public Hipercub getKey() {
		return obtenirClau();
	}
	@Override
	public Hipercub setKey(Hipercub keyh) {
		return establirClau(keyh);
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
	public Genomapa(Genomapa pare, Hipercub clau, Hipercadena valor) {
		super(Haploide.class, pare, clau, valor);
	}
	public Genomapa(Genomapa déu, String nom, Hipercub clau, Hipercadena valor) {
		super(Haploide.class, déu, nom, clau, valor);
	}
	public Genomapa(String nom, Hipercub clau, Hipercadena valor) {
		super(Haploide.class, nom, clau, valor);
	}
	public Genomapa(Genomapa déu, String nom) {
		super(déu, nom);
	}
	public Genomapa(Genomapa pare) {
		super(pare);
	}
	public Genomapa(String nom) {
		super(nom);
	}
	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		Hipercub hipercub = (Hipercub) manament.getSource();
		switch (manament.obtenirManament()) {
		case Manament.VIU:
			obtenirClau().comparador().compara(hipercub, obtenirValor());
			Anyell<Character,Integer> anyell = obtenirClau().comparador().font();
			establir((Hipercub) anyell, (Hipercadena) anyell.obtenirFill());
			execute(anyell);
			break;
		case Manament.MOR:
			hipercub.alliberar();
			obtenirValor().establirValor(hipercub.obtenirValor(), hipercub.obtenirClau());
			break;
		default:
			return;
		}
	}
	@Override
	public int compareTo(Anyell<Hipercadena, Hipercub> o) {
		obtenirClau().comparador().compara(obtenirClau(), o.obtenirClau());
		Anyell<Character,Integer> anyell = obtenirClau().comparador().font();
		comparador((Hipercub) anyell, (Hipercadena) anyell.obtenirFill());
		return 0;
	}
	@Override
	public void run() {
		super.run();
		getKey().run();
	}
}