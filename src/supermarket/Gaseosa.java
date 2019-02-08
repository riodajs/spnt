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
public class Gaseosa  extends Producto{
    private String contenido;

    public Gaseosa(String contenido, String nombre, int precio) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + " /// Litros: " + getContenido() + 
                " /// Precio: $" + getPrecio();
    }
    
    
}
