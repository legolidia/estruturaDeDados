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
