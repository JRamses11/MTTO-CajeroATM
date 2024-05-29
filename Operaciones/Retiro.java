package Proyecto_Terminado.Operaciones;


import Proyecto_Terminado.Clase_Abstractaa;
import Proyecto_Terminado.Cuenta;
import Proyecto_Terminado.TarjetaDebito;
import Proyecto_Terminado.Transaccion;

public class Retiro extends Clase_Abstractaa {

	@Override
	public void Retirar(Cuenta cuenta, String tipo, int monto) {
		//2.Añadimos la consulta con la fecha que se hizo y una validacion para retirar el monto

    			 System.out.print("Cuanto deseas retirar: ");
					monto = defineRetiro();
    		        if (monto>0 && monto<= getSaldo()) {
    		            transacciones = getSaldo();
    		            setSaldo(transacciones - monto);
						cuenta.setSaldo(transacciones - monto);
    		            System.out.println("====================================");
    		            System.out.println("				Debito				");
    		            System.out.println("Se relalizo una Consulta el "+fecha);
    		            System.out.println("Retiraste : " + monto);
    		            System.out.println("Tu saldo actual es: " + getSaldo());
						Transaccion transaccion = new Transaccion(fecha,"Retiro",monto,getTarjetaDebito());
						System.out.println(transaccion.imprimirTicketRetiro());
    		            System.out.println("====================================");
    		        } else if (monto <= 0) {
						System.out.println("=====================");
						System.out.println("El monto del retiro debe ser positivo.");
						System.out.println("=====================");
					} else {
						System.out.println("=====================");
						System.out.println("Saldo insuficiente.");
						System.out.println("=====================");
					}
	}

	@Override
	public void Transferir(Cuenta cuenta, TarjetaDebito tarjetaDestino, String transferencia, int retiro) {
	}

	@Override
	public void Transacciones() {
	}
}

