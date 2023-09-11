package atividade03_Pilha.ex02;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite uma data no formato DD/MM/YYYY:");
    String texto = scanner.nextLine();

    while(!new Palindromo(texto).verificaFormatoData()){
      System.out.print("Formato inválido!!! Digite uma data no formato DD/MM/YYYY:");
      texto = scanner.nextLine();
    }

    Palindromo palindromo = new Palindromo(texto);

    System.out.println(palindromo.verificar() ? "É data palíndromo" : "Não é data palíndromo");

    scanner.close();
  }

}
