package AulaDeRevisão;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double preco;
        double distanciaIeV;
        double consumo;
        String cidade;
        double resul = 0;

        System.out.println("Digite o preço do combustivel:");
        preco = sc.nextDouble();
        System.out.println("Digite a distancia total de ida e de volta:");
        distanciaIeV = sc.nextDouble();
        System.out.println("Digite o consumo de combustivel de gasolina do veiculo:");
        consumo = sc.nextDouble();
        System.out.println("Digite para qual cidade será a viagem:");
        cidade = sc.nextLine();


        System.out.printf("Sua viagem para " + cidade + " tera o gasto de: " + viagem(distanciaIeV, consumo, preco) + " litros");

    }
    public static double viagem(double a , double b, double c) {
        return (a / b) * c;
    }
}
