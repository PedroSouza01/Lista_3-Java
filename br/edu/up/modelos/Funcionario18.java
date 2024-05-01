package br.edu.up.modelos;

public class Funcionario18 {
    private String nome;
    private int idade;
    private char sexo;
    private double salarioFixo;

    public Funcionario18(String nome, int idade, char sexo, double salarioFixo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.salarioFixo = salarioFixo;
    }

    public double calcularAbono() {
        if (sexo == 'M') {
            if (idade >= 30) {
                return 100.00;
            } else {
                return 50.00;
            }
        } else { 
            if (idade >= 30) {
                return 200.00;
            } else {
                return 80.00;
            }
        }
    }

    public double calcularSalarioLiquido() {
        return salarioFixo + calcularAbono();
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public char getSexo() {
        return sexo;
    }
}


