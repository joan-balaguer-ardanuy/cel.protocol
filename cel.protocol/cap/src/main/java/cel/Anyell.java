package cel;

import cel.temps.Viu;

/**
 * <tt>
 * <center>
 *  Litúrgia celestial: Els màrtirs de l'Anyell
9 Després d'això, vaig veure que hi havia una multitud tan gran que ningú no l'hauria poguda comptar. Eren gent de totes les nacions, tribus, pobles i llengües. S'estaven drets davant el tron i davant l'Anyell, vestits de blanc i amb palmes a les mans, 10 i proclamaven amb veu forta:
--La salvació ve del nostre Déu, que seu al tron, i de l'Anyell.
11 I tots els àngels que s'estaven drets al voltant del tron, dels ancians i dels quatre vivents es van prosternar davant el tron amb el front a terra i adoraven Déu 12 dient:
--Amén. Lloança, glòria, saviesa, acció de gràcies, honor, poder i força al nostre Déu pels segles dels segles. Amén.
13 Aleshores un dels ancians va prendre la paraula i em preguntà:
--Aquests que van vestits de blanc, qui són i d'on vénen?
14 Jo li vaig respondre:
--Senyor meu, tu ho saps.
Ell em digué:
--Aquests són els qui vénen de la gran tribulació. Han rentat els seus vestits amb la sang de l'Anyell i els han quedat blancs. 15 Per això estan davant el tron de Déu donant-li culte nit i dia dins el seu temple. El qui seu al tron els farà viure en el seu tabernacle. 16 Mai més no passaran fam ni set, ni els farà mal el sol ni la xardor, 17 perquè l'Anyell que està en el tron els pasturarà i els conduirà a les fonts d'aigua viva. I Déu eixugarà totes les llàgrimes dels seus ulls. 
 * </center>
 * </tt>
 * 
 * @author joan
 *
 * @param <K>
 * @param <V>
 */
public interface Anyell<K,V> extends Viu<Anyell<K,V>, Anyell<V,K>> {

	K getClau();
	K setClau(K clau);
	
	V getValor();
	V setValor(V valor);
}
