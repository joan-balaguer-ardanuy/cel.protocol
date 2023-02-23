package cel.temps;

import cel.Missatge;

/**
 * <tt>
 * <center>
 * <h3>Josep posa a prova els seus germans</h3>
 * <sup>1</sup> Després Josep va donar aquesta ordre al seu majordom:<br/>
 * --Omple de queviures els sacs d'aquesta gent, tant com en puguin dur, i posa els diners que pagui cada un a la boca del seu sac.
 * <sup>2</sup> I en el sac del més petit posa-hi la meva copa, la copa de plata, junt amb els seus diners.<br/>
 * El majordom ho va fer tal com Josep li ho havia manat.<br/>
 * <sup>3</sup> A punta de dia, els van donar permís perquè partissin amb els seus ases.
 * <sup>4</sup> Tot just havien sortit de la ciutat, quan encara no eren gaire lluny, Josep va dir al seu majordom:<br/>
 * --Surt a perseguir aquests homes, atrapa'ls i digues-los: "Per què heu tornat mal per bé?
 * <sup>5</sup> La copa que us endueu, no és la que el meu amo fa servir per a beure i per a endevinar el futur? No heu fet bé obrant així."<br/>
 * <sup>6</sup> El majordom els va atrapar i els repetí aquestes paraules.
 * <sup>7</sup> Ells van replicar:<br/>
 * --Senyor meu, com ens pots acusar així? Mai de la vida cap dels teus servents no hauria gosat fer res de semblant!
 * <sup>8</sup> T'hem tornat del país de Canaan els diners que havíem trobat dins els nostres sacs. Com seríem capaços de robar or o plata de la casa del teu amo?
 * <sup>9</sup> Si ho trobes en el bagatge d'un dels teus servents, que mori, i tots nosaltres serem esclaus del teu amo.<br/>
 * <sup>10</sup> El majordom va replicar:<br/>
 * --Que sigui tal com dieu. El culpable serà el meu esclau, i els altres quedareu lliures.<br/>
 * <sup>11</sup> Cada un s'afanyà a descarregar el seu sac a terra per obrir-lo.
 * <sup>12</sup> El majordom va escorcollar els sacs, començant pel del més gran i acabant pel del més petit, i la copa es va trobar en el sac de Benjamí.
 * <sup>13</sup> Ells es van esquinçar els vestits. Van carregar els ases i se'n tornaren a la ciutat.<br/> 
 * </center>
 * </tt>
 * 
 * @author joan
 *
 * @param <V> és el VALOR
 */
public interface Futur<V> extends Missatge {

	/**
	 * Obté el {@code futur} corresponent a aquest {@link Futur}.
	 * @return el {@code futur} corresponent a aquest {@link Futur}
	 */
	V obtenirFutur();

	/**
     * Estableix el {@code futur} corresponent a aquest {@link Futur} amb el futur
     * especificat. (Escriu a través del {@link Futur}). El
     * comportament d'aquesta invocació no està definit si el {@code futur} ha estat
     * alliberat d'aquest {@link Futur}.
     * 
     * @param futur el nou {@code futur} per ser establert en aquest {@link Futur}
     * @return el nou {@code futur} que serà establert en aquest {@link Futur}
     */
	V establirFutur(V futur);
}
