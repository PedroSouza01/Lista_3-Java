package br.edu.up.exercicios;

import java.util.Scanner;

import br.edu.up.modelos.Concessionaria;

public class Ex15 {
    public static void executar(){
        Scanner scanner = new Scanner(System.in);
        Concessionaria concessionaria = new Concessionaria();

        System.out.println("Digite o valor do veículo (ou 0 para encerrar): ");
        double valorVeiculo = scanner.nextDouble();

        while (valorVeiculo != 0) {
            System.out.println("Digite o tipo de combustível (álcool, gasolina ou diesel): ");
            String combustivel = scanner.next();

            concessionaria.calcularDesconto(valorVeiculo, combustivel);

            System.out.println("\nDigite o valor do próximo veículo (ou 0 para encerrar): ");
            valorVeiculo = scanner.nextDouble();
        }

        System.out.println("\nTotal de desconto concedido: " + concessionaria.getTotalDesconto());
        System.out.println("Total pago pelos clientes: " + concessionaria.getTotalPago());

        scanner.close();
    }
}
