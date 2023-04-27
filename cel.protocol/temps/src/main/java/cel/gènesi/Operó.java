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
public class Operó extends Home<Ribosoma,Tetraploide> {

	private static final long serialVersionUID = -5755798448107627330L;

	@Override
	public String obtenirNom() {
		StringBuilder stringBuilder = new StringBuilder();
		for(Anyell<Ribosoma,Tetraploide> anyell : this) {
			stringBuilder.append(anyell.obtenirClau().obtenirNom());
		}
		return stringBuilder.toString();
	}
	@Override
	public Ribosoma getKey() {
		return obtenirClau();
	}
	@Override
	public Ribosoma setKey(Ribosoma key) {
		return establirClau(key);
	}
	@Override
	public Tetraploide getValue() {
		return obtenirValor();
	}
	@Override
	public Tetraploide setValue(Tetraploide value) {
		return establirValor(value);
	}
	@Override
	@XmlElement
	public Operó getEntry() {
		return obtenirPassat() == obtenirDéu() ? null : (Operó) obtenirPassat();
	}
	
	public Operó() {
		super();
	}
	public Operó(Paritat paritat) {
		super(paritat);
	}
	public Operó(Class<Poliploide> classeFill, Paritat paritat) {
		super(classeFill, paritat);
	}
	public Operó(Operó pare) { 
		super(pare);
	}
	public Operó(Operó pare, Ribosoma clau, Tetraploide valor) {
		super(Poliploide.class, pare, clau, valor);
		valor.afegirTestimoni(this);
		clau.afegirTestimoni(obtenirFill());
	}
	public Operó(Operó déu, Paritat paritat) {
		super(déu, paritat);
	}
	public Operó(Operó déu, Paritat paritat, Ribosoma clau, Tetraploide valor) {
		super(Poliploide.class, déu, paritat, clau, valor);
		valor.afegirTestimoni(this);
		clau.afegirTestimoni(obtenirFill());
	}

	@Override
	public int compareTo(Anyell<Tetraploide, Ribosoma> o) {
		obtenirClau().comparador(new Tetraploide(Ribosoma.class, o.obtenirParitat().oposada())).compara(obtenirClau(), o.obtenirClau());
		Anyell<Diploide,Cromosoma> anyell = obtenirClau().comparador().font();
		comparador((Tetraploide) anyell, (Ribosoma) anyell.obtenirFill());
		return 0;
	}
	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		if(manament.getSource() instanceof Diploide) {
			switch (manament.obtenirManament()) {
			case Manament.GÈNESI:
				Diploide diploide = (Diploide) manament.getSource();
				Tetraploide tetraploide = new Tetraploide(Ribosoma.class, Paritat.aleatòria());
				tetraploide.establirValor(diploide, (Cromosoma) diploide.obtenirFill());
				donarManament(new Ordre(tetraploide));
				break;
			default:
				break;
			}
		} 
		else if(manament.getSource() instanceof Operó) {
			Operó operó = (Operó) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				operó.permutarFill(obtenirPassat(), obtenirFutur());
				break;
			case Manament.MOR:
				operó.alliberar();
				break;
			default:
				return;
			}
		} else if(manament.getSource() instanceof Tetraploide) {
			Tetraploide tetraploide = (Tetraploide) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.MOR:
				if (!sócDéu() && tetraploide.sócDéu()) {
					obtenirValor().comparador(new Ribosoma(Tetraploide.class, Paritat.aleatòria())).compara(tetraploide, obtenirClau());
					Ribosoma ribosoma = (Ribosoma) obtenirValor().comparador().font();
					obtenirMareDeDéu().establirClau(ribosoma, (Tetraploide) ribosoma.obtenirFill());
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