import java.util.Scanner;

class exercicio02 {
  /**
   * @param args
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite o horário de PARTIDA:");
    String T1 = scan.nextLine();
    String arr[] = T1.split(":");
    int t1 = 0;
    t1 += Integer.parseInt(arr[0]) * 3600;
    t1 += Integer.parseInt(arr[1]) * 60;
    t1 += Integer.parseInt(arr[2]);

    System.out.println("Digite o horário de CHEGADA:");
    String T2 = scan.nextLine();
    arr = T2.split(":");
    int t2 = 0;
    t2 += Integer.parseInt(arr[0]) * 3600;
    t2 += Integer.parseInt(arr[1]) * 60;
    t2 += Integer.parseInt(arr[2]);

    int tF = t2 - t1;
    int h = tF / 3600;
    int min = (tF % 3600) / 60;
    int s = (tF % 3600) % 60;

    float total = h * 10 + min * 0.2f + s * 0.02f;

    System.out.format("A viagem começou às %s e terminou às %s.\n", T1, T2);

    System.out.format("A duração da viagem foi de %d horas, %d minutos e %d segundos, totalizando R$%.2f.", h, min, s,
        total);

    scan.close();
  }
}
