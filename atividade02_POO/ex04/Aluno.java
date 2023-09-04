
public class Aluno {

  private String rgm;
  private String nome;
  private char sexo;
  private float notaA;
  private float notaB;
  private float notaC;
  private float notaD;

  public Aluno() {
  }

  public Aluno(String rgm, String nome) {
    this.rgm = rgm;
    this.nome = nome;
  }

  public Aluno(String rgm, String nome, char sexo, float notaA, float notaB, float notaC, float notaD) {
    this.rgm = rgm;
    this.nome = nome;
    this.sexo = sexo;
    this.notaA = notaA;
    this.notaB = notaB;
    this.notaC = notaC;
    this.notaD = notaD;
  }

  public float calculaMedia() {
    return (this.notaA + this.notaB + this.notaC + this.notaD) / 4;
  }

  public void mostraDados() {
    System.out.format("RGM: " + this.rgm + "\nNome: " + this.nome + "\nSexo: " + this.sexo +
        "\nNota A: " + this.notaA + "\nNota B: " + this.notaB + "\nNota C: " + this.notaC + "\nNota D: "
        + this.notaD + "\nMédia: %.1f" + "\nSituação: " + (this.avaliaSituacao() ? "Aprovado" : "Reprovado") +
        "\n", this.calculaMedia());
  }

  public boolean avaliaSituacao() {
    return (this.calculaMedia() >= 6);
  }

  public void setRgm(String rgm) {
    this.rgm = rgm;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setSexo(char sexo) {
    this.sexo = sexo;
  }

  public void setNotaA(float notaA) {
    this.notaA = notaA;
  }

  public void setNotaB(float notaB) {
    this.notaB = notaB;
  }

  public void setNotaC(float notaC) {
    this.notaC = notaC;
  }

  public void setNotaD(float notaD) {
    this.notaD = notaD;
  }

  public String getRgm() {
    return this.rgm;
  }

  public String getNome() {
    return this.nome;
  }

  public char getSexo() {
    return this.sexo;
  }

  public float getNotaA() {
    return this.notaA;
  }

  public float getNotaB() {
    return this.notaB;
  }

  public float getNotaC() {
    return this.notaC;
  }

  public float getNotaD() {
    return this.notaD;
  }

}