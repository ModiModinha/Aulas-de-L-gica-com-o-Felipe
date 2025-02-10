package AulaDeRevisão;

public class ex17 {
    public static void main(String[] args) {
        int maior =0;
        int[] numeros = {53, 78, 73, 84, 38};

        for (int i = 0; i < numeros.length; i ++) {
            if (numeros[i] > maior){
                maior = numeros[i];
            }
        }
        System.out.println("O maior numero da Array é de: " + maior);

    }
}
