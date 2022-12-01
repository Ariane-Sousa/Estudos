package bytebank_herdado;

// Gerente é um Funcionário, Gerente herda da class Funcionário
public class EditorVideo extends Funcionario {
	
	public double getBonificacao(){
		return super.getSalario() + 100 ; // Salario vem de cima (Class Funcionario)
	}
	
}
