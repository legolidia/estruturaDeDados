package ex03;

public class Trabalhador {
	private String nome;
	private float salario;
	private String cpf;
	private int idade;
	private char sexo;
	private String endereco;

	public Trabalhador() {
	}

	public Trabalhador(String nome, float salario, String cpf, int idade, char sexo, String endereco) {
		this.nome = nome;
		this.salario = salario;
		this.cpf = cpf;
		this.idade = idade;
		this.sexo = sexo;
		this.endereco = endereco;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return this.nome;
	}

	public float getSalario() {
		return this.salario;
	}

	public String getCpf() {
		return this.cpf;
	}

	public int getIdade() {
		return this.idade;
	}

	public char getSexo() {
		return this.sexo;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void mostra() {
		System.out.println("Nome: " + this.nome);
		System.out.format("Salário: R$%.2f\n", this.salario);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Idade: " + this.idade);
		System.out.println("Sexo: " + this.sexo);
		System.out.println("Endereço: " + this.endereco);
	}

	public void calculaSalarioAnual() {
		System.out.format("Salário anual: R$%.2f\n", this.salario * 12);
	}

}
