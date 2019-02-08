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
public class Shampoo extends Producto{
    private String contenido;

    public Shampoo(String contenido, String nombre, int precio) {
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
        return "Nombre: " + getNombre() + " /// Contenido: " + getContenido() + 
                " /// Precio: $" + getPrecio();
    }
}
