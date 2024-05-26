package Proyecto_Terminado;


public class Retiro extends Clase_Abstractaa {

    @Override
    public void Transacciones() {
		//2.Añadimos la consulta con la fecha que se hizo y una validacion para retirar el monto
    	
    			 System.out.print("Cuanto deseas retirar: ");
    		        Retiro();
    		        if (retiro>0 && retiro<= getSaldo()) {
    		            transacciones = getSaldo();
    		            setSaldo(transacciones - retiro);
    		            System.out.println("====================================");
    		            System.out.println("				Debito				");
    		            System.out.println("Se relalizo una Consulta el "+fecha);
    		            System.out.println("Retiraste : " + retiro);
    		            System.out.println("Tu saldo actual es: " + getSaldo());
    		            System.out.println("====================================");
    		        } else if (retiro <= 0) {
						System.out.println("=====================");
						System.out.println("El monto del retiro debe ser positivo.");
						System.out.println("=====================");
					} else {
						System.out.println("=====================");
						System.out.println("Saldo insuficiente.");
						System.out.println("=====================");
					}
	}
}

