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
public class Diploide
	extends Dona<Haploide,Genomapa> {

	private static final long serialVersionUID = 1392928931896245647L;
	
	@Override
	public String obtenirNom() {
		StringBuilder stringBuilder = new StringBuilder();
		for(Anyell<Haploide,Genomapa> anyell : this) {
			stringBuilder.append(anyell.obtenirClau().obtenirNom());
		}
		return stringBuilder.toString();
	}
	@Override
	public Haploide getKey() {
		return obtenirClau();
	}
	@Override
	public Haploide setKey(Haploide key) {
		return establirClau(key);
	}
	@Override
	public Genomapa getValue() {
		return obtenirValor();
	}
	@Override
	public Genomapa setValue(Genomapa value) {
		return establirValor(value);
	}
	@Override
	@XmlElement
	public Diploide getEntry() {
		return obtenirPassat() == obtenirDéu() ? null : (Diploide) obtenirPassat();
	}
	
	public Diploide() {
		this(Cromosoma.class, Paritat.aleatòria());
	}
	public Diploide(Paritat paritat) {
		super(paritat);
	}
	public Diploide(Class<Cromosoma> classeFill, Paritat paritat) {
		super(classeFill, paritat);
	}
	public Diploide(Diploide pare) {
		super(pare);
	}
	public Diploide(Diploide pare, Haploide clau, Genomapa valor) {
		super(Cromosoma.class, pare, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public Diploide(Diploide déu, Paritat paritat) {
		super(déu, paritat);
	}
	public Diploide(Diploide déu, Paritat paritat, Haploide clau, Genomapa valor) {
		super(Cromosoma.class, déu, paritat, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	@Override
	public int compareTo(Anyell<Genomapa,Haploide> o) {
		obtenirClau().comparador(new Genomapa()).compara(obtenirClau(), o.obtenirClau());
		Anyell<Hipercub,Hipercadena> anyell = obtenirClau().comparador().font();
		comparador((Genomapa) anyell, (Haploide) anyell.obtenirFill());
		return 0;
	}
	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		if(manament.getSource() instanceof Hipercub) {
			Hipercub hipercub = (Hipercub) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.GÈNESI:
				if(sócDéu()) {
					Genomapa genomapa = new Genomapa();
					genomapa.establirValor(hipercub, (Hipercadena) hipercub.obtenirFill());
					donarManament(new Ordre(genomapa));
				}
				break;
			default:
				break;
			}
		} 
		else if(manament.getSource() instanceof Haploide) {
			Haploide haploide = (Haploide) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				if (!sócDéu()) {
					obtenirClau().comparador(new Genomapa()).compara(haploide, obtenirValor());
					donarManament(new Ordre(obtenirClau().comparador().font()));
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