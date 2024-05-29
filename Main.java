package Proyecto_Terminado;
import java.sql.SQLOutput;
import java.util.ArrayList;
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
    static ArrayList<TarjetaDebito> usuarios = new ArrayList<TarjetaDebito>();

    public static void main(String[] args) {
        int seleccion = 0;
        do {
            System.out.println("Por favor seleccione una opcion para continuar:");
            System.out.println("    1. Usar Cajero ATM.");
            System.out.println("    2. Registrar usuario ATM.");
            System.out.println("    3. Salir.");
            seleccion = entrada.nextInt();

            if (seleccion >= 1 && seleccion <= 3) {
                if (seleccion == 1) {
                    entradaCajero();
                } else if (seleccion == 2) {
                    crearCliente();
                } else if (seleccion == 3) {
                    System.out.println("Saliendo del programa...");
                }
            } else {
                System.out.println("=================================================");
                System.out.println("Opción no disponible, vuelva a intentar por favor.");
                System.out.println("=================================================");
            }
        } while (seleccion != 3);

    }

    private static void entradaCajero() {
        entrada.nextLine();
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

    private static void crearCliente() {
        entrada.nextLine();
        System.out.println("Ingrese su nombre completo:");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese su direccion:");
        String direccion = entrada.nextLine();
        System.out.println("Ingrese el nombre de su banco:");
        String banco = entrada.nextLine();
        String numeroCuenta = String.valueOf(usuarios.size()+1);
        Cliente cliente = new Cliente(nombre, direccion, banco);
        int seleccion = 0;
        int bandera = 0;
        Cuenta cuenta;
        do {
            System.out.println("Por favor seleccione el tipo de cuenta que desea:");
            System.out.println("    1. Cuenta de Ahorros.");
            System.out.println("    2. Cuenta de Cheques.");
            seleccion = entrada.nextInt();
            if (seleccion == 1 || seleccion == 2) {
                bandera = 1;
            } else {
                System.out.println("=================================================");
                System.out.println("Opción no disponible, vuelva a intentar porfavor.");
                System.out.println("=================================================");
            }
        } while (bandera == 0);
        if(seleccion == 1){
            cuenta = new CuentaAhorro(cliente,numeroCuenta);
        }else{
            cuenta = new CuentaCheques(cliente,numeroCuenta);
        }
        TarjetaDebito tb = new TarjetaDebito(cuenta, cliente);
        System.out.println(tb.toString());
        usuarios.add(tb);
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

