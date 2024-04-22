package br.edu.up.exercicios;

import java.util.Scanner;

import modelos.Produtos;

public class Ex14 {
    public static void executar() {
        Scanner scan = new Scanner(System.in);
        float somaPrecoCusto = 0;
        float somaPrecoVenda = 0;

        for (int i = 0; i < 40; i++) {
            int num = 0;
            num = i + 1;

            System.out.println("Digite o Preço de custo do " + num + "° Produto: ");
            float precoCusto = scan.nextFloat();

            System.out.println("Digite o Preço de venda do " + num + "° Produto: ");
            float precoVenda = scan.nextFloat();

            Produtos produtos = new Produtos(precoCusto, precoVenda);

            if (precoCusto < precoVenda) {
                System.out.println("\n!Lucro!\n");
            } else if (precoCusto > precoVenda) {
                System.out.println("\n!Prejuízo!\n");
            } else if (precoCusto == precoVenda) {
                System.out.println("\n!Empate!\n");
            } else {
                System.out.println("Número inválido");
            }

            somaPrecoCusto += precoCusto;
            somaPrecoVenda += precoVenda;
        }

        float mediaPrecoCusto = somaPrecoCusto / 40;
        float mediaPrecoVenda = somaPrecoVenda / 40;

        System.out.println("A média do preço de custo dos produtos é de: " + mediaPrecoCusto);
        System.out.println("A média do preço de venda dos produtos é de: " + mediaPrecoVenda);

        scan.close();
    }
}
