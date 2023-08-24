package ex01;

public class Carro {
	private int ano;
	private String marca;
	private String modelo;
	private String categoria;
	
	public Carro() {
		
	}
	
	public Carro(int ano, String marca, String modelo,String categoria) {
		this.ano = ano;
		this.marca = marca;
		this.modelo = modelo;
		this.categoria = categoria;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getMarca(){
		return marca;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	
	
	
}
