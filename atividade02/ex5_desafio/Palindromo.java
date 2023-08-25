package ex5_desafio;

public class Palindromo {
  String texto;

  public Palindromo(){
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

  public boolean verificar(){

    this.setTexto(this.getTexto().trim().replaceAll("[^a-zA-Z0-9^\\s]", "").toLowerCase());
    

    System.out.println(this.texto);

    int i = 0, j = this.texto.length() - 1;
    for(i=0; i < j; i++, j--){
      if(this.texto.charAt(i) != this.texto.charAt(j))
        return false;
    }
    return true;
}

}