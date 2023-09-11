package atividade03_Pilha.ex03;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite uma expressão: ");
    String texto = scanner.nextLine();

    Expressoes expressoes = new Expressoes(texto);
     
    System.out.println(expressoes.verificar() ? "É expressão válida" : "Não é expressão válida");

    scanner.close();
  }

}
