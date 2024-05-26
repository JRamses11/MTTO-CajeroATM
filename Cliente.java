package Proyecto_Terminado;

public class Cliente {
    private String identificador;
    private String nombre;
    private String direccion;

    //4 AÑADIMOS LA VARIABLE CUENTA AL CONSTRUCTOR Y A LA CLASE
    private Cuenta cuenta;

    public Cliente(String identificador, String nombre, String direccion, Cuenta cuenta) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.direccion = direccion;
        this.cuenta=cuenta;
    }

    public String getIdentificador() {
        return identificador;
    }
    public void setIdentificador(String identificador){
        this.identificador=identificador;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
}
