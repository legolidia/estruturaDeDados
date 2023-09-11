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