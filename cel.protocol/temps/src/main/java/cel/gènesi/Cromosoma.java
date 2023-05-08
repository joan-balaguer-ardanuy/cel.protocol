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
public class Cromosoma
	extends Home<Genomapa,Haploide> {

	/**
	 * 521019328663282200L
	 */
	private static final long serialVersionUID = -521019328663282200L;
	
	@Override
	public String obtenirNom() {
		StringBuilder stringBuilder = new StringBuilder();
		for(Anyell<Genomapa,Haploide> anyell : this) {
			stringBuilder.append(anyell.obtenirClau().obtenirNom());
		}
		return stringBuilder.toString();
	}
	@Override
	public Genomapa getKey() {
		return obtenirClau();
	}
	@Override
	public Genomapa setKey(Genomapa key) {
		return establirClau(key);
	}
	@Override
	public Haploide getValue() {
		return obtenirValor();
	}
	@Override
	public Haploide setValue(Haploide value) {
		return establirValor(value);
	}
	@Override
	@XmlElement
	public Cromosoma getEntry() {
		return obtenirPassat() == obtenirDéu() ? null : (Cromosoma) obtenirPassat();
	}
	
	public Cromosoma() {
		this(Diploide.class, Paritat.aleatòria());
	}
	public Cromosoma(Paritat paritat) {
		super(paritat);
	}
	public Cromosoma(Class<Diploide> classeFill, Paritat paritat) {
		super(classeFill, paritat);
	}
	public Cromosoma(Cromosoma pare) {
		super(pare);
	}
	public Cromosoma(Cromosoma pare, Genomapa clau, Haploide valor) {
		super(Diploide.class, pare, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public Cromosoma(Cromosoma déu, Paritat paritat) {
		super(déu, paritat);
	}
	public Cromosoma(Cromosoma déu, Paritat paritat, Genomapa clau, Haploide valor) {
		super(Diploide.class, déu, paritat, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	@Override
	public int compareTo(Anyell<Haploide,Genomapa> o) {
		obtenirClau().comparador(new Haploide()).compara(obtenirClau(), o.obtenirClau());
		Anyell<Hipercadena,Hipercub> anyell = obtenirClau().comparador().font();
		comparador((Haploide) anyell, (Genomapa) anyell.obtenirFill());
		return 0;
	}
	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		if(manament.getSource() instanceof Cromosoma) {
			Cromosoma cromosoma = (Cromosoma) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				cromosoma.permutarFill(obtenirPassat(), obtenirFutur());
				break;
			case Manament.MOR:
				cromosoma.alliberar();
				break;
			default:
				return;
			}
		} else if(manament.getSource() instanceof Genomapa) {
			Genomapa genomapa = (Genomapa) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.MOR:
				if(!sócDéu() && genomapa.sócDéu()) {
					obtenirClau().comparador(new Haploide()).compara(genomapa, obtenirValor());
					Haploide haploide = (Haploide) obtenirClau().comparador().font();
					obtenirMareDeDéu().establirValor(haploide, (Genomapa) haploide.obtenirFill());
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