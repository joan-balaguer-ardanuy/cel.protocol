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
		StringBuilder stringBuilder = new StringBuilder();
		for(Anyell<Operó,Poliploide> anyell : this) {
			stringBuilder.append(anyell.obtenirClau().obtenirNom());
		}
		return stringBuilder.toString();
	}
	@Override
	public Operó getKey() {
		return obtenirClau();
	}
	@Override
	public Operó setKey(Operó key) {
		return establirClau(key);
	}
	@Override
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
	public Terra(Class<Mar> classeFill, Paritat paritat) {
		super(classeFill, paritat);
	}
	public Terra(Terra pare) {
		super(pare);
	}
	public Terra(Terra pare, Operó clau, Poliploide valor) {
		super(Mar.class, pare, clau, valor);
		valor.afegirTestimoni(this);
		clau.afegirTestimoni(obtenirFill());
	}
	public Terra(Terra déu, Paritat paritat) {
		super(déu, paritat);
	}
	public Terra(Terra déu, Paritat paritat, Operó clau, Poliploide valor) {
		super(Mar.class, déu, paritat, clau, valor);
		valor.afegirTestimoni(this);
		clau.afegirTestimoni(obtenirFill());
	}

	@Override
	public int compareTo(Anyell<Poliploide, Operó> o) {
		obtenirClau().comparador(new Poliploide(Operó.class, o.obtenirParitat().oposada())).compara(obtenirClau(), o.obtenirClau());
		Anyell<Tetraploide,Ribosoma> anyell = obtenirClau().comparador().font();
		comparador((Poliploide) anyell, (Operó) anyell.obtenirFill());
		return 0;
	}
	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		if(manament.getSource() instanceof Ribosoma) {
			Ribosoma ribosoma = (Ribosoma) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.GÈNESI:
				if(sócDéu()) {
					Operó operó = new Operó(Poliploide.class, ribosoma.obtenirParitat());
					operó.establirValor(ribosoma, (Tetraploide) ribosoma.obtenirFill());
					donarManament(new Ordre(operó));
				}
				break;
			default:
				break;
			}
		} else if(manament.getSource() instanceof Poliploide) {
			Poliploide poliploide = (Poliploide) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				if(!sócDéu()) {
					obtenirValor().comparador(new Operó(Poliploide.class, Paritat.aleatòria())).compara(poliploide, obtenirClau());
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