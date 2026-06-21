
interface Biblioteca{
    void emprestar();
    void devolver();
    void mostrarInformacoes();

}


class Livro1 implements Biblioteca{
    private String titulo;
    private String autor;
    private int ano;
    private boolean emprestado;

        Livro1(String titulo, String autor, int ano){
            this.titulo = titulo;
            this.autor = autor;
            this.ano = ano;
            this.emprestado = false;

    }
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;

    }
    public int getAno() {
        return ano;
    }
    public void emprestar(){
        if (emprestado) {
            System.out.println("Esse livro já está emprestado.");
        }
        else {
            emprestado = true;
            System.out.println("Livro emprestado com sucesso!");

        }
    }

    public void devolver(){
        if (emprestado){
            emprestado = false;
            System.out.println("Livro devolvido");
        }
        else{
            System.out.println("livro disponivel");
        }
        }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Titulo: "+ titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Ano: "+ano);

        if (emprestado ==  false){
            System.out.println("Status: Disponível");
        }
        else {
            System.out.println("Status: Emprestado");
        }
    }
}
public class ExercicioJava{
    public static void main(String[] args) {
        Livro1 l1 = new Livro1("A garota do lago", "Charlie Donlea", 2017);
        l1.mostrarInformacoes();
        l1.emprestar();
        l1.mostrarInformacoes();
        l1.devolver();
        l1.mostrarInformacoes();
    }
}






