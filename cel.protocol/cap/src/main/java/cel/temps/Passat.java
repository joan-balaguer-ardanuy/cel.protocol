package cel.temps;

import cel.Missatge;

/**
 * <tt>
 * <center>
 * <h3>Déu ha escollit el seu poble </h3>
 * <sup>32</sup> »Investiga el passat, les èpoques que t'han precedit, d'ençà que Déu va crear la humanitat sobre la terra. Demana d'un cap a l'altre del món, a veure si mai ha succeït un fet tan gran, si s'ha sentit mai res de semblant.
 * <sup>33</sup> ¿Hi ha cap poble que hagi sentit la veu de Déu que li parlava des del mig del foc, com tu l'has sentida, i hagi continuat amb vida?
 * <sup>34</sup> ¿O cap altre déu que hagi gosat arrencar un poble que vivia en poder d'un altre per fer-se'l seu? Vosaltres mateixos heu vist tot el que ha fet a Egipte el Senyor, el vostre Déu, valent-se de proves, senyals i prodigis, combatent amb mà forta i braç poderós, amb gestes esglaiadores.
 * <sup>35</sup> El Senyor t'ha concedit de presenciar-ho perquè reconeguis que ell, i ningú més, és Déu.
 * <sup>36</sup> Per instruir-te, t'ha fet sentir des del cel la seva veu, aquí a la terra t'ha fet contemplar el seu foc immens, i tu l'has escoltat quan et parlava des del mig del foc.
 * <sup>37</sup> Ell estimava els teus fills, ha escollit els seus descendents i, mostrant la seva presència, t'ha fet sortir d'Egipte amb el seu poder irresistible.
 * <sup>38</sup> Al teu pas desposseirà nacions més grans i poderoses que tu, per introduir-te al seu país i donar-te'l en possessió, tal com veieu avui.
 * <sup>39</sup> Reconeix, doncs, avui, que el Senyor és l'únic Déu: ni dalt al cel ni aquí baix a la terra no n'hi ha d'altre; recorda-ho sempre en el teu cor.
 * <sup>40</sup> Observa els seus decrets i els seus manaments que avui et dono, perquè tu i els teus descendents sigueu feliços, i tingueu llarga vida en el país que el Senyor, el vostre Déu, us dóna per sempre.<br/>
 * </center>
 * </tt>
 * 
 * @author joan
 *
 * @param <K>
 */
public interface Passat<K> extends Missatge {

	/**
	 * Obté el {@code passat} corresponent a aquest {@link Passat}.
	 * @return el {@code passat} corresponent a aquest {@link Passat}
	 */
	K obtenirPassat();

	/**
     * Estableix el {@code passat} corresponent a aquest {@link Passat} amb el {@code passat}
     * especificat. (Escriu a través del {@link Passat}). El
     * comportament d'aquesta invocació no està definit si el {@code passat} ha estat
     * alliberat d'aquest {@link Passat}.
     *
     * @param passat l'antic {@code passat} per ser establert en aquest {@link Passat}
     * @return l'antic {@code passat} que era establert en aquest {@link Passat}
     */
	K establirPassat(K passat);
}