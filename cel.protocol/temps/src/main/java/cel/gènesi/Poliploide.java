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
		return obtenirClau().obtenirNom();
	}	@Override
	@XmlElement
	public Tetraploide getKey() {
		return obtenirClau();
	}
	@Override
	public Tetraploide setKey(Tetraploide key) {
		return establirClau(key);
	}
	@Override
	@XmlElement
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
		super();
	}
	public Poliploide(Paritat paritat) {
		super(paritat);
	}
	public Poliploide(Paritat paritat, Tetraploide clau, Ribosoma valor) {
		super(Operó.class, paritat, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
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
		obtenirClau().comparador().compara(obtenirClau(), o.obtenirClau());
		Anyell<Cromosoma,Diploide> anyell = obtenirClau().comparador().font();
		comparador((Ribosoma) anyell, (Tetraploide) anyell.obtenirFill());
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
					execute(establirClau(ribosoma, (Tetraploide) ribosoma.obtenirFill()));
				}
				break;
			default:
				break;
			}
		}
		else if(manament.getSource() instanceof Poliploide) {
			Poliploide tretraploide = (Poliploide) manament.getSource();
			switch (manament.obtenirManament()) {
				case Manament.VIU:
					tretraploide.comparador(tretraploide.getValue(), tretraploide.getKey()).compara(tretraploide, obtenirFill());
					Anyell<Ribosoma,Tetraploide> anyell = tretraploide.comparador().font();
					donarManament(new Ordre(anyell));
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