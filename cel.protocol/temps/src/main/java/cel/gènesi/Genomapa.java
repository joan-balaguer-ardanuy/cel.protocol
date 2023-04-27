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
	public String obtenirNom() {
		StringBuilder stringBuilder = new StringBuilder();
		for(Anyell<Hipercub,Hipercadena> anyell : this) {
			stringBuilder.append(anyell.obtenirClau().obtenirNom());
		}
		return stringBuilder.toString();
	}
	@Override
	public Hipercub getKey() {
		return obtenirClau();
	}
	@Override
	public Hipercub setKey(Hipercub key) {
		return establirClau(key);
	}
	@Override
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
	public Genomapa(Class<Haploide> classeFill, Paritat paritat) {
		super(classeFill, paritat);
	}
	public Genomapa(Genomapa pare) {
		super(pare);
	}
	public Genomapa(Genomapa pare, Hipercub clau, Hipercadena valor) {
		super(Haploide.class, pare, clau, valor);
		valor.afegirTestimoni(this);
		clau.afegirTestimoni(obtenirFill());
	}
	public Genomapa(Genomapa déu, Paritat paritat) {
		super(déu, paritat);
	}
	public Genomapa(Genomapa déu, Paritat paritat, Hipercub clau, Hipercadena valor) {
		super(Haploide.class, déu, paritat, clau, valor);
		valor.afegirTestimoni(this);
		clau.afegirTestimoni(obtenirFill());
	}
	@Override
	public int compareTo(Anyell<Hipercadena, Hipercub> o) {
		obtenirClau().comparador(new Hipercadena(Hipercub.class, o.obtenirParitat().oposada())).compara(obtenirClau(), o.obtenirClau());
		Anyell<Integer,Character> anyell = obtenirClau().comparador().font();
		comparador((Hipercadena) anyell, (Hipercub) anyell.obtenirFill());
		return 0;
	}
	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		if(manament.getSource() instanceof Hipercadena) {
			Hipercadena hipercadena = (Hipercadena) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				if(!sócDéu()) {
					obtenirValor().comparador(new Hipercub(Hipercadena.class, Paritat.aleatòria())).compara(hipercadena, obtenirClau());
					donarManament(new Ordre(obtenirValor().comparador().font()));
				}
				break;
			default:
				break;
			}
		}
	}
	@Override
	public void run() {
		obtenirValor().run();
		super.run();
	}
}