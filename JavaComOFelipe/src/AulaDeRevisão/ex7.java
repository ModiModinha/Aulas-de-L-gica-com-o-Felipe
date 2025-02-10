package AulaDeRevisão;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resul = 0;
        System.out.println("Digite o numero para mostrar a tabuada: ");
        int tabuada = sc.nextInt();
        




        for ( int i = 0; i < 11; i++) {
            resul = tabuada * i;
            System.out.println(tabuada + " x " + i + " = " + resul);

        }

    }
}
