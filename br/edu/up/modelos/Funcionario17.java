package br.edu.up.modelos;

public class Funcionario17 {
    class Funcionario17 {
        private String nome;
        private double salario;
        private double salarioMinimo;
    
        public Funcionario17(String nome, double salario, double salarioMinimo) {
            this.nome = nome;
            this.salario = salario;
            this.salarioMinimo = salarioMinimo;
        }
    
        public double calcularReajuste() {
            double percentual;
            if (salario < 3 * salarioMinimo) {
                percentual = 0.5;
            } else if (salario <= 10 * salarioMinimo) {
                percentual = 0.2;
            } else if (salario <= 20 * salarioMinimo) {
                percentual = 0.15;
            } else {
                percentual = 0.1;
            }
            return salario * percentual;
        }
    
        public double getNovoSalario() {
            return salario + calcularReajuste();
        }
    
        public String getNome() {
            return nome;
        }
    
        public double getSalario() {
            return salario;
        }
    }
}
