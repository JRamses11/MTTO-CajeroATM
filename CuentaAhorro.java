package Proyecto_Terminado;

public class CuentaAhorro implements Cuenta{
    private String tipo;
    private Cliente cliente;
    private String numeroCuenta;

    public CuentaAhorro(Cliente cliente, String numeroCuenta) {
        this.tipo = "Cuenta de Ahorro";
        this.cliente = cliente;
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public String toString() {
        return "CuentaAhorro{" +
                "tipo='" + tipo + '\'' +
                ", cliente=" + cliente +
                ", numeroCuenta='" + numeroCuenta + '\'' +
                '}';
    }
}
