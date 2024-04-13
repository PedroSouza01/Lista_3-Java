package br.edu.up.modelos;

public class Produto {

    private float precofinal;

    public Produto(float precoCusto, int acrescimo) {
        this.precofinal = ((acrescimo * precoCusto) / 100) + precoCusto;
    }

    public float getPrecofinal() {
        return this.precofinal;
    }
}
