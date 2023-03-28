/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

import static vehiculos.Automovil.cantAutomoviles;
import static vehiculos.Camion.cantCamiones;
import static vehiculos.Camioneta.cantCamionetas;

/**
 *
 * @author candr
 */
public class Vehiculo {

    protected String placa;
    protected long puertas;
    protected long velocidadMaxima;
    protected String nombre;
    protected int precio;
    protected long peso;
    protected String traccion;
    protected Fabricante fabricante;
    protected static int cantidadVehiculos;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public long getPuertas() {
        return puertas;
    }

    public void setPuertas(long puertas) {
        this.puertas = puertas;
    }

    public long getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(long velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public long getPeso() {
        return peso;
    }

    public void setPeso(long peso) {
        this.peso = peso;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public static int getCantidadVehiculos() {
        return cantidadVehiculos;
    }

    public static void setCantidadVehiculos(int cantidadVehiculos){
        Vehiculo.cantidadVehiculos = cantidadVehiculos;
    }
    public Vehiculo(String placa, String nombre, int precio, long peso, Fabricante fabricante) {
        this.placa = placa;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.fabricante = fabricante;
        cantidadVehiculos++;       
    }
    
    public Vehiculo(String placa, long puertas,String nombre, int precio, long peso, Fabricante fabricante) {
        this.placa = placa;
        this.nombre = nombre;
        this.puertas = puertas;
        this.precio = precio;
        this.peso = peso;
        this.fabricante = fabricante;
        cantidadVehiculos++;
        
    }
    
    public Vehiculo(String placa, long puertas, long velocidadMaxima, String nombre, int precio, long peso, String traccion, Fabricante fabricante) {
        this.placa = placa;
        this.nombre = nombre;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.precio = precio;
        this.traccion = traccion;
        this.peso = peso;
        this.fabricante = fabricante;
        cantidadVehiculos++;
        
    }
    
    public static String vehiculosPorTipo(){
        return("Automoviles: "+cantAutomoviles+
                        "\nCamionetas: "+cantCamionetas+
                        "\nCamiones: "+cantCamiones);
    }
    
    
}
