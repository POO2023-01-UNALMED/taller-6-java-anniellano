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

    public long getPuestos() {
        return puestos;
    }

    public void setPuestos(long puestos) {
        this.puestos = puestos;
    }

    public Automovil(String placa, String nombre, int precio, long peso, Fabricante fabricante, long puestos) {
        super(placa, nombre, precio, peso, fabricante);
        this.puestos = puestos;
        cantAutomoviles ++;
               super.puertas=4;
        super.velocidadMaxima = 100;
        super.traccion = "FWD";
        
    
    }
    
}
