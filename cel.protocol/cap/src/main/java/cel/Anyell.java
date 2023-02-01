package cel;

import cel.temps.Viu;

/**
 * <tt>
 * <center>
 * <h3>Litúrgia celestial: Els màrtirs de l'Anyell</h3>
 * <sup>9</sup> Després d'això, vaig veure que hi havia una multitud tan gran que ningú no l'hauria poguda comptar. Eren gent de totes les nacions, tribus, pobles i llengües. S'estaven drets davant el tron i davant l'Anyell, vestits de blanc i amb palmes a les mans,
 * <sup>10</sup> i proclamaven amb veu forta:<br/>
 * --La salvació ve del nostre Déu, que seu al tron, i de l'Anyell.<br/>
 * <sup>11</sup> I tots els àngels que s'estaven drets al voltant del tron, dels ancians i dels quatre vivents es van prosternar davant el tron amb el front a terra i adoraven Déu
 * <sup>12</sup> dient:<br/>
 * --Amén. Lloança, glòria, saviesa, acció de gràcies, honor, poder i força al nostre Déu pels segles dels segles. Amén.<br/>
 * <sup>13</sup> Aleshores un dels ancians va prendre la paraula i em preguntà:<br/>
 * --Aquests que van vestits de blanc, qui són i d'on vénen?<br/>
 * <sup>14</sup> Jo li vaig respondre:<br/>
 * --Senyor meu, tu ho saps.<br/>
 * Ell em digué:<br/>
 * --Aquests són els qui vénen de la gran tribulació. Han rentat els seus vestits amb la sang de l'Anyell i els han quedat blancs.
 * <sup>15</sup> Per això estan davant el tron de Déu donant-li culte nit i dia dins el seu temple. El qui seu al tron els farà viure en el seu tabernacle.
 * <sup>16</sup> Mai més no passaran fam ni set, ni els farà mal el sol ni la xardor,
 * <sup>17</sup> perquè l'Anyell que està en el tron els pasturarà i els conduirà a les fonts d'aigua viva. I Déu eixugarà totes les llàgrimes dels seus ulls.<br/> 
 * </center>
 * </tt>
 * 
 * @author joan
 *
 * @param <K> és la CLAU
 * @param <V> és el VALOR
 */
public interface Anyell<K,V> extends Viu<Anyell<K,V>, Anyell<V,K>> {

	K getClau();
	K setClau(K clau);
	
	V getValor();
	V setValor(V valor);
}
