package ordenador;

import java.util.ArrayList;
import java.util.Collection;

public class Ordenador {

	private Double vMaior = 0.0;
	private Double vMenor = 0.0;
	private Double vMedio = 0.0;
	private Collection<String> colecao = new ArrayList<String>();

	public void inserirColecao(Collection<String> pColecao) {
		this.colecao = pColecao;
		for (String vString : pColecao) {
			Double vDouble = Double.parseDouble(vString);
			if (vDouble > vMaior)
				vMaior = vDouble;
			if (vDouble < vMenor)
				vMenor = vDouble;
		}
	}

	public void informarValor(String pValor) {
		Double dValor = Double.parseDouble(pValor);
		if (dValor > vMaior)
			vMaior = dValor;
		if (dValor < vMenor)
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

	public Double getValorMedio() {
		Double total = 0.0;
		int tamanho = getColecao().size();
		for (String string : getColecao()) {
			Double valor = Double.parseDouble(string);
			total = total + valor;
		}
		return this.vMedio = total / tamanho;
	}

	public Double getValorMediano() {
		Double mediano = 0.0;
		int inicio = 1;
		int tamanho = colecao.size();
		if ((tamanho % 2) == 0) {
			Double val1 = Double.parseDouble((String) colecao.toArray()[tamanho / 2]);
			Double val2 = Double.parseDouble((String) colecao.toArray()[(tamanho / 2) + 1]);
			mediano = (val1 + val2) / 2;
		} else {
			int mid = ((tamanho-inicio)/2) + inicio ;
			mediano = Double.parseDouble((String) colecao.toArray()[mid]);
		}
		return mediano;
	}

}
