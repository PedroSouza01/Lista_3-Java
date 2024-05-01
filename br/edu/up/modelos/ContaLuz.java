package br.edu.up.modelos;

public class ContaLuz {
    private int TipoClienteObj;
    private float kilowattObj;
    private double valorObj;

    public ContaLuz(int tipoCliente, float kilowatt, double valor) {
        this.TipoClienteObj = tipoCliente;
        this.kilowattObj = kilowatt;
        this.valorObj = valor;
    }

    public int getTipoClienteObj() {
        return TipoClienteObj;
    }

    public void setTipoClienteObj(int tipoCliente) {
        TipoClienteObj = tipoCliente;
    }

    public float getKilowattObj() {
        return kilowattObj;
    }

    public void setKilowattObj(float kilowatt) {
        this.kilowattObj = kilowatt;
    }

    public double getValor() {
        return valorObj;
    }

    public void setValor(double valor) {
        this.valorObj = valor;
    }

    
}
