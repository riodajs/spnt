/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author riodajs
 */
public class Market {
    
    public Market() {
    }
    
    public void cargarProductos(ArrayList p){
        p.add(new Gaseosa("1.5", "Coca-Cola Zero", 20));
        p.add(new Gaseosa("1.5", "Coca-Cola", 18));
        p.add(new Shampoo("500ml", "Shampoo Sedal", 19));
        p.add(new Fruta("Kilo", "Frutillas", 64));
    }
    
    public void mostrarProductos(ArrayList p){
        p.forEach((producto) -> System.out.println(producto.toString()));
        System.out.println("=============================");
    }
    
    public void productoCaroBarato(ArrayList<Producto> p){
        Collections.sort(p);
        System.out.println("Producto más barato: " + p.get(0).getNombre());
        System.out.println("Producto más caro: " + p.get(p.size() - 1).getNombre());
    }
}
