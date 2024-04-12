package br.edu.up.exercicios;

public class Ex04 {
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite a cotação atual do Dólar: ");
    float cotacao = scan.nextFloat();

    System.out.println("Digite qual é o valor total dispinível: ");
    float valorTotal = scan.nextFloat();

    System.out.println("Digite a quantidade desejada para a converção: ");
    float valor = scan.nextFloat();

    Conversor conversor = new Conversor(cotacao, valorTotal, valor);

    System.out.println("A cotação atual do Dólar é: " + conversor.getCotacaoConversor());

    System.out.println("O valor dispinível é: " + conversor.getValorTotalConversor());

    System.out.println("O valor desejado para a conversão é: " + conversor.getValorConversor());

    System.out.println("O resultado da conversão é: " + conversor.getvalorConvertido() + " Reais.");

    scan.close();
}
