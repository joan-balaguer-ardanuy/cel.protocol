package cel;

import java.util.EventObject;

/**
 * <tt>
 * <center>
 * <h3>Guarició del criat d'un centurió</h3>
 * <h5>(Lc 7,1-10; Jn 4,43-54)</h5>  
 * <sup>5</sup> Jesús va entrar a Cafarnaüm. Un centurió l'anà a trobar i li suplicava:<br/>
 * <sup>6</sup> --Senyor, el meu criat és a casa al llit amb paràlisi i sofreix terriblement.<br/>
 * <sup>7</sup> Jesús li diu:<br/>
 * --Vinc a curar-lo.<br/>
 * <sup>8</sup> El centurió li respon:<br/>
 * --Senyor, jo no sóc digne que entris a casa meva; digues només una paraula i el meu criat es posarà bo.
 * <sup>9</sup> Perquè jo mateix, que estic sota les ordres d'un altre, tinc soldats a les meves ordres. I a un li dic: "Vés-te'n", i se'n va, i a un altre: "Vine", i ve, i al meu criat li mano: "Fes això", i ho fa.<br/>
 * <sup>10</sup> Quan Jesús ho sentí, en quedà admirat i digué als qui el seguien:<br/>
 * --Us asseguro que no he trobat ningú a Israel amb tanta fe.
 * <sup>11</sup> I us dic que vindrà molta gent d'orient i d'occident i s'asseuran a taula amb Abraham, Isaac i Jacob en el Regne del cel,
 * <sup>12</sup> mentre que els hereus del Regne seran llançats fora, a la tenebra; allà hi haurà els plors i el cruixit de dents.<br/>
 * <sup>13</sup> Després Jesús digué al centurió:<br/>
 * --Vés-te'n, i que es faci tal com has cregut.<br/>
 * I en aquell mateix moment el criat es va posar bo.<br/> 
 * </center>
 * </tt>
 * 
 * @author joan
 *
 * @see EventObject
 */
public class Ordre extends EventObject {

	/**
	 * -7881773520741798999L
	 */
	private static final long serialVersionUID = -7881773520741798999L;

	/**
	 * Contructor per defecte de l'{@link Ordre} per manada.
	 * @param font {@link Object} la font que mana l'{@link Ordre}
	 */
	public Ordre(Object font) {
		super(font);
	}
}