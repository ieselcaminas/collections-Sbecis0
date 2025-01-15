package personas;

public class Persona {
    private String Nombre;
    private String Apellidos;
    private String Cumple;

    public Persona(String Nombre, String Apellidos, String Cumple){
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Cumple = Cumple;
    }
    public String getNombre(){
        return this.Nombre;
    }
    public String getApellidos(){
        return this.Apellidos;
    }
    public String getCumple(){
        return this.Cumple;
    }
}
