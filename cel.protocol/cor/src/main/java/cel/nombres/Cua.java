package cel.nombres;

import cel.Nombre;
import cel.arca.Animal;
import cel.arca.Ase;

/**
 * <tt>
 * <center>
 * <h3>La dona i el drac</h3>
 * <big>12</big>
 * <sup>1</sup> Llavors aparegué al cel un gran senyal prodigiós: una dona que tenia el sol per vestit, amb la lluna sota els peus, i duia al cap una corona de dotze estrelles.
 * <sup>2</sup> Esperava un fill i cridava afligida pels dolors del part.<br/>
 * <sup>3</sup> També aparegué al cel un altre senyal prodigiós: un gran drac roig que tenia set caps i deu banyes. Als set caps hi duia set diademes,
 * <sup>4</sup> i la seva cua va arrossegar la tercera part de les estrelles del cel i les llançà a la terra.<br/>
 * El drac es va aturar davant la dona que havia d'infantar per devorar-li el fill així que nasqués.
 * <sup>5</sup> La dona va posar al món un fill, un noi que ha de governar totes les nacions amb una vara de ferro. El fill de la dona va ser endut cap a Déu i cap al seu tron,
 * <sup>6</sup> i ella va fugir al desert, on Déu li havia preparat un lloc, perquè l'alimentessin allà mil dos-cents seixanta dies.<br/>
 * <sup>7</sup> Aleshores va esclatar una batalla al cel: Miquel i els seus àngels combatien contra el drac. El drac també lluitava juntament amb els seus àngels,
 * <sup>8</sup> però no va poder guanyar, i perderen el lloc que ocupaven al cel.
 * <sup>9</sup> El gran drac, la serp antiga, l'anomenat diable i Satanàs, el qui enganya el món sencer, va ser llançat a la terra, i també els seus àngels hi foren llançats amb ell.
 * <sup>10</sup> Llavors vaig sentir al cel una veu forta que proclamava:<br/>
 * --Ara és l'hora de la salvació,<br/>
 * del poder i del regnat del nostre Déu,<br/>
 * i el seu Messies ja governa,<br/>
 * perquè l'acusador dels nostres germans,<br/>
 * el qui els acusava nit i dia<br/>
 * davant el nostre Déu,<br/>
 * ha estat expulsat.<br/>
 * <sup>11</sup> Ells l'han vençut<br/>
 * per la sang de l'Anyell<br/>
 * i pel testimoniatge del seu martiri,<br/>
 * ja que no van estimar tant la vida<br/>
 * que els fes por la mort.<br/>
 * <sup>12</sup> Alegreu-vos-en, cel<br/>
 * i tots els qui hi habiteu!<br/>
 * Ai de la terra i del mar,<br/>
 * perquè ha baixat cap a vosaltres<br/>
 * el diable, ple de fúria,<br/>
 * sabent que el temps se li acaba!<br/>
 * <sup>13</sup> Quan el drac es veié llançat a la terra, va perseguir la dona que havia infantat el noi;
 * <sup>14</sup> però la dona va rebre les dues ales de la gran àguila perquè volés fins al desert, al lloc que Déu li havia preparat, on havia de ser alimentada, lluny de la serp, un temps, dos temps i la meitat d'un temps.
 * <sup>15</sup> Llavors la serp va vomitar com una riuada d'aigua darrere la dona perquè el corrent se l'emportés.
 * <sup>16</sup> Però la terra va ajudar la dona: s'obrí i va engolir la riuada que el drac havia vomitat.
 * <sup>17</sup> El drac, ple de ràbia contra la dona, se n'anà a combatre contra la resta dels seus descendents, contra els qui guarden els manaments de Déu i mantenen ferm el testimoni de Jesús.<br/>
 * <sup>18</sup> I el drac es deturà a la vora de la mar.<br/>
 * </center>
 * </tt>
 * 
 * @author joan
 *
 * @param <E> és l'ENTRADA
 */
public class Cua<E>
	extends Nombre<E>
		implements Ase<E> {

	private static final long serialVersionUID = 8719541832719994618L;

	public Cua() {
		super();
	}
	public Cua(Animal<E> pare, E entrada) {
		super(pare);
		establirEntrada(entrada);
	}

}