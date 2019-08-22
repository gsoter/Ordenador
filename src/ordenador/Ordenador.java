package ordenador;

import java.util.Collection;

public class Ordenador {

	Double vMaior = 0.0;

	public void inserirColecao(Collection<String> pColecao) {
		Double temp = null;
		for (String vString : pColecao) {
			Double vDouble = Double.parseDouble(vString);
			if (vDouble > vMaior)
				vMaior = vDouble;
		}
	}
}
