package atividade03_Pilha.ex01;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite uma palavra ou frase: ");

    String texto = scanner.nextLine();

    Palindromo palindromo = new Palindromo(texto);

    System.out.println(palindromo.verificar() ? "É palíndromo" : "Não é palíndromo");

    scanner.close();
  }

}
