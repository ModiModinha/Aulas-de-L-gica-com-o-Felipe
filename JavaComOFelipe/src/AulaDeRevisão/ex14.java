package AulaDeRevisão;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valor;
        double valorCon;

        System.out.println("Digite o valor em dolares para converter em reais:");
        valor = sc.nextDouble();
        System.out.println("Digite o valor da conversão:");
        valorCon = sc.nextDouble();

        System.out.println(valor + " Convertido em reais ficará em torno de: " + convers(valor, valorCon) );


    }

    public static double convers(double a, double b) {
        return (a * b);
    }
}
