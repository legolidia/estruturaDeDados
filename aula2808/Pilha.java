package aula2808;

public class Pilha {
    private int p[];
    private int topoPilha;

    private static int TAM_MAX = 100;

    public Pilha(int topoPilha) {
        topoPilha = -1;
        p = new int[topoPilha];
    }

    public Pilha() {
        this(TAM_MAX);
    }

    public boolean isEmpty() {
        return topoPilha == -1;
    }

    public boolean isFull() {
        return topoPilha == p.length;
    }

    public void push(int dado) {
        if (!isFull()) {
            p[++topoPilha] = dado;
            return;
        }

        System.out.println("stack overflow");
    }

    public int pop() {
        if (!isEmpty())
            return p[topoPilha--];
        System.out.println("stack underflow");
        return -1;
    }

    public int topo(){
        return p[topoPilha];
    }

    public int sizeElements(){
        return topoPilha;
    }

}