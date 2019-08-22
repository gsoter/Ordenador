package ordenador;

import java.util.Collection;

public class Ordenador {

	Double vMaior = 0.0;

	public void inserirColecao(Collection<String> pColecao) {
		for (String vString : pColecao) {
			Double vDouble = Double.parseDouble(vString);
			if (vDouble > vMaior)
				vMaior = vDouble;
		}
	}

	public void informarValor(String pValor) {
		Double dValor = Double.parseDouble(pValor);
		if (dValor > vMaior)
			vMaior = dValor;
	}

	public Double getMaiorValor() {
		return vMaior;
	}
	
	
}
