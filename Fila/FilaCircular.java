package Fila;

public class FilaCircular {

	private static final int TAM_DEFAULT = 100;
	private int inicio, fim, qtde;
	private int e[ ];

	public FilaCircular(int tamanho) {
		  this.inicio = this.fim = this.qtde = 0;
		  e = new int[tamanho];
	}
	
	public FilaCircular() { 
		this(TAM_DEFAULT);
	}


	public boolean qIsEmpty() {
		return (qtde == 0);
	}
	

    public boolean qIsFull() {
    	return (qtde == e.length); 	
    }
    
  
	public void enqueue(int e) {
		if (! qIsFull( )){
			    this.e[this.fim++] = e;
			    this.fim = this.fim % this.e.length;
			    this.qtde++;
		}
		else 
			    System.out.println("Oveflow - Estouro de Fila");	
	}

    public int dequeue() {
    	  int aux;
    	  if (! qIsEmpty( )){
    	   aux =  this.e[ this.inicio];
    	   this.inicio = ++this.inicio % this.e.length;
    	   this.qtde--;
    	   return aux;
    	  }else{
    	    System.out.println("underflow - Esvaziamento de Fila");
    	    return -1;
    	  }
    }


	public int front() {
		if (! qIsEmpty())
			return e[inicio];
		else{
			System.out.println("underflow - Esvaziamento de Fila");
			return -1;
		}			
	}

	public int rear() {
		if (! qIsEmpty()){
			  int pfinal;
			  if (this.fim != 0) pfinal = this.fim - 1;
			  else pfinal = this.e.length - 1;
			  return this.e[pfinal];
		}else{
			  System.out.println("underflow - Esvaziamento de Fila");
			  return -1;
		}			
	}

    
	public	int totalElementos(){
		return qtde;
	}
	

	@Override
	public String toString() {
		
		int indiceNovo = (inicio + qtde) % e.length;
		
		StringBuilder sb = new StringBuilder();
		sb.append("[Fila] quantidade: ")
			.append(qtde)
			.append(", capacidade: ")
			.append(e.length);
		if (qtde != 0) {
			sb.append(", primeiro: ")
				.append(front())
				.append(", último: ")
				.append(rear());
		} 
		
		sb.append("\nConteudo da Fila': [ ");
		if (qtde != 0) {
			if (indiceNovo <= inicio) {
				for (int i = inicio; i < e.length; ++i)
					sb.append("[" + e[i] + "]");
				for (int i = 0; i < indiceNovo; ++i)
					sb.append("[" + e[i] + "]");
			} else {
				for (int i = inicio; i < indiceNovo; ++i)
					sb.append("[" + e[i] + "]");
			}
		}
		sb.append(" ]");
		return sb.toString();
	}
}
