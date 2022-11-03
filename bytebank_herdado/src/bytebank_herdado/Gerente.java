package bytebank_herdado;

// Gerente é um Funcionário, Gerente herda da class Funcionário
public class Gerente extends Funcionario {
	
	private int senha;
	
	public Gerente() {	
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	public double getBonificacao(){
		return super.salario ; // Salario vem de cima (Class Funcionario)
	}
	
}
