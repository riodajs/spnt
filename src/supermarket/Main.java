/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

import java.util.ArrayList;

/**
 *
 * @author riodajs
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Market mercado = new Market();
        ArrayList<Producto> productos = new ArrayList();
        
        mercado.cargarProductos(productos);
        
        mercado.mostrarProductos(productos);
        
        mercado.productoCaroBarato(productos);
        
    }
    
}
