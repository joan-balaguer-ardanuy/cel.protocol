package cel.nombres;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

import cel.arca.Serp;

public class Entrada<K,V> extends Nombre<Serp<K,V>> implements Serp<K,V> {

	private static final long serialVersionUID = -3289806782501997828L;

	@Override
	public K obtenirClau() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public K establirClau(K clau) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V obtenirValor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V establirValor(V valor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V obtenirValor(K clau) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean contéClau(Object clau) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contéValor(Object valor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public V obtenirValorPerDefecte(K clau, V valorPerDefecte) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long índexDeClau(K clau) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public V establirValor(K clau, V valor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V establirValorSiAbsent(K clau, V valor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V reemplaçarValor(K clau, V valor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean reemplaçarValor(K clau, V valorAntic, V valorNou) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void reemplaçarTotsElsValors(BiFunction<? super K, ? super V, ? extends V> funció) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public V alliberarValor(K clau) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean alliberarValor(K clau, V valor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void perCadaValor(BiConsumer<? super K, ? super V> acció) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public V processarValorSiAbsent(K clau, Function<? super K, ? extends V> funcióUnificació) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V processarValorSiPresent(K clau, BiFunction<? super K, ? super V, ? extends V> funcióUnificació) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V processarValor(K clau, BiFunction<? super K, ? super V, ? extends V> funcióUnificació) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V unirValor(K clau, V valor, BiFunction<? super V, ? super V, ? extends V> funcióUnificació) {
		// TODO Auto-generated method stub
		return null;
	}

}