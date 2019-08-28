package ordenador;

import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

public class OrdenadorTeste {

	Ordenador o;

	@Before
	public void iniciar() {
		o = new Ordenador();
	}

	@Test
	public void testeInserirColecaoNumerica() {
		Collection<String> pColecao = new ArrayList<String>();
		pColecao.add("2");
		pColecao.add("4");
		pColecao.add("6");
		pColecao.add("8");
		pColecao.add("9");
		pColecao.add("3");
		pColecao.add("7");
		pColecao.add("5");
		pColecao.add("1");

		o.inserirColecao(pColecao);
		assertNotNull(o.getColecao());
	}

	@Test
	public void testeInformarValorNumerico() {
		String pValor = "3";
		o.setValorMaior(2.0);
		o.informarValor(pValor);

		assertTrue(o.getValorMaior() == 3.0);
	}

	@Test
	public void testeValorMaiorColecao() {
		Collection<String> pColecao = new ArrayList<String>();
		pColecao.add("18");
		pColecao.add("13");
		pColecao.add("10");
		pColecao.add("12");
		pColecao.add("11");
		pColecao.add("14");
		pColecao.add("16");
		pColecao.add("17");
		pColecao.add("19");
		pColecao.add("15");
		o.inserirColecao(pColecao);

		assertTrue(o.getValorMaior() == 19);
	}

	@Test
	public void testeValorMenor() {
		String valor = "20.0";

		o.setValorMenor(50.0);
		o.informarValor(valor);

		assertTrue(o.getValorMenor() == 20.0);
	}

	@Test
	public void testeValorMedio() {
		Collection<String> pColecao = new ArrayList<String>();
		pColecao.add("5");
		pColecao.add("3");
		pColecao.add("10");
		pColecao.add("2");
		pColecao.add("1");
		pColecao.add("4");
		pColecao.add("6");
		pColecao.add("7");
		pColecao.add("9");
		pColecao.add("8");
		o.inserirColecao(pColecao);

		Double expected = 5.5;

		assertEquals(expected, o.getValorMedio());
	}

	@Test
	public void testeValorMedianoPar() {
		Collection<String> pColecao = new ArrayList<String>();
		pColecao.add("5");
		pColecao.add("3");
		pColecao.add("10");
		pColecao.add("2");
		pColecao.add("1");
		pColecao.add("4");
		pColecao.add("6");
		pColecao.add("7");
		pColecao.add("9");
		pColecao.add("8");
		o.inserirColecao(pColecao);

		Double expected = 5.0;

		assertEquals(expected, o.getValorMediano());
	}

	@Test
	public void testeValorMedianoImpar() {
		Collection<String> pColecao = new ArrayList<String>();
		pColecao.add("5");
		pColecao.add("3");
		pColecao.add("2");
		pColecao.add("1");
		pColecao.add("4");
		pColecao.add("6");
		pColecao.add("7");
		o.inserirColecao(pColecao);

		Double expected = 4.0;

		assertEquals(expected, o.getValorMediano());
	}

	@After
	public void finalizar() {
		o = null;
		System.gc();
	}
}
