package cel.nombres;

import cel.Nombre;
import cel.arca.Animal;
import cel.arca.Cavall;

/**
 * <tt>
 * <center>
 * <h3>Taula dels pobles</h3>
 * <big>10</big>
 * <sup>1</sup> Llista genealògica dels descendents de Sem, Cam i Jàfet, fills de Noè, nascuts després del diluvi.<br/>
 * <sup>2</sup> Descendents de Jàfet: Gómer, Magog, Madai, Javan, Tubal, Móixec i Tiràs.
 * <sup>3</sup> Descendents de Gómer: Aixquenaz, Rifat i Togarmà.
 * <sup>4</sup> Descendents de Javan: Elixà, Tarsis, els quitites i els rodanites.
 * <sup>5</sup> D'ells vénen els pobles dispersats per les regions marítimes, cada un amb territoris i llengües pròpies, amb els seus diversos llinatges i nacions.<br/>
 * <sup>6</sup> Descendents de Cam: Cuix, Egipte, Put i Canaan.
 * <sup>7</sup> Descendents de Cuix: Sebà, Havilà, Sabtà, Ramà i Sabtecà. Descendents de Ramà: Saba i Dedan.
 * <sup>8</sup> Cuix és l'avantpassat de Nimrod, que va ser un heroi a la terra.
 * <sup>9</sup> En presència del Senyor, Nimrod era un caçador heroic. D'aquí ve la dita: «Un caçador heroic a la presència del Senyor, com ho era Nimrod.»
 * <sup>10</sup> Les primeres ciutats del seu reialme van ser Babel, Èrec i Acad, totes elles al país de Xinar.
 * <sup>11</sup> D'aquell país va partir Assur, que va edificar Nínive, Rehobot-Ir, Quèlah
 * <sup>12</sup> i Ressen; aquesta darrera, situada entre Nínive i Quèlah, és la més gran.<br/>
 * <sup>13</sup> Egipte és l'avantpassat de la gent de Lud, Anam, Lehab, Naftúah,
 * <sup>14</sup> Patrós, Caslúah i Caftor, d'on van sortir els filisteus.<br/>
 * <sup>15</sup> Canaan va ser el pare de Sidó, el seu primogènit, i d'Het;
 * <sup>16</sup> i l'avantpassat també dels jebuseus, amorreus, guirgaixites,
 * <sup>17</sup> hivites, arquites, sinites,
 * <sup>18</sup> arvadites, semarites i hamatites. Després es van dispersar els llinatges cananeus,
 * <sup>19</sup> i el seu territori es va estendre des de Sidó fins a Guerar i Gaza, i encara en direcció a Sodoma, Gomorra, Admà i Seboïm fins a Leixa.
 * <sup>20</sup> Aquests són els descendents de Cam, amb els seus llinatges i llengües, territoris i nacions.<br/>
 * <sup>21</sup> També Sem, germà gran de Jàfet, va tenir descendència. És l'avantpassat d'Éber i de tots els seus descendents.<br/>
 * <sup>22</sup> Descendents de Sem: Elam, Assíria, Arfaxad, Lud i Aram.
 * <sup>23</sup> Descendents d'Aram: Us, Hul, Guèter i Maix.
 * <sup>24</sup> Arfaxad és l'avantpassat de Xèlah, i Xèlah, el d'Éber.
 * <sup>25</sup> Éber va tenir dos fills: el primer es deia Pèleg, perquè, en el temps que ell vivia, la població de la terra es va dividir; el seu germà es deia Joctan.
 * <sup>26</sup> Joctan va ser el pare d'Almodad, Xèlef, Hassarmàvet, Jèrah,
 * <sup>27</sup> Adoram, Uzal, Diclà,
 * <sup>28</sup> Obal, Abimael, Saba,
 * <sup>29</sup> Ofir, Havilà i Jobab. Tots ells eren fills de Joctan.
 * <sup>30</sup> El seu territori s'estenia des de Meixà fins a Sefar, regió muntanyosa de l'orient.
 * <sup>31</sup> Aquests són els descendents de Sem, amb els seus llinatges i llengües, territoris i nacions.<br/>
 * <sup>32</sup> Aquests són els descendents de Noè amb els seus llinatges, nacions i llistes genealògiques. D'ells vénen les nacions que es van dispersar per la terra després del diluvi. <br/>
 * </center>
 * </tt>
 * 
 * @author joan
 *
 * @param <E> és l'ENTRADA
 */
public class Llista<E>
	extends Nombre<E>
		implements Cavall<E> {

	private static final long serialVersionUID = -341426286629044273L;

	public Llista() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Llista(Animal<E> pare, E entrada) {
		super(pare);
		establirEntrada(entrada);
	}

}