package br.edu.up.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.up.modelos.Funcionario;

public class Ex17 {
    public static void executar(){
         Scanner scanner = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();

        System.out.println("Digite o número de funcionários: ");
        int numeroFuncionarios = scanner.nextInt();

        double totalAumentoFolha = 0;

        for (int i = 0; i < numeroFuncionarios; i++) {
            System.out.println("\nFuncionário " + (i + 1));
            System.out.println("Digite o nome do funcionário: ");
            String nome = scanner.next();
            System.out.println("Digite o salário do funcionário (em reais): ");
            double salario = scanner.nextDouble();
            System.out.println("Digite o valor do salário mínimo (em reais): ");
            double salarioMinimo = scanner.nextDouble();
            Funcionario funcionario = new Funcionario(nome, salario, salarioMinimo);
            funcionarios.add(funcionario);
            totalAumentoFolha += funcionario.calcularReajuste();
        }

        System.out.println("\nReajustes aplicados:");
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Reajuste: R$" + funcionario.calcularReajuste());
            System.out.println("Novo salário: R$" + funcionario.getNovoSalario());
            System.out.println();
        }

        System.out.println("Total de aumento na folha de pagamento: R$" + totalAumentoFolha);

        scanner.close();
    }
}
