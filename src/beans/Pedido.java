package beans;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.beans.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author oracle
 */
public class Pedido implements Serializable, PropertyChangeListener {

    private String sampleProperty;
    private int numeropedido;
    private int idproducto;
    private Date fecha;
    private int cantidad;
    private boolean pedir;

    public Pedido() {
    }

    @Override
    public void propertyChange(PropertyChangeEvent pce) {
        System.out.println("Anterior: " + pce.getOldValue());
        System.out.println("Nuevo: " + pce.getNewValue());
        System.out.println(pce.getPropagationId());
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
