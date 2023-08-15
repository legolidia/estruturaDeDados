<img width="50px" src="https://lh6.googleusercontent.com/UeNX4Bekp6xhv_6cwTpwk2nzDHYksaQSNK5e9-bp74Qv7hX-DZMveL1nbuBMXAaR9l_-Xt_ZZByMGmrv-dBEYV8_Kuel_iITZAQeQKIImTChb6O59RZprH9Ej-GqTheWR5irdwIu1k9sqp1-NAlIlbbloBOWK4VM"> 

  # Aula 1 - Exercícios

  ### UNIVERSIDADE PRESBITERIANA MACKENZIE
  **Faculdade de Computação e Informática** <br>
  Prof. Dr. Ivan Carlos Alcântara de Oliveira 


### Conceitos Básicos de Java

| Nome do Integrante (ordem alfabética) | TIA |
| --- | --- |
| Lidia Carolina de Andrade Rosa | 32281374 |

[https://github.com/legolidia/estruturaDeDados.git](https://github.com/legolidia/estruturaDeDados.git)

- Exercício 1
    
    ```java
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
    
      }
    }
    ```
    
    Teste:
    
    ![Untitled](Aula%201%20-%20Exerci%CC%81cios%202b40ccf90a5a42758c9f5c3d100a697e/Untitled.png)
    

- Exercício 2
    
    ```java
    import java.util.Scanner;
    
    class exercicio02 {
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
    
      }
    }
    ```
    
    Teste:
    
    ![Captura de Tela 2023-08-14 às 21.03.57.png](Aula%201%20-%20Exerci%CC%81cios%202b40ccf90a5a42758c9f5c3d100a697e/Captura_de_Tela_2023-08-14_as_21.03.57.png)
    
- Exercício 3
    
    ```java
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
    ```
    
    ![Captura de Tela 2023-08-14 às 21.04.50.png](Aula%201%20-%20Exerci%CC%81cios%202b40ccf90a5a42758c9f5c3d100a697e/Captura_de_Tela_2023-08-14_as_21.04.50.png)
    

- Exercício 4
    
    ```java
    import java.util.Scanner;
    
    public class exercicio04 {
      public static void main(String[] args) {
        int n = 0;
        Scanner scan = new Scanner(System.in)) 
        n = scan.nextInt();
        
        int f[] = new int[n + 2];
    
        f[0] = 1;
        f[1] = 1;
    
        System.out.print(f[0] + " " + f[1] + " ");
    
        for (int i = 2; i < n; i++) {
        f[i] = f[i - 1] + f[i - 2];
        System.out.print(f[i] + " ");
    
      }
    }
    ```
    
    ![Captura de Tela 2023-08-14 às 21.07.38.png](Aula%201%20-%20Exerci%CC%81cios%202b40ccf90a5a42758c9f5c3d100a697e/Captura_de_Tela_2023-08-14_as_21.07.38.png)
    

- Exercício 5
    
    ```java
    import java.util.*;
    
    public class exercicio05 {
      public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
    
        Vector<Integer> v = new Vector<Integer>(n);
        Vector<Integer> v2 = new Vector<Integer>(n * 2);
        Vector<Integer> vChecked = new Vector<Integer>(n);
    
        for (int i = 0; i < n; i++)
          v.add(scan.nextInt());
    
        int c = 0;
        for (int i = 0; i < n; i++) {
          int elem = v.get(c);
          int qtd = 0;
    
          if (!vChecked.contains(elem)) {
            vChecked.add(elem);
            v2.add(elem);
    
            for (int j = 0; j < n; j++)
              if (v.get(j) == elem)
                qtd += 1;
    
            v2.add(qtd);
          }
    
          c++;
        }
    
        for (int i = 0; i < v2.size(); i++)
          System.out.print(v2.get(i) + " ");
    
      }
    }
    ```
    
    ![Captura de Tela 2023-08-14 às 21.05.56.png](Aula%201%20-%20Exerci%CC%81cios%202b40ccf90a5a42758c9f5c3d100a697e/Captura_de_Tela_2023-08-14_as_21.05.56.png)
