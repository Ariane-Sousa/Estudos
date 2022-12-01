package bytebank_herdado;

// Gerente é um Funcionário Auntenticavel, Gerente herda da class Funcionário
public class Gerente extends Funcionario{
	
	public double getBonificacao(){
		return super.getSalario() ; // Salario vem de cima (Class Funcionario)
	}
	
}
