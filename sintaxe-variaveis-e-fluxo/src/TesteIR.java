
public class TesteIR {
	
	public static void main(String[] args) {
		
		double salario = 3300.0;
		
		if (salario <= 2800.0) {
			System.out.println("IR de 7.5%");
			System.out.println("Pode deduzir R$ 142.");
		} if (salario >= 2800.0 && salario <= 3751.0) {
			System.out.println("IR de 15%");
			System.out.println("Pode deduzir R$ 350.");
		} if (salario > 3751.0 && salario <= 4464.0) {
			System.out.println("IR de 22.5%");
			System.out.println("Pode deduzir R$ 636.");
		}
	}
}
