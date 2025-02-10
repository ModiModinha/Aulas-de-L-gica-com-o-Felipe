package AulaDeRevisão;

public class ex9 {
    public static void main(String[] args) {
        int numero = 0;
        int somap = 0;
        int soma = 1;

        while (numero < 100) {
            numero = (numero + soma);

            if (numero % 2 == 0)

                somap = (somap + numero);

        }

        System.out.println("A soma dos numeros pares de 1 a 100 é de: " + somap);

    }
}
