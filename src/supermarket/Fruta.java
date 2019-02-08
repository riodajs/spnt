/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

/**
 *
 * @author riodajs
 */
public class Fruta extends Producto{
    
    private String unidad;

    public Fruta(String unidad, String nombre, int precio) {
        super(nombre, precio);
        this.unidad = unidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + getNombre() + " /// Precio: $" + getPrecio()
                +  " /// Unidad de venta: " + getUnidad();
    }
}
