package Clases;

public class Producto {
    private String nombreProducto;
    private int id;
    private double precioUnidad;
    private double precioNeto;

    public Producto(String nombreProducto, int id, double PrecioUnidad) {
        this.nombreProducto = nombreProducto;
        this.id = id;
        this.precioUnidad = PrecioUnidad;
        this.precioNeto = 0;
        
    }

    public Producto() {
        this.nombreProducto = "";
        this.id = 0;
        this.precioUnidad = 0;
        this.precioNeto = 0;
        precioNeto = 0;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(double PrecioUnidad) {
        this.precioUnidad = PrecioUnidad;
    }

    public double getPrecioNeto() {
        return precioNeto;
    }

    public void setPrecioNeto(double precioNeto) {
        this.precioNeto = precioNeto;
    }
    
    public double calcularPrecioNeto(double cantidad){
        precioNeto = precioUnidad*cantidad;
        return precioNeto;
    }
    
}
