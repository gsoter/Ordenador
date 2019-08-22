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
		assertTrue(o.vMaior == 9);
	}	

	@Test
	public void testeInformarValorNumerico() {
		String pValor = "3";
		o.vMaior = 2.0;
		o.informarValor(pValor);

		assertTrue(o.vMaior == 3.0);
	}

	@After
	public void finalizar() {
		o = null;
		System.gc();
	}

	@Test
	public void testeInformarValorNumerico() {
		String pValor = "3";
		o.vMaior = 2.0;
		o.informarValor(pValor);

		assertTrue(o.vMaior == 3.0);
	}

	@Test
	public void testeMaiorValor() {
		o.vMaior = 10.0;
		assertTrue(o.getMaiorValor() == 10.0);
	}

	@After
	public void finalizar() {
		o = null;
		System.gc();
	}
}
