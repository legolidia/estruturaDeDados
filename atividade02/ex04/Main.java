public class Main {
  public static void main(String[] args) {
    Aluno aluno1 = new Aluno("32281374", "Lidia", 'F', 9f, 8f, 10f, 8.5f);
    Aluno aluno2 = new Aluno("50", "Fernando", 'M', 10f, 10f, 10f, 10f);

    aluno1.mostraDados();
    System.out.println("--------------------------------------------------");
    aluno2.mostraDados();
  }
}
