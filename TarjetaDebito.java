package Proyecto_Terminado;

import java.util.Random;

public class TarjetaDebito {
    private String numTarjeta;
    private Cuenta cuenta;
    private Cliente cliente;

    public TarjetaDebito(Cuenta cuenta, Cliente cliente) {
        this.numTarjeta=generarNumeracionTarjeta();
        this.cuenta = cuenta;
        this.cliente = cliente;
    }

    public String generarNumeracionTarjeta() {
        Random random = new Random();
        StringBuilder creditCardNumber = new StringBuilder();

        // Generar 16 dígitos
        for (int i = 0; i < 16; i++) {
            int digit = random.nextInt(10); // Genera un número entre 0 y 9
            creditCardNumber.append(digit);
        }
        return creditCardNumber.toString();
    }

    public String getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public Cuenta getCuenta(){
        return cuenta;
    }
    public void setCuenta(Cuenta cuenta){
        this.cuenta=cuenta;
    }
    public Cliente getCliente(){
        return cliente;
    }
    public void setCliente(Cliente cliente){
        this.cliente=cliente;
    }

    @Override
    public String toString() {
        return "TarjetaDebito:" +
                "Numero de Tarjeta=" + numTarjeta +
                "\nCliente: Nombre:" + cliente.getNombre() +"\tDireccion:"+cliente.getDireccion()+"\tBanco:"+cliente.getBanco()+"\tIdentificador:"+cliente.getIdentificador()+
                "\nCuenta: Tipo:" + cuenta.getTipo() + "\tNumero de Cuenta:"+cuenta.getNumeroCuenta();
    }
}
