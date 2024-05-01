package br.edu.up.modelos;

public class Funcionario {
    class Funcionario {
        private String nome;
        private double salario;
    
        public Funcionario(String nome, double salario) {
            this.nome = nome;
            this.salario = salario;
        }
    
        public double getSalario() {
            return salario;
        }
    
        public void aplicarReajuste() {
            double percentual;
            if (salario < 3 * SALARIO_MINIMO) {
                percentual = 0.5;
            } else if (salario <= 10 * SALARIO_MINIMO) {
                percentual = 0.2;
            } else if (salario <= 20 * SALARIO_MINIMO) {
                percentual = 0.15;
            } else {
                percentual = 0.1;
            }
            salario += salario * percentual;
        }
    
        @Override
        public String toString() {
            return "Nome: " + nome + ", Salário após reajuste: R$" + salario;
        }
    }
    
    public class GestaoFuncionarios {
        private static final double SALARIO_MINIMO = 1100;
    
}
