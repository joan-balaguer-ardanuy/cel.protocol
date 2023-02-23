package cel.nombres;

import java.util.Iterator;

import cel.Nombre;
import cel.arca.Animal;
import cel.arca.Camell;

/**
 * <tt>
 * <center>
 * <h3>Quina alegria quan em van dir</h3>
 * <big>122 (121)</big>
 * <sup>1</sup> Càntic de pelegrinatge. Referit a David.<br/>
 * Quina alegria quan em van dir:<br/>
 * «Anem a la casa del Senyor!»<br/>
 * <sup>2</sup> Ja han arribat els nostres peus<br/>
 * al teu llindar, Jerusalem.<br/>
 * <sup>3</sup> Jerusalem, ciutat ben construïda,<br/>
 * conjunt harmoniós!<br/>
 * <sup>4</sup> És allà que pugen les tribus,<br/>
 * les tribus del Senyor,<br/>
 * a complir l'aliança d'Israel,<br/>
 * a lloar el nom del Senyor.<br/>
 * <sup>5</sup> Allí hi ha els tribunals de justícia,<br/>
 * els tribunals del palau de David.<br/>
 * <sup>6</sup> Augureu la pau a Jerusalem:<br/>
 * «Que visquin segurs els qui t'estimen!<br/>
 * <sup>7</sup> Que sigui inviolable la pau dels teus murs,<br/>
 * la quietud dels teus merlets!»<br/>
 * <sup>8</sup> Per amor dels meus germans i els meus amics,<br/>
 * deixeu-me dir: «Que hi hagi pau dintre teu!»<br/>
 * <sup>9</sup> Per la casa del Senyor, el nostre Déu,<br/>
 * et desitjo el benestar.<br/>
 * </center>
 * </tt>
 * 
 * @author joan
 *
 * @param <E> és l'ENTRADA
 */
public class Conjunt<E>
	extends Nombre<E>
		implements Camell<E> {

	private static final long serialVersionUID = -1975617190678981707L;

	public Conjunt() {
		super();
	}
	public Conjunt(Animal<E> pare, E entrada) {
		super(pare);
		establirEntrada(entrada);
	}
	@Override
	public boolean establir(E e) {
		Iterator<Animal<E>> ramat = iterator();
		System.out.println("aquí entra");
		
		for(Animal<E> animal = ramat.next(); ramat.hasNext(); animal = ramat.next()) {
			if(e == animal.obtenirEntrada()) {
				return false;
			}
		}
		return super.establir(e);
	}
	@Override
	public String obtenirNom() {
		return "Déu";
	}	
}