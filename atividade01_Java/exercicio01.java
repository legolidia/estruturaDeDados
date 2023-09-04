import java.util.Scanner;

class exercicio01 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int M = 0; // M é a quantidade de tanques cilíndricos

    System.out.print("Digite a quantidade de tanques cilíndricos: ");
    M = s.nextInt();

    float h = 0, r = 0, volume = 0, volumeTotal = 0;

    System.out.println("Digite a altura do tanque: ");
    h = s.nextFloat();

    System.out.println("Digite o raio do tanque: ");
    r = s.nextFloat();

    volume = (float) (Math.PI * Math.pow(r, 2) * h);
    volumeTotal = volume * M;

    float barris = volumeTotal / 0.2f;

    System.out.println("Sao necessarios " + Math.ceil(barris) + " barris de petroleo de 200L para encher os tanques");


    s.close();
  }
}
