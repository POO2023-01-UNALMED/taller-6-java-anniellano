package vehiculos;

/**
 *
 * @author candr
 */
public class Camioneta extends Vehiculo {
    private boolean volco;
    static int cantCamionetas = 0;

    public Camioneta(String placa, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
        super(placa, nombre, precio, peso, fabricante);
        this.volco = volco;
        cantCamionetas ++;
        super.velocidadMaxima = 90;
        super.traccion = "4X4";  
    }

    public Camioneta(String placa, long puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
        super(placa, puertas, nombre, precio, peso, fabricante);
        this.volco = volco;
        cantCamionetas ++;
        super.velocidadMaxima = 90;
        super.traccion = "4X4";  
    }
    
    public boolean isVolco() {
        return volco;
    }

    public void setVolco(boolean volco) {
        this.volco = volco;
    }
   
}