package Clases;

public class Empleado extends Persona{
    private String cargo;
    private double sueldo;
    private int id;
    private String user;
    private String pass;
    
    public Empleado(String cargo, int id, String nombre, String teléfono, String DNI, String user,
            String pass) {
        super(nombre, teléfono, DNI);
        this.cargo = cargo;
        this.sueldo = 0;
        this.id = id;  
        this.user = user;
        this.pass = pass;
}

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    public Empleado() {
        super();
        this.cargo = "";
        this.sueldo = 0;
        this.id = 0;
    }
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public double calcularSueldo(double diasTrabajados, double tardanzas)
    {
        double sueldoNeto=0;
        switch (cargo)
        {
            case "administrador":
                sueldoNeto = 60; 
                break;
            case "motorizado":
                sueldoNeto=35;
                break;
            case "cocinero":
                sueldoNeto=50;
                break;
            case "ayudante de cocina":
                sueldoNeto=30;
                break;
            default:
                break;
        }
        sueldo = ((diasTrabajados*sueldoNeto)-(tardanzas*10));
        return sueldo;
    }
    
}
