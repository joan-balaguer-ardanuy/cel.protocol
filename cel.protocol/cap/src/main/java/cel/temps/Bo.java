package cel.temps;

/**
 * <tt>
 * <center>
 * <h3>El jove ric</h3>
 * <h5>(Mc 10,17-30; Lc 18,18-30)</h5>
 * <sup>16</sup> Un jove anà a trobar Jesús i va preguntar-li:<br/>
 * --Mestre, quina cosa bona haig de fer per a obtenir la vida eterna?<br/>
 * <sup>17</sup> Jesús li digué:<br/>
 * --Per què em preguntes sobre el que és bo? Un de sol és bo. Si vols entrar a la vida, guarda els manaments.<br/>
 * <sup>18</sup> Ell li preguntà:<br/>
 * --Quins?<br/>
 * Jesús li respongué:<br/>
 * -- No matis, no cometis adulteri, no robis, no acusis ningú falsament,
 * <sup>19</sup> honra el pare i la mare, i estima els altres com a tu mateix.<br/>
 * <sup>20</sup> El jove li va dir:<br/>
 * --Tot això ja ho he complert. Què em falta encara?<br/>
 * <sup>21</sup> Jesús li respongué:<br/>
 * --Si vols ser perfecte, vés, ven tot el que tens i dóna-ho als pobres, i tindràs un tresor al cel. Després vine i segueix-me.<br/>
 * <sup>22</sup> Quan aquell jove va sentir aquestes paraules, se n'anà tot trist, perquè tenia molts béns.<br/>
 * <sup>23</sup> Llavors Jesús digué als seus deixebles:<br/>
 * --Us asseguro que un ric difícilment entrarà al Regne del cel.
 * <sup>24</sup> Més encara: és més fàcil que un camell passi pel forat d'una agulla que no pas que un ric entri al Regne de Déu.<br/>
 * <sup>25</sup> Els deixebles, en sentir aquestes paraules, quedaren molt desconcertats, i deien:<br/>
 * --Si és així, qui pot salvar-se?<br/>
 * <sup>26</sup> Jesús se'ls mirà i els digué:<br/>
 * --Als homes els és impossible, però Déu ho pot tot.<br/>
 * <sup>27</sup> Llavors Pere li va dir:<br/>
 * --Mira, nosaltres ho hem deixat tot i t'hem seguit. Què rebrem, doncs?<br/>
 * <sup>28</sup> Jesús els digué:<br/>
 * --Us ho asseguro: quan neixi el món nou i el Fill de l'home s'assegui en el seu tron gloriós, també vosaltres, els qui m'heu seguit, us asseureu en dotze trons i jutjareu les dotze tribus d'Israel.
 * <sup>29</sup> I tothom qui pel meu nom hagi deixat cases, germans, germanes, pare, mare, fills o camps, en rebrà cent vegades més i posseirà la vida eterna.<br/> 
 * </center>
 * </tt>
 * 
 * @author joan
 *
 * @param <K> és la CLAU
 */
public interface Bo<K> extends QuiEra<K> {

	Class<? extends K> getClassePare();
	void setClassePare(Class<? extends K> classe);
	K getDéu();
	K setDéu();
}
