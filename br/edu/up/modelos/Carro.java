package br.edu.up.modelos;

public class Carro {

    private double distanciaCarro;
    private double gastosCarro;

    public Carro(double distancia, double gastos) {
        this.distanciaCarro = distancia;
        this.gastosCarro = gastos;
    }

    public double consumo() {
        return distanciaCarro / gastosCarro;
    }
}
