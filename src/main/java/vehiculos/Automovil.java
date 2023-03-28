/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author candr
 */
public class Automovil extends Vehiculo {
    static int cantAutomoviles = 0;
    private long puestos;

    public Automovil(long puestos) {
        this.puestos = puestos;
        cantAutomoviles ++;
        super.puertas=4;
        super.velocidadMaxima = 100;
        super.traccion = "FWD";
        
    }

    public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, long puestos) {
        cantAutomoviles ++;
        super.puertas=4;
        super.velocidadMaxima = 100;
        super.traccion = "FWD";
    
    }
    
}
