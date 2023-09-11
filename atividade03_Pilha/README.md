# Exercícios - 3

[https://lh6.googleusercontent.com/UeNX4Bekp6xhv_6cwTpwk2nzDHYksaQSNK5e9-bp74Qv7hX-DZMveL1nbuBMXAaR9l_-Xt_ZZByMGmrv-dBEYV8_Kuel_iITZAQeQKIImTChb6O59RZprH9Ej-GqTheWR5irdwIu1k9sqp1-NAlIlbbloBOWK4VM](https://lh6.googleusercontent.com/UeNX4Bekp6xhv_6cwTpwk2nzDHYksaQSNK5e9-bp74Qv7hX-DZMveL1nbuBMXAaR9l_-Xt_ZZByMGmrv-dBEYV8_Kuel_iITZAQeQKIImTChb6O59RZprH9Ej-GqTheWR5irdwIu1k9sqp1-NAlIlbbloBOWK4VM)

**UNIVERSIDADE PRESBITERIANA MACKENZIE** 

**Faculdade de Computação e Informática**

Prof. Dr. Ivan Carlos Alcântara de Oliveira

[https://lh5.googleusercontent.com/q758zGHEMMV-xyeKmRiP_r-7EDAUALBdGcaCjj27JSrCH_Zb2WsVK1xOMGGMSX3DDpVVjQJsK3ERcMrJB0Ld8ricHf6VR4ZZt_JEOA3BSUEvGhmjAZLhEODj4vSQdvkg4Gi3zAM3a0DHLmD6iohCUxNgGeDpQG83](https://lh5.googleusercontent.com/q758zGHEMMV-xyeKmRiP_r-7EDAUALBdGcaCjj27JSrCH_Zb2WsVK1xOMGGMSX3DDpVVjQJsK3ERcMrJB0Ld8ricHf6VR4ZZt_JEOA3BSUEvGhmjAZLhEODj4vSQdvkg4Gi3zAM3a0DHLmD6iohCUxNgGeDpQG83)

**Estruturas de Dados I**

**TAD Pilha**

| Nome do Integrante (ordem alfabética) | TIA |
| --- | --- |
| Lidia Carolina de Andrade Rosa | 32281374 |

[](https://github.com/legolidia/estruturaDeDados/tree/main/atividade03_Pilha/ex01)

- Exercício 1
    
    **Pilha**
    
    ```java
    package atividade03_Pilha.ex01;
    
    public class Pilha {
    
        private static final int TAM_DEFAULT = 100;
        private int topoPilha;
        private int p[];
    
        public Pilha(int tamanho) {
            p = new int[tamanho];
            topoPilha = -1;
        }
    
        public Pilha() {
            this(TAM_DEFAULT);
        }
    
        public boolean isEmpty() {
            return (topoPilha == -1);
        }
    
        public boolean isFull() {
            return topoPilha == this.p.length - 1;
        }
    
        public void push(int e) {
            if (!isFull())
                this.p[++topoPilha] = e;
            else
                System.out.println("overflow - Estouro de Pilha");
        }
    
        public int pop() {
            if (!isEmpty())
                return p[topoPilha--];
            else {
                System.out.println("underflow - Esvaziamento de Pilha");
                return -1;
            }
        }
    
        public int topo() {
            if (!isEmpty())
                return p[topoPilha];
            else {
                System.out.println("Underlow - Esvaziamento de Pilha");
                return -1;
            }
        }
    
        public int sizeElements() {
            return topoPilha + 1;
        }
    
        @Override
        public String toString() {
    
            StringBuilder sb = new StringBuilder();
            sb.append("[Pilha] topoPilha: ")
                    .append(topoPilha)
                    .append(", capacidade: ")
                    .append(p.length)
                    .append(", quantidade de elementos: ")
                    .append(sizeElements());
            if (topoPilha != -1) {
                sb.append(", valor do Topo: ")
                        .append(topo());
            } else
                sb.append(", valor do Topo: PILHA VAZIA");
    
            sb.append("\nConteudo da Pilha': [ ");
    
            for (int i = 0; i <= topoPilha; ++i)
                if (i != topoPilha)
                    sb.append(p[i] + ", ");
                else
                    sb.append(p[i]);
            sb.append(" ]");
            return sb.toString();
        }
    }
    ```
    
    **Palindromo**
    
    ```java
    package atividade03_Pilha.ex01;
    
    import java.text.Normalizer;
    
    public class Palindromo {
      String texto;
    
      public Palindromo() {
        this.texto = "";
      }
    
      public Palindromo(String texto) {
        this.texto = texto;
      }
    
      public void setTexto(String texto) {
        if (texto != null)
          this.texto = texto;
      }
    
      public String getTexto() {
        return this.texto;
      }
    
      public boolean verificar() {
        this.setTexto(Normalizer.normalize(this.texto, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", ""));
        this.setTexto(this.texto.trim().replaceAll("[\\s]|[^aA-zZ0-9]", "").toLowerCase());
        
        Pilha pilha = new Pilha();
    
        for (int i = 0; i < this.texto.length(); i++) {
          pilha.push(this.texto.charAt(i));
        }
    
        for (int i = 0; i < this.texto.length(); i++) {
          if (pilha.pop() != this.texto.charAt(i))
            return false;
        }
    
        return true;
    }
    
    }
    ```
    
    ********Main********
    
    ```java
    package atividade03_Pilha.ex01;
    
    import java.util.*;
    
    public class Main {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Digite uma palavra ou frase: ");
    
        String texto = scanner.nextLine();
    
        Palindromo palindromo = new Palindromo(texto);
    
        System.out.println(palindromo.verificar() ? "É palíndromo" : "Não é palíndromo");
    
        scanner.close();
      }
    
    }
    ```
    
    Teste:
    
    ![README](Exerci%CC%81cios%20-%203%205a1e6b0de1e94bf1b9737db485bd4bb8/README.png)
    
    ![README](Exerci%CC%81cios%20-%203%205a1e6b0de1e94bf1b9737db485bd4bb8/README%201.png)
    

- Exercício 2
    
    Pilha
    
    ```java
    package atividade03_Pilha.ex02;
    
    public class Pilha {
    
        private static final int TAM_DEFAULT = 100;
        private int topoPilha;
        private int p[];
    
        public Pilha(int tamanho) {
            p = new int[tamanho];
            topoPilha = -1;
        }
    
        public Pilha() {
            this(TAM_DEFAULT);
        }
    
        public boolean isEmpty() {
            return (topoPilha == -1);
        }
    
        public boolean isFull() {
            return topoPilha == this.p.length - 1;
        }
    
        public void push(int e) {
            if (!isFull())
                this.p[++topoPilha] = e;
            else
                System.out.println("overflow - Estouro de Pilha");
        }
    
        public int pop() {
            if (!isEmpty())
                return p[topoPilha--];
            else {
                System.out.println("underflow - Esvaziamento de Pilha");
                return -1;
            }
        }
    
        public int topo() {
            if (!isEmpty())
                return p[topoPilha];
            else {
                System.out.println("Underlow - Esvaziamento de Pilha");
                return -1;
            }
        }
    
        public int sizeElements() {
            return topoPilha + 1;
        }
    
        @Override
        public String toString() {
    
            StringBuilder sb = new StringBuilder();
            sb.append("[Pilha] topoPilha: ")
                    .append(topoPilha)
                    .append(", capacidade: ")
                    .append(p.length)
                    .append(", quantidade de elementos: ")
                    .append(sizeElements());
            if (topoPilha != -1) {
                sb.append(", valor do Topo: ")
                        .append(topo());
            } else
                sb.append(", valor do Topo: PILHA VAZIA");
    
            sb.append("\nConteudo da Pilha': [ ");
    
            for (int i = 0; i <= topoPilha; ++i)
                if (i != topoPilha)
                    sb.append(p[i] + ", ");
                else
                    sb.append(p[i]);
            sb.append(" ]");
            return sb.toString();
        }
    }
    ```
    
    Palindromo
    
    ```java
    package atividade03_Pilha.ex02;
    
    public class Palindromo {
      String texto;
    
      public Palindromo() {
        this.texto = "";
      }
    
      public Palindromo(String texto) {
        this.texto = texto;
      }
    
      public void setTexto(String texto) {
        if (texto != null)
          this.texto = texto;
      }
    
      public String getTexto() {
        return this.texto;
      }
    
      public boolean verificaFormatoData(){
        if(this.texto.length() != 10)
          return false;
    
        if(this.texto.charAt(2) != '/' || this.texto.charAt(5) != '/')
          return false;
    
        int dia = Integer.parseInt(this.texto.substring(0, 2));
        int mes = Integer.parseInt(this.texto.substring(3, 5));
        int ano = Integer.parseInt(this.texto.substring(6, 10));
    
        if(dia < 1 || dia > 31)
          return false;
    
        if(mes < 1 || mes > 12)
          return false;
    
        if(ano < 1)
          return false;
    
        return true;
      }
    
      public boolean verificar() {
        this.setTexto(this.texto.trim().replaceAll("[\\s]|[^aA-zZ0-9]", ""));
        
        Pilha pilha = new Pilha();
    
        for (int i = 0; i < this.texto.length(); i++) {
          pilha.push(this.texto.charAt(i));
        }
    
        for (int i = 0; i < this.texto.length(); i++) {
          if (pilha.pop() != this.texto.charAt(i))
            return false;
        }
    
        return true;
    }
    
    }
    ```
    
    Main
    
    ```java
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
    ```
    
    Teste:
    
    ![README](Exerci%CC%81cios%20-%203%205a1e6b0de1e94bf1b9737db485bd4bb8/README%202.png)
    
    ![README](Exerci%CC%81cios%20-%203%205a1e6b0de1e94bf1b9737db485bd4bb8/README%203.png)
    

- Exercício 3
    
    **Pilha**
    
    ```java
    package atividade03_Pilha.ex03;
    
    public class Pilha {
    
        private static final int TAM_DEFAULT = 100;
        private int topoPilha;
        private int p[];
    
        public Pilha(int tamanho) {
            p = new int[tamanho];
            topoPilha = -1;
        }
    
        public Pilha() {
            this(TAM_DEFAULT);
        }
    
        public boolean isEmpty() {
            return (topoPilha == -1);
        }
    
        public boolean isFull() {
            return topoPilha == this.p.length - 1;
        }
    
        public void push(int e) {
            if (!isFull())
                this.p[++topoPilha] = e;
            else
                System.out.println("overflow - Estouro de Pilha");
        }
    
        public int pop() {
            if (!isEmpty())
                return p[topoPilha--];
            else {
                System.out.println("underflow - Esvaziamento de Pilha");
                return -1;
            }
        }
    
        public int topo() {
            if (!isEmpty())
                return p[topoPilha];
            else {
                System.out.println("Underlow - Esvaziamento de Pilha");
                return -1;
            }
        }
    
        public int sizeElements() {
            return topoPilha + 1;
        }
    
        @Override
        public String toString() {
    
            StringBuilder sb = new StringBuilder();
            sb.append("[Pilha] topoPilha: ")
                    .append(topoPilha)
                    .append(", capacidade: ")
                    .append(p.length)
                    .append(", quantidade de elementos: ")
                    .append(sizeElements());
            if (topoPilha != -1) {
                sb.append(", valor do Topo: ")
                        .append(topo());
            } else
                sb.append(", valor do Topo: PILHA VAZIA");
    
            sb.append("\nConteudo da Pilha': [ ");
    
            for (int i = 0; i <= topoPilha; ++i)
                if (i != topoPilha)
                    sb.append(p[i] + ", ");
                else
                    sb.append(p[i]);
            sb.append(" ]");
            return sb.toString();
        }
    }
    ```
    
    **Expressoes**
    
    ```java
    package atividade03_Pilha.ex03;
    
    public class Expressoes {
      String texto;
    
      public Expressoes() {
        this.texto = "";
      }
    
      public Expressoes(String texto) {
        this.texto = texto;
      }
    
      public void setTexto(String texto) {
        if (texto != null)
          this.texto = texto;
      }
    
      public String getTexto() {
        return this.texto;
      }
    
      public boolean verificaFormatoData(){
        if(this.texto.length() != 10)
          return false;
    
        if(this.texto.charAt(2) != '/' || this.texto.charAt(5) != '/')
          return false;
    
        int dia = Integer.parseInt(this.texto.substring(0, 2));
        int mes = Integer.parseInt(this.texto.substring(3, 5));
        int ano = Integer.parseInt(this.texto.substring(6, 10));
    
        if(dia < 1 || dia > 31)
          return false;
    
        if(mes < 1 || mes > 12)
          return false;
    
        if(ano < 1)
          return false;
    
        return true;
      }
    
      public boolean verificar() {
        this.setTexto(this.texto.trim().replaceAll("[^\\(\\[\\{\\<\\}\\]\\>\\)]", ""));
        System.out.println(this.texto);
        
        Pilha pilha = new Pilha();
    
        for (int i = 0; i < this.texto.length(); i++) {
          pilha.push(this.texto.charAt(i));
        }
    
        for (int i = 0; i < this.texto.length(); i++) {
          if(this.texto.charAt(i) == '(' && pilha.pop() != ')')
            return false;
          if(this.texto.charAt(i) == '[' && pilha.pop() != ']')
            return false;
          if(this.texto.charAt(i) == '{' && pilha.pop() != '}')
            return false;
          if(this.texto.charAt(i) == '<' && pilha.pop() != '>')
            return false;
        }
    
        return true;
    }
    
    }
    ```
    
    **Main**
    
    ```java
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
    ```
    
    Teste:
    
    ![README](Exerci%CC%81cios%20-%203%205a1e6b0de1e94bf1b9737db485bd4bb8/README%204.png)
    
    ![README](Exerci%CC%81cios%20-%203%205a1e6b0de1e94bf1b9737db485bd4bb8/README%205.png)