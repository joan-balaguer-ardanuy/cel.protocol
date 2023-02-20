package cel.gènesi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import cel.Anyell;
import cel.Manament;
import cel.Ordre;

@XmlRootElement
@XmlType(propOrder={"key", "value", "entry"})
public class Terra extends Home<Operó,Poliploide> {

	private static final long serialVersionUID = -5835390333613517553L;

	@Override
	@XmlElement
	public Operó getKey() {
		return obtenirClau();
	}
	@Override
	public Operó setKey(Operó key) {
		return establirClau(key);
	}
	@Override
	@XmlElement
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
	public Terra(String nom) {
		super(nom);
	}
	public Terra(String nom, Operó clau, Poliploide valor) {
		super(Mar.class, nom, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public Terra(Terra pare) {
		super(pare);
	}
	public Terra(Terra pare, Operó clau, Poliploide valor) {
		super(Mar.class, pare, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public Terra(Terra déu, String nom) {
		super(déu, nom);
	}
	public Terra(Terra déu, String nom, Operó clau, Poliploide valor) {
		super(Mar.class, déu, nom, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}

	@Override
	public int compareTo(Anyell<Poliploide, Operó> o) {
		obtenirClau().comparador().compara(obtenirClau(), o.obtenirClau());
		Anyell<Ribosoma,Tetraploide> anyell = obtenirClau().comparador().font();
		comparador((Operó) anyell, (Poliploide) anyell.obtenirFill());
		return 0;
	}
	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		if(manament.getSource() instanceof Operó) {
			Operó operó = (Operó) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				obtenirClau().comparador().compara(operó, obtenirValor());
				Anyell<Ribosoma,Tetraploide> anyell = obtenirClau().comparador().font();
				establir((Operó) anyell, (Poliploide) anyell.obtenirFill());
				break;
			case Manament.MOR:
				operó.alliberar();
				obtenirValor().establirValor(operó.obtenirValor(), operó.obtenirClau());
				break;
			default:
				return;
			}
		}
		else if(manament.getSource() instanceof Terra) {
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				Terra terra = (Terra) manament.getSource();
				permutarFill(terra, terra.obtenirFill());
				break;
			default:
				break;
			}
		}
	}
	@Override
	public void run() {
//		getKey().run();
		for(Anyell<Ribosoma,Tetraploide> anyell : getKey()) {
			anyell.run();
		}
		super.run();
	}
}