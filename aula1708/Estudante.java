public class Estudante {
    private String matricula;
    

    Estudante() {
        this("?", "");
        }


    Estudante(String matricula, string nome){
        this.matricula = matricula;
        this.nome = nome;
        n1= 0.0f;
        n2 = 0.0f;
        sub = 0.0f;
        pf = 0.0f;
    }

    void AtualizarN1(float nota){
        n1 = nota;
    }

     void AtualizarN2(float nota){
        n2 = nota;
    }

     void AtualizarSub(float nota){
        sub = nota;
    }

     void AtualizarPF(float nota){
        pf = nota;
    }

    public String getMatricula(){
        return matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public String getNome(String nome){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    @Override
    public String toString(){
        return matricula + "; " + nome + "; " + n1 + "; " + n2 + "; " + sub + "; " + pf;
    }
}
