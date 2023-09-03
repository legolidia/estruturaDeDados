//devido a problemas com o terminal, deve-se usar o comando chcp 1252 no windows para que o programa funcione corretamente com acentos

package ex5_desafio;

import java.util.*;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe uma frase para testar se eh palindromo: ");
    Palindromo palindromo = new Palindromo(scanner.nextLine());

    while (true) {
      System.out.println(palindromo.verificar() ? "Eh palindromo" : "Nao eh palindromo");
      System.out.println("\nDigite uma nova frase ou /sair");
      palindromo.setTexto(scanner.nextLine());
      if (palindromo.getTexto().equals("/sair"))
        break;
    }

    scanner.close();
  }
}
