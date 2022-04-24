package temperature;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ConversorTeste {
	public Temperatura celsius = new Celsius();
	public Temperatura fahrenheit = new Fahrenheit();
	
	public List<Celsius> listC = new ArrayList<Celsius>();
	public List<Fahrenheit> listFahrenheit = new ArrayList<Fahrenheit>();
	
	public ConversorTeste(Temperatura celsius, Temperatura fahrenheit) {
		super();
		this.celsius = celsius;
		this.fahrenheit = fahrenheit;
	}

	@Parameters
	public static Object [][] dataCtoF () {
		return new Object[][] {
			{
				
			}
		};
		
	}
	


	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
