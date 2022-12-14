
public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	static int total;

	public Conta(int agencia, int numero) {
		Conta.total++;
		// System.out.println("O total de contas é " + total);
		this.agencia = agencia;
		this.numero = numero;
		// System.out.println("Estou criando uma conta");
	}
	
	public abstract void deposita(double valor);
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if (this.saca(valor)) {
			destino.deposita(valor);
			return true;
		}
		return false;
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Não pode valor menor ou igual a zero.");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Não pode valor menor ou igual a zero");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal(){
		System.out.println(total);
		return Conta.total;
	}
}