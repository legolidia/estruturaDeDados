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