package Proyecto_Terminado;

public class Cliente {
    private String identificador;
    private String nombre;
    private String direccion;

    public Cliente(String identificador, String nombre, String direccion) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.direccion = direccion;
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
