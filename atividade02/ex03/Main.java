package ex03;

public class Main {
	public static void main(String[] args) {

		Trabalhador trabalhador1 = new Trabalhador();
		trabalhador1.setNome("Fernando");
		trabalhador1.setSalario(10000);
		trabalhador1.setCpf("123.456.789-00");
		trabalhador1.setIdade(22);
		trabalhador1.setSexo('M');
		trabalhador1.setEndereco("Rua Cornelia, 4");

		trabalhador1.mostra();
		trabalhador1.calculaSalarioAnual();

		System.out.println("");

		Trabalhador trabalhador2 = new Trabalhador("Lidia", 9500, "987.654.321-00", 20, 'F', "Rua Cornelia, 4");

		trabalhador2.mostra();
		trabalhador2.calculaSalarioAnual();
	}
}
