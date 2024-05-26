package Proyecto_Terminado;

//import Proyecto.ClasePadre_Abstracta;

public class Consulta extends Clase_Abstractaa{
    
    @Override
    public void Transacciones(){
        System.out.println("====================================");
        System.out.println("				Debito				");
        System.out.println("Se relalizo una Consulta el " +fecha);
        System.out.println("Tu saldo actual es: " + getSaldo());
        System.out.println("====================================");
    }    
}
