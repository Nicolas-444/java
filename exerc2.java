package herança;

class Funcionario{
     private String nome;
     private double salario;

    double ganho_anual(){
        return salario * 12;
    }

    double addAumento(double valor) {
      return salario += valor;
    }

    Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    String getNome(){
        return nome;
    }

    double getSalario(){
        return salario;
    }

    void setSalario(double salario){
        this.salario =  salario;
    }
}
class Assistente extends Funcionario{
    Assistente(String nome, double salario){
        super(nome, salario);
    }

    @Override
    double ganho_anual() {
        return (getSalario() * 12) + 1000;
    }
}

public class exerc2{
    public static void main(String[] args) {
        Assistente a1 = new Assistente("Nicolas", 3000d);

        System.out.println(a1.getNome());
        System.out.println(a1.getSalario());

        a1.addAumento(500);
        System.out.println(a1.getSalario());

        System.out.println(a1.ganho_anual());

    }
}
