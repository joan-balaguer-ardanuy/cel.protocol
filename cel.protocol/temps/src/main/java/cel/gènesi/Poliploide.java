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
public class Poliploide extends Dona<Tetraploide,Ribosoma> {

	private static final long serialVersionUID = -8176742109161023223L;

	@Override
	public String obtenirNom() {
		StringBuilder stringBuilder = new StringBuilder();
		for(Anyell<Tetraploide,Ribosoma> anyell : this) {
			stringBuilder.append(anyell.obtenirClau().obtenirNom());
		}
		return stringBuilder.toString();
	}
	@Override
	public Tetraploide getKey() {
		return obtenirClau();
	}
	@Override
	public Tetraploide setKey(Tetraploide key) {
		return establirClau(key);
	}
	@Override
	public Ribosoma getValue() {
		return obtenirValor();
	}
	@Override
	public Ribosoma setValue(Ribosoma value) {
		return establirValor(value);
	}
	@Override
	@XmlElement
	public Poliploide getEntry() {
		return obtenirPassat() == obtenirDéu() ? null : (Poliploide) obtenirPassat();
	}

	public Poliploide() {
		super(Operó.class, Paritat.aleatòria());
	}
	public Poliploide(Paritat paritat) {
		super(paritat);
	}
	public Poliploide(Class<Operó> classeFill, Paritat paritat) {
		super(classeFill, paritat);
	}
	public Poliploide(Poliploide pare) {
		super(pare);
	}
	public Poliploide(Poliploide pare, Tetraploide clau, Ribosoma valor) {
		super(Operó.class, pare, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public Poliploide(Poliploide déu, Paritat paritat) {
		super(déu, paritat);
	}
	public Poliploide(Poliploide déu, Paritat paritat, Tetraploide clau, Ribosoma valor) {
		super(Operó.class, déu, paritat, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}

	@Override
	public int compareTo(Anyell<Ribosoma, Tetraploide> o) {
		obtenirClau().comparador(new Ribosoma()).compara(obtenirClau(), o.obtenirClau());
		Anyell<Cromosoma,Diploide> anyell = obtenirClau().comparador().font();
		comparador((Ribosoma) anyell, (Tetraploide) anyell.obtenirFill());
		return 0;
	}
	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		if(manament.getSource() instanceof Cromosoma) {
			Cromosoma cromosoma = (Cromosoma) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.GÈNESI:
				if(sócDéu()) {
					Ribosoma ribosoma = new Ribosoma();
					ribosoma.establirValor(cromosoma, (Diploide) cromosoma.obtenirFill());
					donarManament(new Ordre(ribosoma));
				}
				break;
			default:
				break;
			}
		} else if(manament.getSource() instanceof Tetraploide) {
			Tetraploide tetraploide = (Tetraploide) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				if (!sócDéu()) {
					obtenirClau().comparador(new Ribosoma()).compara(tetraploide, obtenirValor());
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