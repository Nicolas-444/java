package herança;

class Pessoa {
    private String nome;
    private int idade;

    Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    String getNome(){
        return nome;
    }
    int getIdade(){
        return idade;
    }

    void setNome(String nome){
        this.nome = nome;
    }
    void setIdade(int idade){
        this.idade = idade;
    }
}
class Estudante extends Pessoa{
    private int matricula;
    Estudante(String nome, int idade, int matricula){
        super(nome, idade);
        this.matricula = matricula;
    }
    int getMatricula(){
        return matricula;
    }
    void setMatricula(int matricula){
            this.matricula = matricula;
        }

    }


public class exerc3{
    public static void main(String[] args) {
        Estudante e1 = new Estudante("Nicolas", 21, 2025202044);
        System.out.println("Nome: "+e1.getNome());
        System.out.println("Idade: "+e1.getIdade());
        System.out.println("Matricula: "+e1.getMatricula());
    }
}

