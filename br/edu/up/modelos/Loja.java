package br.edu.up.modelos;

public class Loja {

    private double prestacoes;

    public Loja(double valor) {
        this.prestacoes = valor / 5;
    }

    public double getPrestacoes() {
        return this.prestacoes;
    }
}
