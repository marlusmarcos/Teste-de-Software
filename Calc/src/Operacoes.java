
public class Operacoes {
	private Double v1;
	private Double v2;	
	
	public Double getV1() {
		return v1;
	}
	public void setV1(Double v1) {
		this.v1 = v1;
	}
	public Double getV2() {
		return v2;
	}
	public void setV2(Double v2) {
		this.v2 = v2;
	}
	
	public Double soma (Double v1, Double v2) {
		return v1+v2;
	}
	
	public Double sub (Double v1, Double v2) {
		return v1-v2;
	}
	
	public Double mutiplicar (Double v1, Double v2) {
		return v1*v2;
	}
	
	public Double dividir (Double v1, Double v2) throws Exception{
		try {
			if (v2!=0.0) {
				return v1/v2;
			}
		} catch (Exception e) {
			 
		}
		return null;
		
	}
	
	public Double raiz (Double v1) throws Exception {
		try {
			if (v1 >= 0) {
				return Math.sqrt(v1);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	
	
}
