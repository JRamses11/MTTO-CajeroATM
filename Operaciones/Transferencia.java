package Proyecto_Terminado.Operaciones;

import Proyecto_Terminado.Clase_Abstractaa;
import Proyecto_Terminado.Cuenta;
import Proyecto_Terminado.TarjetaDebito;
import Proyecto_Terminado.Transaccion;


public class Transferencia extends Clase_Abstractaa {

    @Override
    public void Transferir(Cuenta cuenta, TarjetaDebito tarjetaDestino, String tipo, int transferencia) {
        System.out.print("Ingrese la cantidad deseada a Transferir: ");
        transferencia = defineTransferencia();
        if (transferencia>0 && transferencia <= getSaldo()) {
            transacciones = getSaldo();
            setSaldo(transacciones - transferencia);
            cuenta.setSaldo(transacciones - transferencia);
            tarjetaDestino.getCuenta().setSaldo(transferencia+tarjetaDestino.getCuenta().getSaldo());
            //cuentaDestino= entrada.nextLine();
            System.out.println("====================================");
            System.out.println("				Debito				");
            System.out.println("Se relalizo una Consulta el" +fecha);
            System.out.println("A la cuenta: "+tarjetaDestino.getNumTarjeta());
            System.out.println("Con el Nombre: "+tarjetaDestino.getCliente().getNombre());
            System.out.println("Banco Destino: "+tarjetaDestino.getCliente().getBanco());
            System.out.println("Transferiste : " + transferencia);
            System.out.println("Tu saldo actual es: " + getSaldo());
            Transaccion transaccion = new Transaccion(fecha,"Transferencia",transferencia,getTarjetaDebito(),tarjetaDestino);
            System.out.println(transaccion.imprimirTicketTransferencia());
            System.out.println("====================================");
        }else if (transferencia <= 0) {
            System.out.println("=====================");
            System.out.println("El monto de la transferencia debe ser positivo.");
            System.out.println("=====================");
        } else {
            System.out.println("=====================");
            System.out.println("Saldo insuficiente.");
            System.out.println("=====================");
        }
    }


    @Override
    public void Transacciones() {
        //2.AÑADIMOS UNA VALIDACION PARA LA TRANSFERENCIA ACTUALIZACION DE LA FECHA A QUE CUENTA DESTINO Y TIPO DE TRANSACCION

    }

    @Override
    public void Retirar(Cuenta cuenta, String tipo, int monto) {

    }

}