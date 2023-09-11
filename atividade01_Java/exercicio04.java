package atividade01_Java;

import java.util.Scanner;

public class exercicio04 {
  public static void main(String[] args) {
    int n = 0;
    Scanner scan = new Scanner(System.in);
    n = scan.nextInt();

    int f[] = new int[n + 2];

    f[0] = 1;
    f[1] = 1;

    System.out.print(f[0] + " " + f[1] + " ");

    for (int i = 2; i < n; i++) {
      f[i] = f[i - 1] + f[i - 2];
      System.out.print(f[i] + " ");
    }

    scan.close();

  }
}