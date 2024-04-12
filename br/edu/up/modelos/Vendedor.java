package br.edu.up.modelos;

public class Vendedor {

    private String nomeVendedor;
    private float salarioFixo;
    private float vendasTotais;

    public Vendedor(String nome, float salario, float vendas) {
        this.nomeVendedor = nome;
        this.salarioFixo = salario;
        this.vendasTotais = vendas;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public float getSalarioFixo() {
        return salarioFixo;
    }

    public float getVendasTotais() {
        return vendasTotais;
    }

    public float salariofinal() {
        return ((15 * salarioFixo) / 100) + salarioFixo;
    }
}
