package Clases;

import java.util.ArrayList;

public class Cliente extends Persona{
    
    private String direccion;
    private double importeTotal;
    private int numeroProductos;
    private ArrayList <Producto> productos = new ArrayList();

    public Cliente(String direccion, String nombre, String teléfono, String DNI) {
        super(nombre, teléfono, DNI);
        this.direccion = direccion;
    }

    public Cliente(String nombre, String teléfono, String DNI) {
        super(nombre, teléfono, DNI);
    }
    
    public Cliente (){
    }
    
    
    public void añadirProductos (Producto producto){
        productos.add(producto);
    }
    
    public void eliminarProducto(int i){
        if (!(productos.size()<0)) {
            importeTotal = importeTotal - productos.get(i).getPrecioNeto();
            productos.remove(i);
        } else {
            productos.clear();
        }
    }
    
    public void calcularImporteTotal() {
        importeTotal = 0;
        for (int i = 0; i < productos.size(); i++) {
            importeTotal = importeTotal + productos.get(i).getPrecioNeto();
        }
    }
    
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }

    public int getNumeroProductos() {
        return numeroProductos;
    }

    public void setNumeroProductos(int numeroProductos) {
        this.numeroProductos = numeroProductos;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
    
    
}
