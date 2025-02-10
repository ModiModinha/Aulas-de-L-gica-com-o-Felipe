package AulaDeRevisão;
import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;

        System.out.println("Digite o seu nome: ");
        nome = sc.nextLine();

        System.out.println(nome + saudacao() );
    }
    public static String saudacao(){
        return ", Seja muito bem vindo(a)!";


    }



    }
