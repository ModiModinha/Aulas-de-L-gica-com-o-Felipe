package CalculoCombustivel;

import java.util.Scanner;

public class CalculoCombustivel {
    public static double
    calculoViagem(int quantidadeKm,
                  double quantidadekmporLitro,
                  double precoCombustivel){
        //Processamento cálculos
        double quantidadeLitros = quantidadeKm/quantidadekmporLitro;
        double custoTotal = quantidadeLitros * precoCombustivel;
        return custoTotal;
    }
    public static void imprimirInformacoes(double custoTotal,
                                           String cidade,
                                           double precoCombustivel,
                                           int quantidadeKm,
                                           double quantidadekmporLitro){
        //Saida imprimir na tela as informações
        System.out.println("+++ Relatório da Viagem ++++");
        System.out.println("Custo total da viagem:R$"+custoTotal);
        System.out.println("Cidade:"+cidade);
        System.out.println("Preço por litro:"+precoCombustivel);
        System.out.println("kilometragem:"+quantidadeKm);
        System.out.println("Quantidade de litros por km:"+quantidadekmporLitro);
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double precoCombustivel, quantidadekmporLitro;
        int quantidadeKm;
        String cidade;
        int menu = 0;
        while(menu == 0){
            //Entrada de informações
            System.out.println("Informe o preço do combustível:");
            precoCombustivel = leia.nextDouble();
            System.out.println("Informe a quantidade de km da viagem:");
            quantidadeKm = leia.nextInt();
            System.out.println("Quantos km por litro o veiculo faz:");
            quantidadekmporLitro = leia.nextDouble();
            System.out.println("Informe a cidade de destino:");
            cidade = leia.next();
            //processamento
            double custoTotal = calculoViagem(quantidadeKm,
                            quantidadekmporLitro,
                            precoCombustivel);
            imprimirInformacoes(custoTotal,cidade,precoCombustivel,quantidadeKm,quantidadekmporLitro);
            System.out.println("Deseja fazer outro cálculo de viagem?");
            System.out.println("Digite 0 para SIM ou 1 para SAIR: ");
            menu = leia.nextInt();
        }

    }
}
