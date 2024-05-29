package Proyecto_Terminado.Operaciones;

//import Proyecto.ClasePadre_Abstracta;

import Proyecto_Terminado.Clase_Abstractaa;
import Proyecto_Terminado.Cuenta;
import Proyecto_Terminado.TarjetaDebito;

public class Consulta extends Clase_Abstractaa {
    
    @Override
    public void Transacciones(){
        System.out.println("====================================");
        System.out.println("				Debito				");
        System.out.println("Se relalizo una Consulta el " +fecha);
        System.out.println("Tu saldo actual es: " + getSaldo());
        System.out.println("====================================");
    }

    @Override
    public void Retirar(Cuenta cuenta, String tipo, int monto) {

    }

    @Override
    public void Transferir(Cuenta cuenta, TarjetaDebito tarjetaDestino, String transferencia, int retiro) {

    }
}
