/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import beans.Pedido;
import beans.Producto;

/**
 *
 * @author oracle
 */
public class metodosBeans {

    public void añadir() {
        Producto po = new Producto();
        Pedido pe = new Pedido();

        po.addPropertyChangeListener(pe);
        po.setStockactual(23);
        System.out.println("Stock Aumentado: " + po.getStockactual());
    }

    public void restar() {
        Producto po = new Producto();
        Pedido pe = new Pedido();

        po.addPropertyChangeListener(pe);
        po.setStockactual(-1);
        System.out.println("Stock Restado: " + po.getStockactual());
    }
}
