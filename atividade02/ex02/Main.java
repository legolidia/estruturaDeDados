package ex02;

public class Main {
	public static void main(String[] args) {
		Circulo c = new Circulo(5);
		float d = 0, a = 0;

		c.setRaio(-3);
		c.setRaio(7);

		d = c.calculaDiametro();
		a = c.calculaArea();

		c.mostraDados();
	}
}