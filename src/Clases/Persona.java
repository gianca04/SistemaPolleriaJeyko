package Clases;

public class Persona {
    private String nombre;
    private String teléfono;
    private String DNI;

    public Persona(String nombre, String teléfono, String DNI) {
        this.nombre = nombre;
        this.teléfono = teléfono;
        this.DNI = DNI;
    }

        public Persona() {
        this.nombre = "";
        this.teléfono = "";
        this.DNI = "";
    }
        
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(String teléfono) {
        this.teléfono = teléfono;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
}
