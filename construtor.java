public class construtor {
    String nome;
    String cargo;
    int idade;

    construtor(String nomeInit, String cargoInit, int idadeInit){
        nome = nomeInit;
        cargo = cargoInit;
        idade = idadeInit;

    }

    public static void main(String[] args) {
        construtor funcionario1 = new construtor("Nicolas", "Desenvolvedor Java", 21);

        construtor funcionario2 = new construtor("Maria", "Designer grafico", 23);

        System.out.println("Nome: "+funcionario1.nome+ "/ Cargo: "+ funcionario1.cargo + "/ idade: "+ funcionario1.idade);
        System.out.println("-".repeat(15));
        System.out.println("Nome: "+funcionario2.nome+ "/ Cargo: "+ funcionario2.cargo + "/ idade: "+ funcionario2.idade);

    }
}
