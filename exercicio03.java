import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);

        n = s.nextInt();

        double e = 1f;
        int fat = 1;
        int num;

        for (int i = 1; i <= n; i++) {
            num = 1 / i;
            fat = 1;
            for (int j = num; j > 0; j--)
                fat *= num;

            e += fat;
        }

        System.out.println(e);
    }
}
