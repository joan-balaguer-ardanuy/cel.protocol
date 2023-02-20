package cel.gènesi;

import cel.Anyell;

/**
 * <tt>
 * <center>
 * <sup>1</sup> Després vaig veure a la mà dreta del qui seia al tron un document escrit per davant i per darrere i tancat amb set segells.
 * <sup>2</sup> Vaig veure també un àngel poderós que cridava amb tota la força:<br/>
 * --¿Qui és digne de trencar els segells i d'obrir el document?<br/>
 * <sup>3</sup> Però, ni al cel ni a la terra ni sota la terra, ningú no va ser capaç d'obrir el document i de veure què deia.
 * <sup>4</sup> Jo, veient que no trobaven ningú que fos digne d'obrir-lo i de veure què deia, plorava desconsoladament.
 * <sup>5</sup> Però un dels ancians em digué:<br/>
 * --No ploris: ha triomfat el lleó de la tribu de Judà, el rebrot de David. Ell obrirà el document i els seus set segells.<br/>
 * <sup>6</sup> Aleshores vaig veure al mig, en el tron, envoltat dels quatre vivents i dels vint-i-quatre ancians, un anyell dret, com degollat. Tenia set banyes i set ulls, que són els set esperits de Déu, enviats per tota la terra.
 * <sup>7</sup> L'Anyell es va acostar al qui seia al tron i prengué de la seva mà dreta aquell document.
 * <sup>8</sup> Així que el prengué, els quatre vivents i els vint-i-quatre ancians es van prosternar davant l'Anyell. Cada un tenia una cítara i una copa d'or, plena de perfums d'encens, que són les pregàries del poble sant.
 * <sup>9</sup> I entonaven un càntic nou que deia:<br/>
 * --Ets digne de prendre el documentv
 * i d'obrir-ne els segells,<br/>
 * perquè has estat degollat<br/>
 * i has comprat per a Déu<br/>
 * amb la teva sang<br/>
 * gent de tota tribu, llengua,<br/>
 * poble i nació,<br/>
 * <sup>10</sup> i n'has fet una casa reial<br/>
 * i uns sacerdots dedicats al nostre Déu,<br/>
 * que regnaran a la terra.<br/>
 * <sup>11</sup> Llavors, en plena visió, vaig sentir les veus d'una multitud d'àngels que envoltaven el tron, i les veus dels vivents i dels ancians. Eren milers de milers i miríades de miríades,
 * <sup>12</sup> que exclamaven amb veu forta:<br/>
 * --Digne és l'Anyell<br/>
 * que ha estat degollat<br/>
 * de rebre tot poder, riquesa, saviesa,<br/>
 * força, honor, glòria i lloança.<br/>
 * <sup>13</sup> Després vaig sentir totes les criatures que hi ha al cel, a la terra, sota la terra i al mar, totes les que hi ha en aquests llocs, que proclamaven:<br/>
 * --Al qui seu al tron i a l'Anyell<br/>
 * siguin donats la lloança, l'honor,<br/>
 * la glòria i el poder<br/>
 * pels segles dels segles.<br/>
 * <sup>14</sup> Els quatre vivents responien:<br/>
 * --Amén.<br/>
 * I els ancians es van prosternar adorant.<br/> 
 * </center>
 * </tt>
 * 
 * @author joan
 *
 * @param <K> és la CLAU
 * @param <V> és el VALOR
 */
public interface Sang<K,V> extends Anyell<K,V> {
	
	K getKey();
	K setKey(K key);
	V getValue();
	V setValue(V value);
	
	Anyell<K,V> getEntry();
	
	V obtenir(K clau);
	
	V establir(K clau, V valor);
	
	V alliberar(K clau);
	
	void establirTot(Sang<? extends K, ? extends V> s);
}