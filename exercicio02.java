import java.util.Scanner;

class exercicio02 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int h1, min1, s1;

    System.out.println("Digite o horário de PARTIDA:");

    System.out.println("Hora:");
    h1 = s.nextInt();

    System.out.println("Minutos:");
    min1 = s.nextInt();

    System.out.println("Segundos:");
    s1 = s.nextInt();

    int h2, min2, s2;

    System.out.println("Digite o horário de CHEGADA:");

    System.out.println("Hora:");
    h2 = s.nextInt();

    System.out.println("Minutos:");
    min2 = s.nextInt();

    System.out.println("Segundos:");
    s2 = s.nextInt();

    int hAux = h2;
    int minAux = min2;
    int sAux = s2;

    if(min1>min2){
      minAux += 60;
      hAux -= 1;
    }

    if(s1>s2){
      sAux += 60;
      minAux -=1;
    }

    int hDelta, minDelta, sDelta;
    hDelta = hAux - h1;
    minDelta = minAux - min1;
    sDelta = sAux - s1;

    float valorTotal = hDelta*10 + minDelta*0.2f + sDelta*0.02f;


    System.out.format("A viagem começou às %d:%d:%d e terminou às %d:%d:%d.\n", h1, min1, s1, h2, min2, s2);
    System.out.format("A duração da viagem foi de %d horas, %d minutos e %d segundos, totalizando R$%.2f.", hDelta, minDelta, sDelta, valorTotal);


  }
}
