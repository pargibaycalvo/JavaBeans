/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;

/**
 *
 * @author oracle
 */
public class Producto implements Serializable {

    private String descripcion;
    private int idproducto;
    private int stockmin, stockactual;
    private float vp;
    PropertyChangeSupport propertyS;

    public Producto() {
        propertyS = new PropertyChangeSupport(this);
        stockmin = 0;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyS.addPropertyChangeListener(listener);
    }

    public int getStockactual() {
        return stockactual;
    }

    public void setStockactual(int stockUpdate) {
        if (stockUpdate < stockmin) {
            propertyS.firePropertyChange("stockactual", stockactual, stockUpdate);
        }
        this.stockactual = stockUpdate;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public int getStockmin() {
        return stockmin;
    }

    public void setStockmin(int stockmin) {
        this.stockmin = stockmin;
    }

    public float getVp() {
        return vp;
    }

    public void setVp(float vp) {
        this.vp = vp;
    }

    public PropertyChangeSupport getPropertyS() {
        return propertyS;
    }

    public void setPropertyS(PropertyChangeSupport propertyS) {
        this.propertyS = propertyS;
    }

}
