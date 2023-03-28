/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

import java.util.Collections;

/**
 *
 * @author candr
 */
public class Pais {
    private static String nombre;

    public Pais(String nombre){
        Pais.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        Pais.nombre = nombre;
    }
    
    
    public static Pais paisMasVendedor(){
        int iMaxVentas =Vehiculo.vPais.indexOf(Collections.max(Vehiculo.vPais));
        return (Vehiculo.pais.get(iMaxVentas));
    }
}
    


