/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;


/**
 *
 * @author candr
 */
public class Camioneta extends Vehiculo {
    private boolean volco;
    static int cantCamionetas = 0;

    public Camioneta(boolean volco) {
        this.volco = volco;
        cantCamionetas ++;
        super.velocidadMaxima = 90;
        super.traccion = "4x4";
    }

    public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
        setPlaca(placa);
        setPuertas(puertas);
        setNombre(nombre);
        setPrecio(precio);
        setPeso(peso);
        setFabricante(fabricante);
        this.volco = volco;
        cantCamionetas++;

    }

    public boolean isVolco() {
        return volco;
    }

    public void setVolco(boolean volco) {
        this.volco = volco;
    }
    
    
}
