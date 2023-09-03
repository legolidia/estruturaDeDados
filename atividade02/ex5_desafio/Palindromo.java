package ex5_desafio;

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
    // System.out.println(texto);
    this.setTexto(this.texto.trim().replaceAll("[\\s]|[^aA-zZ0-9]", "").toLowerCase());

    // System.out.println(texto);

    int i = 0, j = this.texto.length() - 1;
    for (i = 0; i < j; i++, j--)
      if (this.texto.charAt(i) != this.texto.charAt(j))
        return false;
    return true;
  }

}