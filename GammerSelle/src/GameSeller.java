//MÃO NA MASSA
//Questão 1
//a) Defina casos de testes baseado no critério Particionamento em Classes de Equivalência para
//o método abaixo.
//b) Crie uma classe de testes parametrizados para estes casos de teste que atendem ao critério.
//c) Agora construa testes JUnit para exercitar estas entradas.
public class GameSeller {
	public static int JOGO_TABULEIRO = 1;	
	public static int JOGO_STREAM = 2;
	public static int JOGO_DVD = 3;
	/* Este método retorna o preço calculado para um Jogo comprado na loja virtual GameSeller. Se
	o Jogo for de tabuleiro a cobrança do frete deve ser de 30 reais em todas as compras abaixo de
	200 reais, caso contrário o frete será grátis. Se o jogo for STREAM nunca será comprado frete.
	Se o jogo for em DVD o valor de frete será de 30 reais (para compras até 100 reais) e de 20 reais
	para compras superiores a 100 reais. Caso algum dos parâmetros seja invalido o método deve
	lançar ArgumentoInvalidoException */
	public double calculaPreco (int tipoJogo, double valor) throws ArgumentoInvalidoException
	{
		if (valor < 0 || tipoJogo > 3 && tipoJogo < 1) {
			throw new ArgumentoInvalidoException("erro entrada");
		} else {
		
		if (tipoJogo == 1 && valor >= 0.0) {
			return valor < 200? valor + 30 : valor; 
		}
		if (tipoJogo == 2 && valor >= 0.0) {
			return valor; 
		} else {
			return valor <= 100? valor+30 : valor +20;
		}
		}
	}
}