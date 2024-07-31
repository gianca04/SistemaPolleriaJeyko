package Clases;

import java.util.ArrayList;

public class Pedido {
    
    private ArrayList<Cliente> clientes = new ArrayList();
    private double gananciaDelDia;

    public Pedido() {
        this.gananciaDelDia = 0;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void agregarClientes(Cliente cliente){
        clientes.add(cliente);
    }
    
    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public double getGananciaDelDia() {
        return gananciaDelDia;
    }

    public void setGananciaDelDia(double gananciaDelDia) {
        this.gananciaDelDia = gananciaDelDia;
    }
    
    public double calcularGanancias(){
        if (!(clientes.size() < 0)) {
            gananciaDelDia =0;
            for (int i = 0; i < clientes.size(); i++) {
                gananciaDelDia = gananciaDelDia + clientes.get(i).getImporteTotal();
            }
        }
        return gananciaDelDia;
    }

    
    
}
