package br.edu.up.exercicios;

import java.util.Scanner;

import modelos.Produto;

public class Ex06 {
    public static void executar() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o preço de custo de um produto: ");
        float precoCusto = scan.nextFloat();

        System.out.println("Qual será a porcentagem de acréscimo: ");
        int acrescimo = scan.nextInt();

        Produto produto = new Produto(precoCusto, acrescimo);

        System.out.println("O valor de venda é: " + produto.getPrecofinal());

        scan.close();
    }
}
