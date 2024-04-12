package br.edu.up.modelos;

public class Conversor {
    private float cotacaoConversor;
    private float valorTotalConversor;
    private float valorConversor;
    private float valorConvertido;

    public Conversor(float cotacao, float valorTotal, float valor) {
        this.cotacaoConversor = cotacao;
        this.valorTotalConversor = valorTotal;
        this.valorConversor = valor;
    }

    public float getCotacaoConversor() {
        return cotacaoConversor;
    }

    public void setCotacaoConversor(float cotacao) {
        this.cotacaoConversor = cotacao;
    }

    public float getValorTotalConversor() {
        return valorTotalConversor;
    }

    public void setValorTotalConversor(float valorTotal) {
        this.valorTotalConversor = valorTotal;
    }

    public float getValorConversor() {
        return valorConversor;
    }

    public void setValorConversor(float valor) {
        this.valorConversor = valor;
    }

    public float getvalorConvertido() {
        return valorConvertido;
    }

    public void setvalorConvertido(float valorConversor, float cotacaoConversor) {
        this.valorConvertido = valorConversor * cotacaoConversor;
    }

}
