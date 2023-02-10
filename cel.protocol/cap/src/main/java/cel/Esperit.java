package cel;

import java.util.EventListener;

/**
 * <tt>
 * <center>
 * <h3>Estimar-se de veritat</h3>
 * <sup>11</sup> El missatge que heu sentit des del principi és aquest: que ens estimem els uns als altres.
 * <sup>12</sup> No feu com Caín, que era del Maligne i va matar el seu germà. I per què el va matar? Perquè les seves obres eren dolentes i les del seu germà eren bones.<br/>
 * <sup>13</sup> Germans, no us estranyeu si el món us odia:
 * <sup>14</sup> nosaltres sabem que hem passat de la mort a la vida, perquè estimem els germans. Qui no estima, continua mort.
 * <sup>15</sup> Tothom qui odia el seu germà és un assassí, i ja sabeu que cap assassí no té vida eterna dintre seu.
 * <sup>16</sup> Hem conegut l'amor pel fet que Jesucrist ha donat la seva vida per nosaltres. Per això, també nosaltres hem de donar la vida pels germans.
 * <sup>17</sup> Si algú que posseeix béns en aquest món veu el seu germà que passa necessitat i li tanca les entranyes, com pot habitar dintre d'ell l'amor de Déu?<br/>
 * <sup>18</sup> Fills meus, no estimem amb frases i paraules, sinó amb fets i de veritat.
 * <sup>19</sup> D'aquesta manera coneixerem que som de la veritat i davant de Déu mantindrem en pau la nostra consciència.
 * <sup>20</sup> Perquè, encara que la consciència ens acusi, Déu és més gran que la nostra consciència i ell ho sap tot.
 * <sup>21</sup> Ara bé, estimats, si la consciència no ens acusa, podem estar plens de confiança davant de Déu
 * <sup>22</sup> i obtindrem d'ell tot el que li demanem, perquè guardem els seus manaments i fem allò que li plau.
 * <sup>23</sup> I aquest és el seu manament: que creguem en el nom del seu Fill Jesucrist i que ens estimem els uns als altres, tal com ell ens ha manat.
 * <sup>24</sup> Els qui guarden els seus manaments estan en Déu, i Déu en ells. I coneixem que està en nosaltres per l'Esperit que ens ha donat.<br/> 
 * </center>
 * </tt>
 * 
 * @author joan
 *
 * @see Missatge
 */
public interface Esperit extends Missatge, EventListener, Runnable {

	/**
	 * Afegeix un {@link Esperit} escoltador a aquest {@link Esperit}
	 * @param esperit l'{@link Esperit} escoltador
	 */
	void afegirEscoltador(Esperit esperit);
	
	/**
	 * Allibera un {@link Esperit} escoltador a aquest {@link Esperit}
	 * @param esperit l'{@link Esperit} escoltador
	 */
	void alliberarEscoltador(Esperit esperit);
	
	/**
	 * Manament invocat quan una {@link Ordre} és rebuda.
	 * @param manament {@link Ordre} és l'ordre rebuda
	 */
	void esdeveniment(Ordre manament);
}