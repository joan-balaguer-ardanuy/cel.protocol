package cel.gènesi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import cel.Anyell;
import cel.Manament;
import cel.Ordre;
import cel.Paritat;

/**
 * @author joan
 *
 */
@XmlRootElement
@XmlType(propOrder={"key", "value", "entry"})
public class Haploide 
	extends Dona<Hipercadena, Hipercub> {

	private static final long serialVersionUID = 6303009614734978313L;

	@Override
	public String obtenirNom() {
		StringBuilder stringBuilder = new StringBuilder();
		for(Anyell<Hipercadena,Hipercub> anyell : this) {
			stringBuilder.append(anyell.obtenirClau().obtenirNom());
		}
		return stringBuilder.toString();
	}
	@Override
	public Hipercadena getKey() {
		return obtenirClau();
	}
	@Override
	public Hipercadena setKey(Hipercadena key) {
		return establirClau(key);
	}
	@Override
	public Hipercub getValue() {
		return obtenirValor();
	}
	@Override
	public Hipercub setValue(Hipercub value) {
		return establirValor(value);
	}
	@Override
	@XmlElement
	public Haploide getEntry() {
		return obtenirPare() == obtenirDéu() ? null : (Haploide) obtenirPare();
	}
	
	public Haploide() {
		super();
	}
	public Haploide(Paritat paritat) {
		super(paritat);
	}
	public Haploide(Class<Genomapa> classeFill, Paritat paritat) {
		super(classeFill, paritat);
	}
	public Haploide(Haploide pare) {
		super(pare);
	}
	public Haploide(Haploide pare, Hipercadena clau, Hipercub valor) {
		super(Genomapa.class, pare, clau, valor);
		valor.afegirTestimoni(this);
		clau.afegirTestimoni(obtenirFill());
	}
	public Haploide(Haploide déu, Paritat paritat) {
		super(déu, paritat);
	}
	public Haploide(Haploide déu, Paritat paritat, Hipercadena clau, Hipercub valor) {
		super(Genomapa.class, déu, paritat, clau, valor);
		valor.afegirTestimoni(this);
		clau.afegirTestimoni(obtenirFill());
	}
	@Override
	public int compareTo(Anyell<Hipercub, Hipercadena> o) {
		obtenirClau().comparador(new Hipercub(Hipercadena.class, o.obtenirParitat().oposada())).compara(obtenirClau(), o.obtenirClau());
		Anyell<Character,Integer> anyell = obtenirClau().comparador().font();
		comparador((Hipercub) anyell, (Hipercadena) anyell.obtenirFill());
		return 0;
	}
	@Override
	public synchronized void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		if(manament.getSource() instanceof Haploide) {
			Haploide haploide = (Haploide) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				haploide.permutarFill(obtenirPassat(), obtenirFutur());
				break;
			case Manament.MOR:
				haploide.alliberar();
				break;
			default:
				return;
			}
		} else if(manament.getSource() instanceof Hipercub) {
			Hipercub hipercub = (Hipercub) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.MOR:
				if (!sócDéu() && hipercub.sócDéu()) {
					obtenirValor().comparador(new Hipercadena(Hipercub.class, Paritat.aleatòria())).compara(hipercub, obtenirClau());
					Hipercadena hipercadena = (Hipercadena) obtenirValor().comparador().font();
					obtenirMareDeDéu().establirClau(hipercadena, (Hipercub) hipercadena.obtenirFill());
				}
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