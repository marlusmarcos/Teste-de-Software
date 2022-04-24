package param;
//Aluno: Marlus Marcos
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ImpostoTeste {
	
	public double entrada;
	public double esperado;
	
	

	public ImpostoTeste(double entrada, double esperado) {
		super();
		this.entrada = entrada;
		this.esperado = esperado;
	}

	@Parameters
	public static  Object [][] data () {
		return new Object [] []	{
			{100,0.0},
			{1000, 0.0},
			{1500,150.0},
			{15000, 3000.0}
		};					
	}


	@Test
	public void test() {
		assertEquals(esperado, CalculoImpostoRenda.calculaImposto(entrada), 0.00);
	}

}