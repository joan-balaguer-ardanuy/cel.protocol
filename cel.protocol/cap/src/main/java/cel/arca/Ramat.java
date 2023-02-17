package cel.arca;

/**
 * <tt>
 * <center>
 * <h3>Jacob i Laban</h3>
 * <sup>25</sup> Després del naixement de Josep, Jacob digué a Laban:<br/>
 * --Deixa'm tornar a casa meva, al meu país.
 * <sup>26</sup> Dóna'm les meves dones i els meus fills i me n'aniré. Per elles he treballat al teu servei, i saps prou bé el servei que t'he fet.<br/>
 * <sup>27</sup> Laban li va dir:<br/>
 * --Escolta'm, si he merescut el teu favor. Per una revelació he sabut que el Senyor m'ha beneït per causa teva.
 * <sup>28</sup> Digues-me quina paga et dec, que jo te la donaré.<br/>
 * <sup>29</sup> Jacob li va respondre:<br/>
 * --Tu saps com t'he servit i com ha augmentat el teu bestiar gràcies a mi.
 * <sup>30</sup> Abans que jo arribés, era ben poc el que tenies, i ara ha crescut enormement. El Senyor t'ha beneït al meu pas. Ara és l'hora que jo treballi per a la meva família.<br/>
 * <sup>31</sup> Laban li preguntà:<br/>
 * --Què vols que et doni?<br/>
 * Jacob respongué:<br/>
 * --No cal que em donis res; però, si acceptes el que et proposo, tornaré a pasturar i a guardar el teu ramat.
 * <sup>32</sup> Avui passaré per tots els teus ramats i separaré totes les ovelles clapades, tacades o negres, i, entre les cabres, les clapades o tacades: aquesta serà la meva paga.
 * <sup>33</sup> Així, en endavant podràs comprovar si sóc honrat i verificar la meva paga: si trobes entre les meves cabres algun cap de bestiar que no sigui clapat o ratllat, i entre les meves ovelles alguna que no sigui negra o clapada, senyal que l'hauré robat.<br/>
 * <sup>34</sup> Laban va dir:<br/>
 * --D'acord. Fem-ho tal com dius.<br/>
 * <sup>35</sup> Aquell mateix dia, Jacob va separar dels ramats de Laban tots els bocs i cabres clapats o tacats i totes les ovelles negres, i els va confiar als seus fills.
 * <sup>36</sup> Laban va deixar un espai de tres dies de camí entre els seus ramats i els de Jacob. I Jacob pasturava la resta del ramat de Laban.<br/>
 * <sup>37</sup> Jacob va agafar vergues tendres de pollancre, d'ametller i de plataner i va pelar-ne l'escorça deixant al descobert unes franges blanques.
 * <sup>38</sup> Després va posar les vergues, pelades així, en els abeuradors, als ulls mateix del bestiar, perquè els mascles cobrissin allà les femelles quan venien a beure.
 * <sup>39</sup> Quan eren cobertes davant aquelles varetes, parien animals clapats, ratllats o tacats.
 * <sup>40</sup> Pel que fa a les ovelles, Jacob separava també del ramat de Laban les que naixien clapades o negres. Així s'anava fent ramats per a ell tot sol, i no els barrejava amb els de Laban.
 * <sup>41</sup> Quan els caps de bestiar eren robustos, Jacob els posava les vergues sota els ulls en els abeuradors perquè s'aparellessin davant les vergues.
 * <sup>42</sup> Quan les bèsties eren més febles, no les hi posava. Així els animals febles tocaven a Laban i els robustos eren per a Jacob.<br/>
 * <sup>43</sup> Jacob va arribar a ser molt ric: tenia servents i serventes, nombrosos ramats d'ovelles, i també camells i ases.<br/>
 * </center>
 * </tt>
 * 
 * @author joan
 *
 * @param <E>
 */
public interface Ramat<E> {

	boolean téMés();
	E següent();
	void alliberar();
}
