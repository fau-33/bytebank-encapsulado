public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("O total de contas " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 100;
		System.out.println("estou criando uma conta " + this.numero);
	}
	
	
	public static int getTotal() {
		return Conta.total;
	}


	public static void setTotal(int total) {
		Conta.total = total;
	}


	// métodos
	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= saldo) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}else {
			return false;
		}
	}
	
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Não pode números <= 0");
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	} 
	
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Não pode valores menores ou igual a zero");
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	
	
	
	
	
	
	
}