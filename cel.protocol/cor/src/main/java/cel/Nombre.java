package cel;

import java.io.Serializable;
import java.util.Iterator;

import cel.arca.Animal;
import cel.arca.Ramat;

/**
 * <tt>
 * <center>
 * <h3>Primer cens del poble d'Israel</h3>
 * <sup>1</sup> El dia primer del mes segon, el segon any després d'haver sortit els israelites del país d'Egipte, el Senyor va parlar a Moisès en el desert del Sinaí, a la tenda del trobament. Li digué:<br/>
 * <sup>2</sup> --Tu i Aaron feu el cens de tota la comunitat d'Israel per clans i llinatges, registrant un per un el nom de tots els homes.
 * <sup>3</sup> Compteu, distribuïts en batallons, tots els homes de vint anys en amunt aptes per a l'exèrcit.
 * <sup>4</sup> Us assistirà un cap de llinatge de cada tribu.
 * <sup>5 </sup>Aquests són els noms dels qui us ajudaran:<br/>
 * »Per la tribu de Rubèn, Elissur, fill de Xedeür.
 * <sup>6</sup> Per la de Simeó, Xelumiel, fill de Surixadai.
 * <sup>7</sup> Per la de Judà, Nahxon, fill d'Amminadab.
 * <sup>8</sup> Per la d'Issacar, Netanel, fill de Suar.
 * <sup>9</sup> Per la de Zabuló, Eliab, fill d'Helon.
 * <sup>10</sup> Per les dues tribus descendents de Josep, Elixamà, fill d'Ammihud, per la d'Efraïm, i Gamliel, fill de Pedahsur, per la de Manassès.
 * <sup>11</sup> Per la de Benjamí, Abidan, fill de Guidoní.
 * <sup>12</sup> Per la de Dan, Ahièzer, fill d'Ammixadai.
 * <sup>13</sup> Per la d'Aser, Paguiel, fill d'Ocran.
 * <sup>14</sup> Per la de Gad, Eliassaf, fill de Deuel.
 * <sup>15</sup> Per la de Neftalí, Ahirà, fill d'Enan.<br/>
 * <sup>16</sup> Aquests van ser els delegats de la comunitat com a principals de les seves tribus i caps de les unitats d'Israel.
 * <sup>17</sup> Moisès i Aaron van fer venir aquests homes, designats nominalment,
 * <sup>18</sup> i el dia primer del mes segon convocaren tota la comunitat. Tots els israelites de vint anys en amunt, distribuïts per clans i llinatges, foren censats nominalment,
 * <sup>19</sup> tal com el Senyor havia manat a Moisès. Moisès els va censar en el desert del Sinaí.<br/>
 * <sup>20-21</sup> El cens per clans i llinatges de tots i cada un dels homes de vint anys en amunt aptes per a l'exèrcit, va donar els efectius següents:<br/>
 * De la tribu de Rubèn, primogènit d'Israel, 46500.<br/>
 * <sup>22-23</sup> De la tribu de Simeó, 59300.<br/>
 * <sup>24-25</sup> De la tribu de Gad, 45650.<br/>
 * <sup>26-27</sup> De la tribu de Judà, 74600.<br/>
 * <sup>28-29</sup> De la tribu d'Issacar, 54400.<br/>
 * <sup>30-31</sup> De la tribu de Zabuló, 57400.<br/>
 * <sup>32-33</sup> De la tribu d'Efraïm, fill de Josep, 45500.<br/>
 * <sup>34-35</sup> De la tribu de Manassès, fill de Josep, 32200.<br/>
 * <sup>36-37</sup> De la tribu de Benjamí, 35400.<br/>
 * <sup>38-39</sup> De la tribu de Dan, 62600.<br/>
 * <sup>40-41</sup> De la tribu d'Aser, 41500.<br/>
 * <sup>42-43</sup> De la tribu de Neftalí, 53400.<br/>
 * <sup>44</sup> Aquest és el resultat del cens que van fer Moisès i Aaron, assistits pels dotze principals d'Israel, un per cada tribu, tots ells caps de llinatge.
 * <sup>45</sup> El total dels israelites censats per llinatges, de vint anys en amunt, aptes per a l'exèrcit,
 * </center>
 * </tt>
 * 
 * @author joan
 *
 * @param <E> és l'ENTRADA
 */
public class Nombre<E> 
	extends Paraula 	
		implements Animal<E>, Serializable {

	/**
	 * 1922671536784361380L
	 */
	private static final long serialVersionUID = 1922671536784361380L;
	
	Animal<E> déu;
	Animal<E> pare;
	Animal<E> passat;
	Class<? extends Animal<E>> classe;
	
	E element;
	
	@Override
	public Animal<E> obtenirDéu() {
		return déu;
	}
	@Override
	public Animal<E> establirDéu(Animal<E> déu) {
		Animal<E> antic = this.déu;
		this.déu = déu;
		return antic;
	}
	@Override
	public Animal<E> obtenirPare() {
		return pare;
	}
	@Override
	public Animal<E> establirPare(Animal<E> pare) {
		Animal<E> antic = pare;
		this.pare = pare;
		return antic;
	}
	@Override
	public Animal<E> obtenirPassat() {
		return passat;
	}
	@Override
	public Animal<E> establirPassat(Animal<E> passat) {
		Animal<E> antic = this.passat;
		this.passat = passat;
		return antic;
	}
	@Override
	public E obtenirEntrada() {
		return element;
	}
	@Override
	public E establirEntrada(E element) {
		E antic = this.element;
		this.element = element;
		return antic;
	}
	
	public Nombre() {
		super();
		déu = pare = passat = this;
	}
	public Nombre(Animal<E> pare) {
		super();
		establirDéu(pare.obtenirDéu());
		establirPare(pare);
		establirPassat(pare.obtenirPassat());
		obtenirPassat().establirPare(this);
		pare.establirPassat(this);
	}
	
	@Override
	public boolean establir(E e) {
		crea(getClass(), this, e);
		return true;
	}
	
	@Override
	public Ramat<E> pastor() {
		return new Pastor(obtenirPare());
	}
	@Override
	public Ramat<E> conductor() {
		return new Conductor(obtenirPassat());
	}
	@Override
	public Iterator<Animal<E>> iterator() {
		return new Iterador(obtenirPare());
	}
	private final class Iterador implements Iterator<Animal<E>> {

		/**
		 * L'animal actual.
		 */
		private Animal<E> actual;
		
		/**
		 * El següent animal.
		 */
		private Animal<E> següent;
		
		/**
		 * Si aquest iterador té un animal més
		 */
		private boolean téMés;
		
		public Iterador(Animal<E> animal) {
			següent = actual = animal;
			téMés = true;
		}
		
		@Override
		public boolean hasNext() {
			return téMés;
		}

		@Override
		public Animal<E> next() {
			Animal<E> e = següent;
			actual = e;
			següent = e.obtenirPare();
			if(e == Nombre.this)
				téMés = false;
			else téMés = true;
			return e;
		}
		@Override
		public void remove() {
			Animal<E> a = següent;
			actual.alliberar();
			if (!a.ésBuit()) {
				actual = a;
				següent = a.obtenirPare();
			} else {
				téMés = false;
			}
		}
	}
	protected final class Pastor implements Ramat<E> {
		
		/**
		 * L'animal actual.
		 */
		protected Animal<E> actual;
		
		/**
		 * El següent animal.
		 */
		protected Animal<E> següent;
		
		/**
		 * Si aquest pastor té un animal més
		 */
		protected boolean téMés;
		
		public Pastor(Animal<E> animal) {
			següent = actual = animal;
			téMés = true;
		}
		@Override
		public void alliberar() {
			Animal<E> a = següent;
			actual.alliberar();
			if (!a.ésBuit()) {
				actual = a;
				següent = a.obtenirPare();
			} else {
				téMés = false;
			}
		}
		@Override
		public boolean téMés() {
			return téMés;
		}
		@Override
		public E següent () {
			Animal<E> e = següent;
			actual = e;
			següent = e.obtenirPare();
			if(e == Nombre.this)
				téMés = false;
			else téMés = true;
//			System.out.println("ENTRADA: " + e.obtenirEntrada());
			return e.obtenirEntrada();
		}
	}
	protected final class Conductor implements Ramat<E> {
		
		/**
		 * L'animal actual.
		 */
		protected Animal<E> actual;
		
		/**
		 * El següent animal.
		 */
		protected Animal<E> següent;
		
		/**
		 * Si aquest pastor té un animal més
		 */
		protected boolean téMés;
		
		public Conductor(Animal<E> animal) {
			següent = actual = animal;
			téMés = true;
		}
		@Override
		public void alliberar() {
			Animal<E> a = següent;
			actual.alliberar();
			if (!a.ésBuit()) {
				actual = a;
				següent = a.obtenirPassat();
			} else {
				téMés = false;	
			}
		}
		@Override
		public boolean téMés() {
			return téMés;
		}
		@Override
		public E següent () {
			Animal<E> e = següent;
			actual = e;
			següent = e.obtenirPassat();
			if(e == Nombre.this)
				téMés = false;
			else téMés = true;
			return e.obtenirEntrada();
		}
	}
}