package cel.temps;

/**
 * <tt>
 * <center>
 * <h3>Entrada de Jesús a Jerusalem</h3>
 * <h5>(Mc 11,1-10; Lc 19,28-38; Jn 12,12-19)</h5>
 * <sup>1</sup> Quan es van acostar a Jerusalem i arribaren a Betfagé, a la muntanya de les Oliveres, Jesús va enviar dos deixebles
 * <sup>2</sup> amb aquest encàrrec:<br/>
 * --Aneu al poble que teniu al davant i tot seguit trobareu una somera fermada, amb un pollí al seu costat. Deslligueu-la i porteu-me'ls.
 * <sup>3</sup> Si algú us preguntava res, responeu-li: "El Senyor els ha de menester, però de seguida els tornarà."<br/>
 * <sup>4</sup> Això va succeir perquè es complís allò que havia anunciat el profeta:<br/>
 * <sup>5</sup> Digueu a la ciutat de Sió:<br/>
 * Mira el teu rei que ve cap a tu;<br/>
 * arriba humilment,<br/>
 * muntat en una somera i en un pollí,<br/>
 * fill d'un animal de càrrega.<br/>
 * <sup>6</sup> Els deixebles hi anaren i feren el que Jesús els havia manat:
 * <sup>7</sup> portaren la somera i el pollí, van posar els mantells al seu damunt, i ell hi va muntar.
 * <sup>8</sup> Molta gent va començar a estendre els seus mantells pel camí; d'altres tallaven branques dels arbres i encatifaven el terra.
 * <sup>9</sup> La gent que anava davant d'ell i els qui seguien darrere cridaven:<br/>
 * -- Hosanna al Fill de David! Beneït el qui ve en nom del Senyor! Hosanna a dalt del cel!<br/>
 * <sup>10</sup> Quan hagué entrat a Jerusalem, tota la ciutat es va inquietar, i preguntaven:<br/>
 * --Qui és aquest?<br/>
 * <sup>11</sup> La multitud responia:<br/>
 * --Aquest és el profeta Jesús, de Natzaret de Galilea.<br/> 
 * </center>
 * </tt>
 * 
 * @author joan
 *
 * @param <V> és el VALOR
 */
public interface QuiVe<V> {
	V getFill();
	V setFill(V fill);
}