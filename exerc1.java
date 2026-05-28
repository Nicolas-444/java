package imutabilidade;

class testes {
    final int NUMERO_MAXIMO = 77;
    final String SUA_ESCOLHA = "Você escolheu o número: ";

    public void imprimirValores(){
        System.out.println(SUA_ESCOLHA + NUMERO_MAXIMO);
    }
}

public class exerc1{
    public static void main(String[] args) {
        testes novo = new testes();
        novo.imprimirValores();
    }
}
