package br.edu.up.modelos;

public class Concessionaria15 {
    private double totalDesconto;
    private double totalPago;

    public Concessionaria() {
        this.totalDesconto = 0;
        this.totalPago = 0;
    }

    public void calcularDesconto(double valorVeiculo, String combustivel) {
        double desconto;
        switch (combustivel.toLowerCase()) {
            case "álcool":
                desconto = valorVeiculo * 0.25;
                break;
            case "gasolina":
                desconto = valorVeiculo * 0.21;
                break;
            case "diesel":
                desconto = valorVeiculo * 0.14;
                break;
            default:
                desconto = 0;
                System.out.println("Tipo de combustível inválido.");
        }
        totalDesconto += desconto;
        double valorPago = valorVeiculo - desconto;
        totalPago += valorPago;
        System.out.println("Desconto: " + desconto);
        System.out.println("Valor a ser pago pelo cliente: " + valorPago);
    }

    public double getTotalDesconto() {
        return totalDesconto;
    }

    public double getTotalPago() {
        return totalPago;
    }
}
