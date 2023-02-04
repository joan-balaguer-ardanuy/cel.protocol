package cel.temps;

/**
 * <tt>
 * <center>
 * <h3>Déu ha escollit el seu poble </h3>
 * <sup>32</sup> »Investiga el passat, les èpoques que t'han precedit, d'ençà que Déu va crear la humanitat sobre la terra. Demana d'un cap a l'altre del món, a veure si mai ha succeït un fet tan gran, si s'ha sentit mai res de semblant.
 * <sup>33</sup> ¿Hi ha cap poble que hagi sentit la veu de Déu que li parlava des del mig del foc, com tu l'has sentida, i hagi continuat amb vida?
 * <sup>34</sup> ¿O cap altre déu que hagi gosat arrencar un poble que vivia en poder d'un altre per fer-se'l seu? Vosaltres mateixos heu vist tot el que ha fet a Egipte el Senyor, el vostre Déu, valent-se de proves, senyals i prodigis, combatent amb mà forta i braç poderós, amb gestes esglaiadores.
 * <sup>35</sup> El Senyor t'ha concedit de presenciar-ho perquè reconeguis que ell, i ningú més, és Déu.
 * <sup>36</sup> Per instruir-te, t'ha fet sentir des del cel la seva veu, aquí a la terra t'ha fet contemplar el seu foc immens, i tu l'has escoltat quan et parlava des del mig del foc.
 * <sup>37</sup> Ell estimava els teus pares, ha escollit els seus descendents i, mostrant la seva presència, t'ha fet sortir d'Egipte amb el seu poder irresistible.
 * <sup>38</sup> Al teu pas desposseirà nacions més grans i poderoses que tu, per introduir-te al seu país i donar-te'l en possessió, tal com veieu avui.
 * <sup>39</sup> Reconeix, doncs, avui, que el Senyor és l'únic Déu: ni dalt al cel ni aquí baix a la terra no n'hi ha d'altre; recorda-ho sempre en el teu cor.
 * <sup>40</sup> Observa els seus decrets i els seus manaments que avui et dono, perquè tu i els teus descendents sigueu feliços, i tingueu llarga vida en el país que el Senyor, el vostre Déu, us dóna per sempre.<br/>
 * </center>
 * </tt>
 * 
 * @author joan
 *
 * @param <V> és el VALOR
 */
public interface Poderós<V> extends QuiVe<V> {

	/**
	 * Obté la teva Mare de Déu corresponent a aquesta instància.
	 * @return la teva Mare de Déu corresponent a aquesta instància
	 */
	V obtenirMareDeDéu();

	/**
     * Estableix la teva Mare de Déu corresponent a aquesta instància amb la deessa
     * especificada. (Escriu a través de la instància). El
     * comportament d'aquesta invocació no està definit si la instància ha estat
     * alliberada d'aquesta instància.
     *
     * @param pare el nou Pare per ser establert en aquesta instància
     */
	void establirMareDeDéu(V mareDeDéu);

	/**
	 * Obté el futur corresponent a aquesta instància.
	 * @return el futur corresponent a aquesta instància
	 */
	V obtenirFutur();

	/**
     * Estableix el futur corresponent a aquesta instància amb el futur
     * especificat. (Escriu a través de la instància). El
     * comportament d'aquesta invocació no està definit si la instància ha estat
     * alliberada d'aquesta instància.
     * 
     * @param futur el nou futur per ser establert en aquesta instància
     */
	void establirFutur(V futur);
	
	/**
	 * Obté la classe Fill corresponent a aquesta instància.
	 * @return la classe Pare corresponent a aquesta instància
	 */
	Class<? extends V> obtenirClasseFill();
	
	/**
     * Estableix la classe Fill corresponent a aquesta instància amb la classe Fill
     * especificada. (Escriu a través de la instància). El
     * comportament d'aquesta invocació no està definit si la instància ha estat
     * alliberada d'aquesta instància.
     *
     * @param classe la nova classe Fill per ser establerta en aquesta instància
     */
	void establirClasseFill(Class<? extends V> classe);
	
	/**
	 * Obté el Fill de la posició N.
	 * @param N la posició en la qual es troba la instància
	 * @return la instància de la posició N
	 */
	V obtenirFill(long N);
	
	/**
	 * Retorna <tt>cert</tt> si el Fill està en aquesta instància, <tt>fals</tt> si no està.
	 * @param pare el Fill a buscar
	 * @return <tt>cert</tt> si el Fill està en aquesta instància, <tt>fals</tt> si no està
	 */
	boolean contéFill();
	
	/**
	 * Allibera el Fill si és trobat dins aquesta instància.
	 * @param fill el Fill a ser trobat i alliberat
	 * @return <tt>cert</tt> si l'operació s'ha realitzat amb èxit, <tt>fals</tt> del contrari.
	 */
	boolean alliberaFill(V fill);
	
	/**
	 * Obté la posició de la primera aparició en la qual es troba el Fill respecte aquesta instància.
	 * @param fill el Fill a obtenir la posició
	 * @return la posició en la qual es troba el Fill respecte aquesta instància.
	 */
	long índexDeFill(V fill);
	
	/**
	 * Obté la posició de la darrera aparició en la qual es troba el Fill respecte aquesta instància.
	 * @param fill el Fill a obtenir la posició
	 * @return la posició en el qual es troba el Fill respecte aquesta instància.
	 */
	long darrerÍndexDeFill(V fill);
	
	/**
	 * Allibera el Fill que es troba en la posició N.
	 * @param N la posició en la qual s'ha d'alliberar el Fill
	 */
	void alliberaFill(long N);
}