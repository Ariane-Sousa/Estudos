package bytebank_herdado;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario ariane = new Funcionario();
		ariane.setNome("Ariane Sousa");
		ariane.setCpf("21232323232-9");
		ariane.setSalario(2600.00);
		
		System.out.println(ariane.getNome());
		System.out.println(ariane.getBonificacao());

	}

}
