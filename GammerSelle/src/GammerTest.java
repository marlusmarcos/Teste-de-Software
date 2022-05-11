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
	
	


	@Parameters
	public static  Object [][] data () {
		return new Object [][]	{
			{1,250.0, 250.0},
			{1,150.0, 130.0},
			{1,250.0, 250.0},
			{1,250.0, 250.0},
			{1,250.0, 250.0},
			{1,250.0, 250.0},
			{1,250.0, 250.0},
			{1,250.0, 250.0}
		};					
	}
//
//	@Test
//	public void testEsperado() {
//		assertEquals(esperado, CalculoImpostoRenda.calculaImposto(entrada), 0.00);
//	}

}

