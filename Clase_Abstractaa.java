package Proyecto_Terminado;
import Proyecto_Terminado.Operaciones.Consulta;
import Proyecto_Terminado.Operaciones.Deposito;
import Proyecto_Terminado.Operaciones.Retiro;
import Proyecto_Terminado.Operaciones.Transferencia;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;
public abstract class Clase_Abstractaa {
    //2. AÑADIMOS LAS VARIABLES idTransaccion, fecha, tipoTransaccion, cuentaDestino y un metodo para desvolver el id y fecha
    protected int transacciones, retiro, deposito, transferencia;
    private static int saldo;
    protected String idTransaccion;
    protected String fecha;
    protected String tipoTransaccion;
    protected String cuentaDestino;
    static ArrayList<TarjetaDebito> usuarios = new ArrayList<TarjetaDebito>();
    Scanner entrada = new Scanner(System.in);


    //3.AÑADIMOS LA VARIABLE TARJETA DE DEBITO Y UN METODO
    protected TarjetaDebito tarjetaDebito;

    public Clase_Abstractaa(TarjetaDebito tarjetaDebito) {
        this.tarjetaDebito = tarjetaDebito;
    }

    public Clase_Abstractaa() {
        this.idTransaccion = UUID.randomUUID().toString();
        this.fecha = String.valueOf(LocalDate.now());
    }



    public void Operaciones() {
        int bandera = 0;
        int seleccion = 0;
        String Nombre = "";
        LocalDate fechaActual = LocalDate.now();
        do {
            do {
                System.out.println("=================================================");
                System.out.println(" Buenas tardes que operacion desea realizar");
                System.out.println("Fecha:"+fechaActual);
                System.out.println(" Porfavor seleccione una opción:");
                System.out.println("    1. Consulta de saldo.");
                System.out.println("    2. Retiro de efectivo.");
                System.out.println("    3. Hacer una transferencia");
                System.out.println("    4. Salir.");
                System.out.println("=================================================");
                seleccion = entrada.nextInt();

                if (seleccion >= 1 && seleccion <= 4) {
                    bandera = 1;
                } else {
                    System.out.println("=================================================");
                    System.out.println("Opción no disponible, vuelva a intentar porfavor.");
                    System.out.println("=================================================");
                }
            } while (bandera == 0);
            
            if(seleccion == 1){
            	Clase_Abstractaa mensajero = new Consulta();
                mensajero.setTarjetaDebito(getTarjetaDebito());
                mensajero.Transacciones();
            }else if(seleccion == 2){
            	Clase_Abstractaa mensajero = new Retiro();
                mensajero.setTarjetaDebito(getTarjetaDebito());
                mensajero.Retirar(tarjetaDebito.getCuenta(),"Retiro",retiro);
            } else if(seleccion == 3){
                entrada.nextLine();
                System.out.println("Ingrese El numero de tarjeta al que desea trasferir:");
                String tarjeta = entrada.nextLine();
                TarjetaDebito tarjetaDestino = encontrarTarjetaRegistrada(tarjeta);
                if(tarjetaDestino != null){
                    Clase_Abstractaa mensajero = new Transferencia();
                    mensajero.setTarjetaDebito(getTarjetaDebito());
                    mensajero.Transferir(tarjetaDebito.getCuenta(), tarjetaDestino, "Transferencia", transferencia);
                }else{
                    System.out.println("Esta tarjeta no esta registrada por un usuario");
                }
                //mensajero.Trasferir();
            } else if(seleccion == 4){
                System.out.println("==========================");
                System.out.println("Gracias, vuelva pronto.");
                System.out.println("==========================");
                bandera = 2;
            }
        } while (bandera != 2);
    }

    public abstract void Retirar(Cuenta cuenta, String tipo, int monto);
    public abstract void Transferir(Cuenta cuenta, TarjetaDebito tarjetaDestino, String transferencia, int retiro);

    public int defineRetiro(){
        return retiro = entrada.nextInt();
    }

    public int defineTransferencia(){
        return transferencia = entrada.nextInt();
    }

    public void limpiarBuffer(){
        entrada.nextLine();
    }

    public abstract void Transacciones();


    public void Deposito(){
        deposito = entrada.nextInt();
    }

    public int getSaldo(){
        return saldo;
    }

    public TarjetaDebito getTarjetaDebito() {
        return tarjetaDebito;
    }

    public void setTarjetaDebito(TarjetaDebito tarjetaDebito) {
        this.tarjetaDebito = tarjetaDebito;
        setSaldo(tarjetaDebito.getCuenta().getSaldo());
    }

    public void setSaldo(int saldo){
        this.saldo = saldo;
    }

    private static TarjetaDebito encontrarTarjetaRegistrada(String numTarjeta) {
        for(TarjetaDebito tarjeta : usuarios){
            if(tarjeta.getNumTarjeta().equals(numTarjeta)){
                return tarjeta;
            }
        }
        return null;
    }

    public static ArrayList<TarjetaDebito> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<TarjetaDebito> usuarios) {
        Clase_Abstractaa.usuarios = usuarios;
    }
}
