package cel.temps;

/**
 * <tt>
 * <center>
 * <h3>Déu ha escollit el seu poble </h3>
 * 32 »Investiga el passat, les èpoques que t'han precedit, d'ençà que Déu va crear la humanitat sobre la terra. Demana d'un cap a l'altre del món, a veure si mai ha succeït un fet tan gran, si s'ha sentit mai res de semblant.
 * 33 ¿Hi ha cap poble que hagi sentit la veu de Déu que li parlava des del mig del foc, com tu l'has sentida, i hagi continuat amb vida?
 * 34 ¿O cap altre déu que hagi gosat arrencar un poble que vivia en poder d'un altre per fer-se'l seu? Vosaltres mateixos heu vist tot el que ha fet a Egipte el Senyor, el vostre Déu, valent-se de proves, senyals i prodigis, combatent amb mà forta i braç poderós, amb gestes esglaiadores.
 * 35 El Senyor t'ha concedit de presenciar-ho perquè reconeguis que ell, i ningú més, és Déu.
 * 36 Per instruir-te, t'ha fet sentir des del cel la seva veu, aquí a la terra t'ha fet contemplar el seu foc immens, i tu l'has escoltat quan et parlava des del mig del foc.
 * 37 Ell estimava els teus pares, ha escollit els seus descendents i, mostrant la seva presència, t'ha fet sortir d'Egipte amb el seu poder irresistible.
 * 38 Al teu pas desposseirà nacions més grans i poderoses que tu, per introduir-te al seu país i donar-te'l en possessió, tal com veieu avui.
 * 39 Reconeix, doncs, avui, que el Senyor és l'únic Déu: ni dalt al cel ni aquí baix a la terra no n'hi ha d'altre; recorda-ho sempre en el teu cor.
 * 40 Observa els seus decrets i els seus manaments que avui et dono, perquè tu i els teus descendents sigueu feliços, i tingueu llarga vida en el país que el Senyor, el vostre Déu, us dóna per sempre.<br/>
 * </center>
 * </tt>
 * 
 * @author joan
 *
 * @param <V>
 */
public interface Poderós<V> extends QuiVe<V> {

	V getMareDeDéu();
	V setMareDeDéu(V mareDeDéu);
	Class<? extends V> getClasseFill();
	void setClasseFill(Class<? extends V> classe);
}