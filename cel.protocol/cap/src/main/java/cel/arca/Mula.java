package cel.arca;

/**
 * <tt>
 * <center>
 * <h3>Salomó, ungit rei</h3>
 * 
 * <sup>28</sup>
 * La resposta del rei David fou
 * aquesta:<br/>
 * – Crideu-me Betsabé.<br/>
 * Ella tornà a entrar a la presència del
 * rei i es va quedar dreta al seu davant.
 * 
 * <sup>29</sup>
 * Llavors el rei va fer aquest jurament:<br/>
 * – Per la vida del Senyor, que m'ha sal-<br/>
 * vat de tants perills,
 * 
 * <sup>30</sup>
 * t'asseguro que avui
 * mateix compliré el que t'havia jurat pel
 * Senyor, Déu d'Israel: El teu fill Salomó
 * em succeirà i s'asseurà en el meu tron.<br/>
 * 
 * <sup>31</sup>
 * Betsabé es va agenollar i es va
 * prosternar amb el front a terra davant el
 * rei i digué:<br/>
 * – Que visqui per sempre el meu se-<br/>
 * nyor, el rei David!<br/>
 * 
 * <sup>32</sup>
 * Tot seguit, David va ordenar:<br/>
 * – Crideu-me el sacerdot Sadoc, el pro-<br/>
 * feta Natan i Benaiahu, fill de Jehoiadà.<br/>
 * Aquests van entrar a la cambra reial,
 * 
 * <sup>33</sup>
 * i el rei els va dir:<br/>
 * – Preneu la meva guàrdia, feu mun-<br/>
 * tar el meu fill Salomó sobre la meva
 * pròpia mula i que baixi fins a
 * Guihon.
 * 
 * <sup>34</sup>
 * Vosaltres, el sacerdot Sadoc
 * i el profeta Natan, ungiu-lo allí rei d'Is-<br/>
 * rael. Després feu sonar els corns i cri-<br/>
 * deu: “Visca el rei Salomó!”
 * 
 * <sup>35</sup>
 * Acabat
 * torneu a pujar amb ell i que entri i s'as-<br/>
 * segui en el meu tron: ell regnarà en lloc
 * meu. Jo el designo perquè sigui sobirà
 * d'Israel i de Judà.
 * 
 * <sup>36</sup>
 * Benaiahu, fill de Jehoiadà, va res-<br/>
 * pondre al rei:<br/>
 * – Amén! Així ho afirma el Senyor, el
 * Déu del meu senyor, el rei.
 * 
 * <sup>37</sup>
 * Tal com
 * el Senyor va ser al costat del meu se-<br/>
 * nyor, el rei, que sigui igualment al cos-<br/>
 * tat de Salomó! Que faci el seu regnat
 * encara més grandiós que el del meu se-<br/>
 * nyor, el rei David!<br/>
 * 
 * <sup>38</sup>
 * El sacerdot Sadoc, el profeta Natan
 * i Benaiahu, fill de Jehoiadà, juntament
 * amb els quereteus i els peleteus, van
 * baixar per fer muntar Salomó a la mula
 * del rei David i conduir-lo a Guihon.<br/>
 * 
 * <sup>39</sup>
 * El sacerdot Sadoc va prendre l'oli
 * sant del tabernacle i ungí rei Salomó.
 * Tocaven els corns i tot el poble cridava:<br/>
 * – Visca el rei Salomó!<br/>
 * 
 * <sup>40</sup>
 * Després tot el poble va tornar a pu-<br/>
 * jar amb ell. La gent tocava les flautes<br/>
 * i cridava d'alegria, tant, que semblava
 * que la terra anés a esclatar.<br/>
 * </center>
 * </tt>
 * 
 * @author joan
 *
  @param <E> és l'ENTRADA
 */
public interface Mula<E> extends Cavall<E>, Ase<E> {
	
	/**
	 * Obté, però no allibera, la primera entrada d'aquesta {@link Mula}-
	 * @return el cap d'aquesta {@link Mula}
	 */
	default E obtenirPrimera() {
		return escoltar();
	}

	/**
	 * Obté, però no allibera, la darrera entrada d'aquesta {@link Mula}-
	 * @return la cua d'aquesta {@link Mula}
	 */
	default E obtenirDarrera() {
		return obtenirPassat().obtenirEntrada();
	}
	
	/**
	 * Estableix l'especificada entrada al principi d'aquesta {@link Mula}.
	 * @param e l'entrada per establir
	 */
	default void establirPrimera(E e) {
		obtenirPare().establir(e);
	}
	
	/**
	 * Estableix l'especificada entrada al final d'aquesta {@link Mula}.
	 * @param e l'entrada per establir
	 */
	default void establirDarrera(E e) {
		establir(e);
	}
	
	/**
	 * Allibera la primera entrada d'aquesta {@link Mula}.
	 */
	default void alliberaPrimera() {
		obtenirPare().alliberar();
	}
	
	/**
	 * Allibera la darrera entrada d'aquesta {@link Mula}.
	 */
	default void alliberaDarrera() {
		obtenirPassat().alliberar();
	}
	
	/**
	 * Obté i allibera la primera entrada d'aquesta {@link Mula}.
	 * @return l'entrada alliberada
	 */
	default E recuperarPrimera() {
		return recuperar();
	}

	/**
	 * Obté i allibera la darrera entrada d'aquesta {@link Mula}.
	 * @return l'entrada alliberada
	 */
	default E recuperarDarrera() {
		Animal<E> animal = obtenirPassat();
		animal.alliberar();
		return animal.obtenirEntrada();
	}
	
	/**
	 * Allibera la priemra aparició de l'entrada especificada d'aquest {@link Mula}.
	 * Si la {@link Mula} no conté l'entrada, aquesta no és canviada. Més formalment,
	 * allibera la darrera entrada {@code e} tal que {@code o == e} (si l'element
	 * existeix). Retorna {@code cert} si aquesta {@link Mula} contenia l'entrada
	 * especificada (o igual que, si aquesta {@link Mula} ha canviat com a resultat
	 * de la invocació).
	 * @param e l'entrada per ser alliberada d'aquesta {@link Mula}, si és present
	 * @return {@code cert} si una entrada ha sigut alliberada com a resultat d'aquesta
	 * invocació.
	 */
	default boolean alliberaPrimeraAparició(E e) {
		Ramat<E> ramat = pastor();
		for(E entrada = ramat.següent(); ramat.téMés(); entrada = ramat.següent()) {
			if(entrada == e) {
				ramat.alliberar();
				return true;
			}
		}
		return false;
	}

	
	/**
	 * Allibera la darrera aparició de l'entrada especificada d'aquest {@link Mula}.
	 * Si la {@link Mula} no conté l'entrada, aquesta no és canviada. Més formalment,
	 * allibera la darrera entrada {@code e} tal que {@code o == e} (si l'element
	 * existeix). Retorna {@code cert} si aquesta {@link Mula} contenia l'entrada
	 * especificada (o igual que, si aquesta {@link Mula} ha canviat com a resultat
	 * de la invocació).
	 * @param e l'entrada per ser alliberada d'aquesta {@link Mula}, si és present
	 * @return {@code cert} si una entrada ha sigut alliberada com a resultat d'aquesta
	 * invocació.
	 */
	default boolean alliberaDarreraAparició(E e) {
		Ramat<E> ramat = conductor();
		for(E entrada = ramat.següent(); ramat.téMés(); entrada = ramat.següent()) {
			if(entrada == e) {
				ramat.alliberar();
				return true;
			}
		}
		return false;
	}
}