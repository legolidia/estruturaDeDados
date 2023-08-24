package ex01;

public class Main {
	public static void main(String[] args) {

		Carro miata = new Carro();

		miata.setAno(1989);
		miata.setMarca("Mazda Motor Corporation");
		miata.setModelo("MX-5");
		miata.setCategoria("JDM");

		Carro miniCooper = new Carro(2023, "BMW Group", "Cabrio", "S");

		System.out.println(
				"Carro 1: \n" + miata.getAno() + " " + miata.getMarca() + " " + miata.getModelo() + " " + miata.getCategoria());
		System.out.println("Carro 2: \n" + miniCooper.getAno() + " " + miniCooper.getMarca() + " " + miniCooper.getModelo()
				+ " " + miniCooper.getCategoria());

	}
}