package cel.temps;

/**
 * <tt>
 * <center>
 *  Entrada de Jesús a Jerusalem
(Mc 11,1-10; Lc 19,28-38; Jn 12,12-19)
1 Quan es van acostar a Jerusalem i arribaren a Betfagé, a la muntanya de les Oliveres, Jesús va enviar dos deixebles 2 amb aquest encàrrec:
--Aneu al poble que teniu al davant i tot seguit trobareu una somera fermada, amb un pollí al seu costat. Deslligueu-la i porteu-me'ls. 3 Si algú us preguntava res, responeu-li: "El Senyor els ha de menester, però de seguida els tornarà."
4 Això va succeir perquè es complís allò que havia anunciat el profeta:
5 Digueu a la ciutat de Sió:
Mira el teu rei que ve cap a tu;
arriba humilment,
muntat en una somera i en un pollí,
fill d'un animal de càrrega.
6 Els deixebles hi anaren i feren el que Jesús els havia manat: 7 portaren la somera i el pollí, van posar els mantells al seu damunt, i ell hi va muntar. 8 Molta gent va començar a estendre els seus mantells pel camí; d'altres tallaven branques dels arbres i encatifaven el terra. 9 La gent que anava davant d'ell i els qui seguien darrere cridaven:
-- Hosanna al Fill de David! Beneït el qui ve en nom del Senyor! Hosanna a dalt del cel!
10 Quan hagué entrat a Jerusalem, tota la ciutat es va inquietar, i preguntaven:
--Qui és aquest?
11 La multitud responia:
--Aquest és el profeta Jesús, de Natzaret de Galilea. 
 * </center>
 * </tt>
 * 
 * @author joan
 *
 * @param <V>
 */
public interface QuiVe<V> {
	V getFill();
	V setFill(V fill);
}