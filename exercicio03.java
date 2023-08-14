import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);

        n = s.nextInt();

        double e = 1.0f;
        int fat = 1;

        for (int i = 1; i <= n; i++) {
            fat *= i;
            e += 1.0 / fat;
        }

        System.out.println(e);
    }
}