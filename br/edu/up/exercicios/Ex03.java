package br.edu.up.exercicios;

import java.util.Scanner;

import modelos.Vendedor;

public class Ex03 {
    public static void executar() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scan.next();

        System.out.println("Digite seu salario fixo: ");
        float salario = scan.nextFloat();

        System.out.println("Digite o total de vendas (Em R$): ");
        float vendas = scan.nextFloat();

        Vendedor vendedor = new Vendedor(nome, salario, vendas);

        System.out.println("O nome é: " + vendedor.getNomeVendedor());
        System.out.println("O Total de vendas no mês foi de: " + vendedor.getVendasTotais());
        System.out.println("O salario final é de: " + vendedor.salariofinal());

        scan.close();
    }
}
