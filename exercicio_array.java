public class exercicio_array {
    public static void main(String[] args) {
        int meuArray[] = new int[]{2, 3 ,5 ,6 ,7 ,8 ,1 ,9};

        int maior = meuArray[0];
        int menor = meuArray[0];
        int soma = 0;

        for (int i = 0; i < meuArray.length; i++){

            //soma
            soma += meuArray[i];

            //maior numero
            if (meuArray[i] > maior){
                maior = meuArray[i];

            }

            //menor numero
            if (meuArray[i]< menor){
                menor = meuArray[i];

            }
        }

        System.out.println("Soma: " +soma);
        System.out.println("Maior numero: "+ maior);
        System.out.println("Menor numero: "+ menor);
    }
}
