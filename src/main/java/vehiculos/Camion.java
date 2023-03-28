/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author candr
 */
public class Camion extends Vehiculo {
    private long ejes;
    static int cantCamiones =0;

    public Camion(long ejes) {
        this.ejes = ejes;
        super.puertas = 2;
        super.velocidadMaxima = 80;
        super.traccion = "4x2";
        cantCamiones++;
        
    }

    public long getEjes() {
        return ejes;
    }

    public void setEjes(long ejes) {
        this.ejes = ejes;
    }


    public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, long ejes) {
       this(ejes);
       this.placa = placa;
       this.nombre = nombre;
       this.precio = precio;
       this.peso = peso;
       this.fabricante = fabricante;

       
    }
}
