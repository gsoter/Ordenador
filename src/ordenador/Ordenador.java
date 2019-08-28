package ordenador;

import java.util.Collection;

public class Ordenador {

	private Double vMaior = 0.0;
	private Double vMenor = 0.0;
	private Collection<String> colecao = null;

	public void inserirColecao(Collection<String> pColecao) {
		this.colecao = pColecao;
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
		if(dValor < vMenor)
			vMenor = dValor;
	}

	public Double getValorMaior() {
		return this.vMaior;
	}

	public void setValorMaior(Double valor) {
		this.vMaior = valor;
	}

	public Double getValorMenor() {
		return this.vMenor;
	}

	public void setValorMenor(Double valor) {
		this.vMenor = valor;
	}

	public Collection<String> getColecao() {
		return colecao;
	}
}
