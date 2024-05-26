package Proyecto_Terminado;

public class Cuenta {
    private String tipo;
    private Cliente cliente;
    private String numeroCuenta;

    public Cuenta(String tipo, Cliente cliente, String numeroCuenta) {
        this.tipo = tipo;
        this.cliente = cliente;
        this.numeroCuenta = numeroCuenta;
    }

    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    public Cliente getCliente(){
        return cliente;
    }
    public void setCliente(Cliente cliente){
        this.cliente=cliente;
    }
    public String getNumeroCuenta(){
        return numeroCuenta;
    }
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
}
