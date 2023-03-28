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
public class Fabricante {
    private static String nombre;
    private static Pais pais;

    public Fabricante(String nombre, Pais pais) {
        Fabricante.nombre = nombre;
        Fabricante.pais = pais;
    }
    
    public Fabricante(String nombre){
        Fabricante.nombre =nombre;
    }
    
    public Fabricante(Pais pais){
        Fabricante.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        Fabricante.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        Fabricante.pais = pais;
    }
    
    public static Fabricante fabricaMayorVentas(){
        int iMaxVentas =Vehiculo.vFabrica.indexOf(Collections.max(Vehiculo.vFabrica));
        return (Vehiculo.fabrica.get(iMaxVentas));
    }
}
