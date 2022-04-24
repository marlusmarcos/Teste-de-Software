package tdd;

import java.util.Date;

public class ContaCorrente {
	private int saldo;
	private String nome;
	private String data;
	
	String extrato_esperado = "Nenhuma trasacao realizada\n";
	Deposito deposito_ = new Deposito();

	
	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo += saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getExtrato_esperado() {
		return extrato_esperado;
	}

	public void setExtrato_esperado(String extrato_esperado) {
		this.extrato_esperado = extrato_esperado;
	}


	public Deposito getDeposito_() {
		return deposito_;
	}


	public void setDeposito_(Deposito deposito_) {
		this.deposito_ = deposito_;
	}


	public ContaCorrente () {
		//this.saldo = deposito.valor;
		extrato_esperado = "Conta de James Grenning\n" +
				"Saldo Inicial $0\n"+
				"Saldo Final $"+ getSaldo()+"\n" +
				data+ "\tDeposito\t" +saldo+  "\n";
	}
	
	
	
	

	public ContaCorrente(String nome, int saldo) {
		super();
		this.saldo = saldo;
		this.nome = nome;
		extrato_esperado = "Conta de "+nome+"\n"+
				"Saldo Inicial $"+saldo+"\n"+
				"Saldo Final $" + saldo+ "\n"+
					extrato_esperado;
	}

	public ContaCorrente(int saldo) {
		this.saldo = saldo;
	}
	
	public ContaCorrente (String nome) {
		extrato_esperado = "Conta de "+nome+"\n"+
				"Saldo Inicial $"+saldo+"\n"+
				"Saldo Final $" + saldo+ "\n"+
					extrato_esperado;
	}
	
	public int saldo () {
		return this.saldo;
	}
	
	public String extrato () {
		return this.extrato_esperado;
	}
	
	public int creditar (Deposito deposito) {
		setData(deposito.data); 
		setSaldo(deposito.valor);
		return this.saldo;
	}

}
