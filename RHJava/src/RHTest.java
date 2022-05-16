import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class RHTest {

	/*
	 * c1: 5
	 * c2: 17
	 * c3: 20
	 * c4: 56
	 *  
	 * */
	
	int entrada;
	String esperado;
	RH rh= new RH();
	
	public RHTest(int entrada, String esperado) {
		super();
		this.entrada = entrada;
		this.esperado = esperado;
	}

	@Parameters
	public static  Object [][] data () {
		return new Object [] []	{
			{5,"não empregar"}, 
			{17, "pode ser empregado em tempo parcial"},
			{20,"pode ser empregado tempo parcial"}, 
			{56, "não empregar"}
		};					
	}


	@Test
	public void test() throws Exception {
		assertEquals(esperado, rh.recomendacaoCandidato(entrada));
	}
	
	@Test (expected = Exception.class)
	public void exceptionTest () throws Exception {
		assertEquals("erro",rh.recomendacaoCandidato(-1));
		assertEquals("",rh.recomendacaoCandidato(18));
		assertEquals("",rh.recomendacaoCandidato(16));
		assertEquals("",rh.recomendacaoCandidato(55));
		assertEquals("",rh.recomendacaoCandidato(99));


	}

}
