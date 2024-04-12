package br.edu.up.exercicios;

import java.util.Scanner;

import modelos.Loja;

public class Ex05 {
    public static void executar() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor Total da compra para saber o valor das prestações: ");
        double valor = scan.nextDouble();

        Loja loja = new Loja(valor);

        System.out.println("O valor das prestações é: " + loja.getPrestacoes() + " Reais para Cada prestação");

        scan.close();
    }
}
