package Proyecto_Terminado;
import java.util.Scanner;
public class Transferencia extends Clase_Abstractaa {
    static Scanner entrada = new Scanner(System.in);

    @Override
    public void Transacciones() {
        //2.AÑADIMOS UNA VALIDACION PARA LA TRANSFERENCIA ACTUALIZACION DE LA FECHA A QUE CUENTA DESTINO Y TIPO DE TRANSACCION
    			System.out.print("Cuanto quieres Transferir: ");
                Transferencia();
                if (transferencia>0 && transferencia<= getSaldo()) {
                    transacciones = getSaldo();
                    setSaldo(transacciones - transferencia);
                    tipoTransaccion="Transferencia";
                    cuentaDestino= entrada.nextLine();
                    System.out.println("====================================");
                    System.out.println("				Debito				");
                    System.out.println("Se relalizo una Consulta el" +fecha);
                    System.out.println("A la cuenta "+cuentaDestino);
                    System.out.println("transferiste : " + transferencia);
                    System.out.println("Tu saldo actual es: " + getSaldo());
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
}