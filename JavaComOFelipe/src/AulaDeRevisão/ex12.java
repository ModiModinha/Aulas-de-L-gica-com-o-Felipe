package AulaDeRevisão;
import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double nota1;
        Double nota2;


        System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = sc.nextDouble();

        System.out.println("A média das duas nota é de: " + media(nota1, nota2));

    }

    public static double media(double a , double b){
        return (a + b ) /2;




    }




}
