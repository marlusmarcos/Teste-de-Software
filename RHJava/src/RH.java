
public class RH {

	public String recomendacaoCandidato (int idade) throws Exception{
	 
		if (idade >0 && idade < 99) {
			if (idade > 0 && idade < 16) {
				return "não empregar";
			}
			if (idade >= 16 && idade < 18) {
				return "pode ser empregado em tempo parcial";
			}
			if (idade >= 18 && idade <= 55) {
				return "pode ser empregado tempo parcial";
			}
			if (idade >= 55 && idade < 99) {
				return "não empregar";
			}
		} else {
			throw new Exception();
		}
		
		return null;
		
		
	}

}

