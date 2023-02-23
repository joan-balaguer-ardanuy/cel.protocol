package cel.temps;

import java.util.Iterator;

import cel.Paritat;

/**
 * <tt>
 * <center>
 * <h3>Litúrgia celestial: Les noces de l'Anyell</h3>
 * <sup>1</sup> Després d'això, vaig sentir al cel la veu forta d'una gran gentada que proclamava:<br/>
 * --Al·leluia! La salvació, la glòria i el poder són del nostre Déu.
 * <sup>2</sup> Les seves sentències són justes, no van mai errades. Ha condemnat la gran prostituta que corrompia la terra amb la seva prostitució, li ha demanat comptes de la sang dels seus servents, que ella havia vessat amb les seves mans.<br/>
 * <sup>3</sup> I proclamaven encara:<br/>
 * --Al·leluia! El fum del seu incendi pujarà pels segles dels segles.<br/>
 * <sup>4</sup> Aleshores els vint-i-quatre ancians amb els quatre vivents es van prosternar i adoraven Déu, que seu al tron, dient:<br/>
 * --Amén! Al·leluia!<br/>
 * <sup>5</sup> Després va sortir del tron una veu que exclamava:<br/>
 * --Lloeu el nostre Déu, tots els seus servents, tots els qui el venereu, petits i grans.<br/>
 * <sup>6</sup> Llavors vaig sentir la veu d'una gran gentada, que era com el bramul de les onades, com el retruny d'una tronada potent. I deien:<br/>
 * --Al·leluia! El Senyor nostre, el Déu de l'univers, ha instaurat el seu Regne.
 * <sup>7</sup> Alegrem-nos-en i celebrem-ho, cantem la seva glòria. Ha arribat l'hora de les noces de l'Anyell, i la seva esposa ja està engalanada.
 * <sup>8</sup> Li ha estat concedit de vestir-se de lli blanc i resplendent, que són les bones obres del poble sant.<br/> 
 * </center>
 * </tt>
 * 
 * @author joan
 *
 * @param <K> és la CLAU
 * @param <V> és el VALOR
 */
public abstract class Bondat
	<K extends Vida<K,V>,V extends Vida<V,K>>
		extends Santedat<K, V>
			implements Vida<K,V>{

	private static final long serialVersionUID = 6049293043477552400L;

	public Bondat() {
		super();
	}
	public Bondat(Paritat paritat) {
		super(paritat);
	}
	public Bondat(Class<? extends V> classeFill, Paritat paritat) {
		super(classeFill, paritat);
	}
	public Bondat(K pare) {
		super(pare);
	}
	public Bondat(Class<? extends V> classeFill, K pare) {
		super(classeFill, pare);
	}
	public Bondat(K déu, Paritat paritat) {
		super(déu, paritat);
	}
	public Bondat(Class<? extends V> classeFill, K déu, Paritat paritat) {
		super(classeFill, déu, paritat);
	}

	@Override
	public boolean téPare(K pare) {
		Iterator<K> it = iterator();
		while (it.hasNext())
			if (pare == it.next())
				return true;
		return false;
	}
	@Override
	public boolean afegirPare(K pare) {
		if(!téPare(pare)) {
			sotmetreFill(pare, pare.obtenirFill());
			return true;
		} else return false;
	}
	@Override
	public boolean alliberarPare(K pare) {
		Iterator<K> it = iterator();
		while (it.hasNext()) {
            if (pare == it.next()) {
                it.remove();
                return true;
            }
        }
        return false;
	}
	@Override
	public boolean téCadaPare(K pare) {
		for(K p : pare)
			if(!téPare(p))
				return false;
		return false;
	}
	@Override
	public boolean afegirCadaPare(K pare) {
		boolean modificat = false;
		for (K p : pare)
			if (afegirPare(p))
				modificat = true;
		return modificat;
	}
	@Override
	public boolean alliberarCadaPare(K pare) {
		boolean modificat = false;
        Iterator<K> it = iterator();
        while (it.hasNext()) {
            if (pare.téPare(it.next())) {
                it.remove();
                modificat = true;
            }
        }
        return modificat;
	}
	@Override
	public boolean retenirCadaPare(K pare) {
		boolean modificat = false;
		Iterator<K> it = iterator();
		while (it.hasNext()) {
			if (!pare.téPare(it.next())) {
				it.remove();
				modificat = true;
			}
		}
		return modificat;
	}
}