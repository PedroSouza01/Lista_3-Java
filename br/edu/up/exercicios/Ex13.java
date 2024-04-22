package br.edu.up.exercicios;

import java.util.Scanner;

import modelos.ServicoMilitar;

public class Ex13 {
    public static void executar() {
        Scanner scan = new Scanner(System.in);
        String nome;
        String sexo;
        int idade;
        String saude;
        int total = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o nome:");
            nome = scan.next();

            System.out.println("Digite seu sexo:");
            sexo = scan.next();

            System.out.println("Digite sua idade: ");
            idade = scan.nextInt();

            System.out.println("Digite e seu estado de saúde(bom ou mal):");
            saude = scan.next();

            ServicoMilitar servico = new ServicoMilitar(nome, sexo, saude, idade);

            if (idade >= 18 && saude.equals("bom") && sexo.equals("Masculino")) {
                System.out.println("O " + nome + " está apto para servir!\n");
                total++;
            } else if (idade >= 18 && saude.equals("bom") && sexo.equals("Feminino")) {
                System.out.println("A " + nome + " está apta para servir!\n");
                total++;
            } else {
                System.out.println("Não está apto(a) para servir\n");
            }

        }

        System.out.println("O total de aptos é: " + total);

        scan.close();
    }

}
