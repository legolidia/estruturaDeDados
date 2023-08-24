package ex02;

public class Circulo {
	float raio;
	
	public Circulo(float raio) {
		this.raio = raio;
	}
	
	public void setRaio(float raio) {
		if(raio>0)
			this.raio = raio;
		else
			System.out.println("raio deve ser positivo");
	}
	
	public float getRaio() {
		return raio;
	}
	
	public float calculaDiametro() {
		return raio*2;
	}
	
	public float calculaArea() {
		return (float) (Math.PI * Math.pow(raio, 2));
	}
	
	public void mostraDados() {
		System.out.println("Raio: " + this.getRaio() + "\nDiametro: " + this.calculaDiametro() + "\nArea: " + this.calculaArea());
	}
}
