package Proyecto_Terminado;

import java.util.UUID;

public class Transaccion {
    private String idTransaccion;
    private String fecha;
    private String tipo;
    private int monto;
    private TarjetaDebito cliente;
    private TarjetaDebito cuentaDestino;


    public Transaccion(String fecha, String tipo, int monto, TarjetaDebito cliente) {
        this.idTransaccion = generarIdUnicoTransaccion();
        this.fecha = fecha;
        this.tipo = tipo;
        this.monto = monto;
        this.cliente = cliente;
    }

    public Transaccion(String fecha, String tipo, int monto, TarjetaDebito cliente, TarjetaDebito destino) {
        this.idTransaccion = generarIdUnicoTransaccion();
        this.fecha = fecha;
        this.tipo = tipo;
        this.monto = monto;
        this.cliente = cliente;
        this.cuentaDestino = destino;
    }


    private String generarIdUnicoTransaccion() {
        return UUID.randomUUID().toString();
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        tipo = tipo;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public TarjetaDebito getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(TarjetaDebito cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }

    public TarjetaDebito getCliente() {
        return cliente;
    }

    public void setCliente(TarjetaDebito cliente) {
        this.cliente = cliente;
    }

    public String imprimirTicketRetiro() {
        return "----------------Ticket------------------" +
                "\nCliente:" + this.cliente.getCliente().getNombre()+
                "\nTarjeta:"+this.cliente.getNumTarjeta()+
                "\nBanco:" + this.cliente.getCliente().getBanco() +
                "\nTipo:" + this.tipo +
                "\nMonto:" + this.monto;
    }

    public String imprimirTicketTransferencia() {
        return "----------------Ticket------------------" +
                "\nCliente:" + this.cliente.getCliente().getNombre()+
                "\nTarjeta:"+this.cliente.getNumTarjeta()+
                "\nBanco:" + this.cliente.getCliente().getBanco() +
                "\nTipo:" + this.tipo +
                "\nMonto:" + this.monto +
                "\nDestino:" + this.cuentaDestino.getNumTarjeta() +
                "\nNombre Destino:" + this.cuentaDestino.getCliente().getNombre() +
                "\nBanco Destino:" + this.cuentaDestino.getCliente().getBanco();
    }
}
