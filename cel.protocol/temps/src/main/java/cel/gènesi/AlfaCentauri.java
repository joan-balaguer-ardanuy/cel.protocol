package cel.gènesi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import cel.Anyell;
import cel.Manament;
import cel.Ordre;

@XmlRootElement
@XmlType(propOrder={"key", "value", "entry"})
public class AlfaCentauri extends Dona<Mar, Terra> {

	private static final long serialVersionUID = -8847168674216359054L;
	
	@Override
	@XmlElement
	public Mar getKey() {
		return obtenirClau();
	}
	@Override
	public Mar setKey(Mar key) {
		return establirClau(key);
	}
	@Override
	@XmlElement
	public Terra getValue() {
		return obtenirValor();
	}
	@Override
	public Terra setValue(Terra value) {
		return establirValor(value);
	}
	@Override
	@XmlElement
	public AlfaCentauri getEntry() {
		return obtenirPassat() == obtenirDéu() ? null : (AlfaCentauri) obtenirPassat();
	}

	public AlfaCentauri() {
		super();
	}
	public AlfaCentauri(String nom) {
		super(nom);
	}
	public AlfaCentauri(String nom, Mar clau, Terra valor) {
		super(Sol.class, nom, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public AlfaCentauri(AlfaCentauri pare) {
		super(pare);
	}
	public AlfaCentauri(AlfaCentauri pare, Mar clau, Terra valor) {
		super(Sol.class, pare, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}
	public AlfaCentauri(AlfaCentauri déu, String nom) {
		super(déu, nom);
	}
	public AlfaCentauri(AlfaCentauri déu, String nom, Mar clau, Terra valor) {
		super(Sol.class, déu, nom, clau, valor);
		clau.afegirTestimoni(this);
		valor.afegirTestimoni(obtenirFill());
	}

	@Override
	public int compareTo(Anyell<Terra, Mar> o) {
		obtenirClau().comparador().compara(obtenirClau(), o.obtenirClau());
		Anyell<Poliploide,Operó> anyell = obtenirClau().comparador().font();
		comparador((Mar) anyell, (Terra) anyell.obtenirFill());
		return 0;
	}
	@Override
	public void esdeveniment(Ordre manament) {
		super.esdeveniment(manament);
		if(manament.getSource() instanceof Mar) {
			Mar mar = (Mar) manament.getSource();
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				obtenirClau().comparador().compara(mar, obtenirValor());
				Anyell<Poliploide,Operó> anyell = obtenirClau().comparador().font();
				establirValor((Mar) anyell, (Terra) anyell.obtenirFill());
				break;
			case Manament.MOR:
				mar.alliberar();
				obtenirValor().establirValor(mar.obtenirValor(), mar.obtenirClau());
				break;
			default:
				return;
			}
		}
		else if(manament.getSource() instanceof AlfaCentauri) {
			switch (manament.obtenirManament()) {
			case Manament.VIU:
				AlfaCentauri alfaCentauri = (AlfaCentauri) manament.getSource();
				permutarFill(alfaCentauri, alfaCentauri.obtenirFill());
				break;
			default:
				break;
			}
		}
	}
	@Override
	public void run() {
//		getKey().run();
		for(Anyell<Poliploide,Operó> anyell : getKey()) {
			anyell.run();
		}
		super.run();
	}
}