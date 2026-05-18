package annotations;

class funcionario {
    String nome;
    double salario;

    funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;

    }

    public String getNome(){
        return nome;
    }

    public double getSalario(){
        return salario;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    String exibirDados(){
        return "Funcionário:" +
                " Nome: "+getNome()+ ", Salário: "+getSalario()+ "Bonus: "+ bonus();
    }

    double bonus(){
        return salario * 0.10;
    }
}

class gerente extends funcionario{
    String setor;

    gerente(String nome, double salario, String setor){
        super(nome, salario);
        this.setor = setor;
    }

    @Override
    double bonus() {
        return salario * 0.20;
    }

    @Override
    String exibirDados(){
        return "Gerente: " +
                "Nome: "+nome+ ", Salário: "+ salario+ ", Setor: "+setor+ ", Bonus: "+bonus();
    }

}
public class exercSistemasDeFuncionarios{
    public static void main(String[] args) {
        funcionario f1 = new funcionario("Nicolas", 3500d);

        gerente g1 = new gerente("Eren", 6000d, "Vendas");

        System.out.println(g1.exibirDados());
        System.out.println(f1.exibirDados());
}

}