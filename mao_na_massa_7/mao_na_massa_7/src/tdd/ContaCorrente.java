package tdd;

import java.util.Date;

public class ContaCorrente {
	
	public ContaCorrente () {}
	private int saldo = 0;
	private String nome;
	
	String extrato_esperado = 
			"Saldo Inicial $0\n" +
			"Saldo Final $0\n" +
			"Nenhuma trasacao realizada\n";;
	
	Deposito deposito = new Deposito(null, 0);

	public ContaCorrente(int saldo) {
		this.saldo = saldo;
	}
	
	public ContaCorrente (String nome) {
		extrato_esperado = "Conta de "+nome+"\n"+extrato_esperado;
	}
	
	public int saldo () {
		return this.saldo;
	}
	
	public String extrato () {
		return this.extrato_esperado;
	}
	
	public int creditar (Deposito deposito) {
		return this.saldo += deposito.valor;
	}

}
