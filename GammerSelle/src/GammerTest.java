import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class GammerTest {

	public int entrada;
	public double valor;
	public double esperado;
	
	GameSeller game = new GameSeller();
	
	public GammerTest(int entrada, double valor, double esperado) {
		super();
		this.entrada = entrada;
		this.valor = valor;
		this.esperado = esperado;
	}

	@Parameters
	public static  Object [][] data () {
		return new Object [][]	{
			{1,200.0, 200.0}, //menor que o limte
			{1,199.0, 229.0}, // limite
			{1,201.0, 201.0}, // maior que o limite
			{2,250.0, 250.0}, // valor maior que 0
			{2,1.0, 1.0}, // primeiro valor maior que 0
			{3,100.0, 130.0}, // valor 
			{3,99.0, 129.0}, // valor menor uma unidade
			{3,101.0, 121.0} // valor maior uma unidade 
		};					
	}
//
	@Test
	public void testEsperado() throws ArgumentoInvalidoException {
		assertEquals(game.calculaPreco(entrada, valor),esperado, 0.00);
	}
	
	
	@Test (expected = ArgumentoInvalidoException.class)
	public void testNegativo () throws ArgumentoInvalidoException {
		GameSeller game2 = new GameSeller();
		
		assertEquals(game2.calculaPreco(1, -1), 0,0.0);
	}
	/*
	 * @Test 
	public void testNegativo () throws ArgumentoInvalidoException {
		GameSeller game2 = new GameSeller();
		try {
			assertEquals(game2.calculaPreco(1, -1), 0,0.0);
			fail ("erro entrada");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}*/

}

