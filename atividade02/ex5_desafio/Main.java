package ex5_desafio;

import java.util.*;

public class Main {
  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe uma frase para testar se é palindromo: ");
    Palindromo palindromo = new Palindromo(scanner.nextLine());

    System.out.println(palindromo.verificar() ? "É palindromo" : "Não é palindromo");
  }
}
