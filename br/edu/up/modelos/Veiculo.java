package br.edu.up.modelos;

public class Veiculo {

    private int impostos = 45;
    private int distribuidor = 28;
    private float custoImposto;
    private float custoTotal;

    public Veiculo(float custoFabrica) {
        this.custoImposto = (((impostos * custoFabrica) / 100) + custoFabrica);
        this.custoTotal = this.custoImposto;
    }

    public Veiculo(float custoImposto, boolean incluirDistribuidor) {
        this.custoTotal = ((distribuidor * custoImposto) / 100) + custoImposto;
    }

    public float getCustoTotal() {
        return this.custoTotal;
    }
}
