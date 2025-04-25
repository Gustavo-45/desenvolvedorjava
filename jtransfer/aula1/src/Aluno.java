
/*Encapsulamento */
//public
//private
//protected
//package
public class Aluno {
    private int idade;
    private String nome;
    private boolean temFaculdade;
    
    public Aluno(){

    }
    public Aluno(String nome, int idade, boolean temFaculdade){
        this.nome = nome;
        this.idade = idade;
        this.temFaculdade = temFaculdade;



    }
    public String getNome(){

        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public boolean getTemFaculdade(){
        return temFaculdade;
    }
}
