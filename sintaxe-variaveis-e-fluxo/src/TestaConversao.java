
public class TestaConversao {
	
	public static void main(String[] args) {
		double salario = 1270.50;
		
		float pontoFlutuante = 3.14f;
		
		int valor = (int) salario;
		System.out.println(valor);
		
		// Utiliza-se long para números maiores que 2 bilhões
		// long numeroGrande = 972398749279L;
		// System.out.println(numeroGrande);
		
		// Guarda apenas números pequenos
		// short valorPequeno = 2131;
		
		// Guarda apenas números menores dque 127
		// byte b = 127;
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		
		System.out.println(total);
		
	}
}
