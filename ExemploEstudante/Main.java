public class Main {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.setMatricula("32281374");
        estudante.setNome("Lidia");
        estudante.AtualizarN1(10.0f);
        estudante.AtualizarN2(10.0f);
        System.out.println(estudante.toString());

    }
}