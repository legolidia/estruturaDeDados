package ex03;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		final int MAX_TRABALHADOR = 50;
		Trabalhador[] trabalhadores = new Trabalhador[MAX_TRABALHADOR];
		Scanner scan = new Scanner(System.in);

		System.out.println("\nDigite o número de trabalhadores:");
		int n = scan.nextInt();

		while (n > MAX_TRABALHADOR || n <= 0) {
			System.out.println("\nNúmero de trabalhadores inválido. Digite novamente:");
			n = scan.nextInt();
		}
		
		scan.nextLine();

		System.out.println("\nDigite os dados dos trabalhadores:");

		for (int i = 0; i < n; i++) {
			System.out.println("\nTrabalhador " + (i + 1) + ":");

			System.out.println("Nome: ");
			String nome = scan.nextLine();

			System.out.println("Salário: ");
			float salario = Float.parseFloat(scan.nextLine());

			System.out.println("CPF: ");
			String cpf = scan.nextLine();

			System.out.println("Idade: ");
			int idade = Integer.parseInt(scan.nextLine());

			System.out.println("Sexo: (M ou F)");
			char sexo = scan.nextLine().charAt(0);
			sexo = Character.toUpperCase(sexo);

			System.out.println("Endereço: ");
			String endereco = scan.nextLine();

			trabalhadores[i] = new Trabalhador(nome, salario, cpf, idade, sexo, endereco);
		}

		float mediaSalario = 0.0f;

		float maiorSalario = trabalhadores[0].getSalario();
		Trabalhador trabMaiorSalario = trabalhadores[0];

		float menorSalarioMulher = 0f;
		Trabalhador trabMenorSalarioMulher = new Trabalhador();

		for (int i = 0; i < n; i++) {
			mediaSalario += trabalhadores[i].getSalario();

			if (trabalhadores[i].getSalario() > maiorSalario) {
				maiorSalario = trabalhadores[i].getSalario();
				trabMaiorSalario = trabalhadores[i];
			}
		}

		mediaSalario /= n;

		System.out.format("\nA média salarial é de R$%.2f", mediaSalario);

		System.out.println("\n\nHomens com salário acima da média:");
		int j = 0;

		for (int i = 0; i < n; i++) 
			if (trabalhadores[i].getSalario() > mediaSalario && trabalhadores[i].getSexo() == 'M') {
				trabalhadores[i].mostra();
				j++;
			}
		
		if (j == 0)
			System.out.println("Não há homens com salário acima da média.");

		double mediaAcima30 = 0.0;

		for (int i = 0; i < n; i++)
			if (trabalhadores[i].getIdade() > 30 && trabalhadores[i].getSexo() == 'M')
				mediaAcima30 += trabalhadores[i].getSalario();

		mediaAcima30 /= n;

		System.out.println("\nA média salarial de homens com mais de 30 anos é de R$" + mediaAcima30 + "\n");

		int qtdAbaixoMedia = 0;

		for (int i = 0; i < n; i++)
			if (trabalhadores[i].getSalario() < mediaAcima30 && trabalhadores[i].getSexo() == 'M')
				qtdAbaixoMedia++;

		if (qtdAbaixoMedia > 0)
			System.out.println((qtdAbaixoMedia == 1)
					? "\n" + qtdAbaixoMedia + " homem ganha abaixo da média salarial de homens com mais de 30 anos."
					: "\n" + qtdAbaixoMedia + " homens ganham abaixo da média salarial de homens com mais de 30 anos.");
		else
			System.out.println("\nNão há homens com salário abaixo da média salarial de homens com mais de 30 anos.");

		System.out
				.format("\nO trabalhador que ganha mais é " + trabMaiorSalario.getNome() + " com salário de R$%.2f\n",
						maiorSalario);

		trabMaiorSalario.mostra();

		for (int i = 0; i < n; i++)
			if (trabalhadores[i].getSexo() == 'F') {
				menorSalarioMulher = trabalhadores[i].getSalario();
				trabMenorSalarioMulher = trabalhadores[i];
				break;
			}

		for (int i = 0; i < n; i++)
			if (trabalhadores[i].getSexo() == 'F' && trabalhadores[i].getSalario() < menorSalarioMulher) {
				menorSalarioMulher = trabalhadores[i].getSalario();
				trabMenorSalarioMulher = trabalhadores[i];
			}

		System.out.format("\nO trabalhador do sexo feminino com menor salário é " + trabMenorSalarioMulher.getNome()
				+ " com salário de R$%.2f\n", menorSalarioMulher);
		trabMenorSalarioMulher.mostra();

		scan.close();
	}
}
