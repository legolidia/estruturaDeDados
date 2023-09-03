package ex01;

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

    Pilha pilha = new Pilha(this.texto.length());
    Pilha pilhaInvertida = new Pilha();

    for(int i=0; i<pilha.sizeElements(); i++)
        pilha.push(this.texto.charAt(i));
     
    for(int i=pilha.sizeElements-1; i>=0; i--)
        pilhaInvertida.push(this.texto.charAt(i));

    while(!pilha.isEmpty){
        if(pilha.topo().equals(!pilhaInvertida.topo()))
            return false;
    }

    return true;

}