
public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 16 ;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >=2;
		// || -> ou
		// && -> e
		
		System.out.println("Valor de acompanhado = " + acompanhado);
		if (idade >= 18 || acompanhado) {
			System.out.println("Seja Bem-Vindo!");
		} else {
			System.out.println("Infelizmente você não pode entrar.");
		}
			
		}
	}

