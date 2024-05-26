package Proyecto_Terminado;
import java.util.Scanner;

public class Main {
	static Scanner entrada = new Scanner(System.in);

    //1. Del cajero necesitamos saber su localizacion y banco
    private String localizacion;
    private String banco;

    public Main(String localizacion, String banco){
        this.localizacion=localizacion;
        this.banco=banco;
    }

    public static void main(String[] args) {
        System.out.println("----------------------------------------------------");
        System.out.println("Bienvenido al Cajero Automático");
        System.out.println("Por favor ingrese la información solicitada:");

        System.out.print("Localización del cajero automático: ");
        String localizacion = entrada.nextLine();

        System.out.print("Banco al que pertenece el cajero automático: ");
        String banco = entrada.nextLine();

        System.out.println("----------------------------------------------------");

        Main cajeroAutomatico = new Main(localizacion, banco);
        cajeroAutomatico.mostrarInformacion();


        System.out.println("----------------------------------------------------");
        System.out.println("Ingrese su Nombre:	(Catalina)");
        String Nombre = entrada.nextLine();
        System.out.println("Ingrese su Numero de cuenta:	(23140972)");
        String Num_cuenta = entrada.nextLine();
        System.out.println("Ingrese su Nip:		(8002)");
        int Nip = entrada.nextInt();
        System.out.println("----------------------------------------------------");
        if(Nombre.equals("Catalina") && Num_cuenta.equals("23140972") && Nip==8002) {
        	System.out.println("===============================================");
        	System.out.print(Nombre);
            Clase_Abstractaa mesajero = new Consulta();
            mesajero.setSaldo(1700);
            mesajero.Operaciones();
        }else {
        	System.out.println("===============================================");
            System.out.println("Alguno de sus datos es erroneo, intente denuevo");
        	System.out.println("===============================================");
   
        }
    }
    public void mostrarInformacion() {
        System.out.println("Información del Cajero Automático:");
        System.out.println("Localización: " + localizacion);
        System.out.println("Banco: " + banco);
        System.out.println("----------------------------------------------------");
    }

    public String getNombre(){
        return getNombre();
    }
}

