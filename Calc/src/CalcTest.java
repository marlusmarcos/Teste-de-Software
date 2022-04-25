import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {
	Operacoes op = new Operacoes();

	
	
	@Test
	public void testSomar () {
		assertEquals(10.0, op.soma(5.0, 5.0), 0.00);
	}
	
	@Test
	public void testeSub () {
		assertEquals(0.0, op.sub(5.0, 5.0), 0.00);
	}
	@Test
	public void testMulti () {
		assertEquals(25.0, op.mutiplicar(5.0, 5.0), 0.00);
	}
	
	@Test (expected = Exception.class)
	public void testDivisaoeXEPTION () throws Exception {
		System.out.println(op.dividir(5.0, 0.0));
		assertEquals(0.0, op.dividir(5.0, 0.0), 0.00);
	}
	@Test 
	public void testDivisao () throws Exception {
		System.out.println(op.dividir(5.0, 5.0));
		assertEquals(1.0, op.dividir(5.0, 5.0), 0.00);
	}
	
	@Test
	public void testRaiz () throws Exception {
		assertEquals(5.0, op.raiz(25.0),0.00);
	}
	@Test (expected = Exception.class)
	public void testRaizException () throws Exception {
		assertEquals(5.0, op.raiz(-25.0),0.00);
	}
	
	

}
