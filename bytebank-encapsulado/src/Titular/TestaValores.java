package Titular;

public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		/* conta está inconsistente
		conta.setAgencia(-50);
		conta.setNumero(-330); */
		Conta conta2 = new Conta(1337, 22222);
		
		System.out.println(Conta.getTotal());
	}

}
