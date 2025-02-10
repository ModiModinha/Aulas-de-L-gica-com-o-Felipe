package AulaDeRevisão;

import java.sql.SQLOutput;
import java.util.Scanner;

public class auladiacinco {
    public static void main(String[] args) {
        String senhaP = "12345";
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua senha: ");
        String senhaD = sc.next();


        if (senhaP.equals(senhaD)) {

            System.out.println("A senha está correta");

        }

        else {
            System.out.println("A senha não confere");
        }






    }


}
