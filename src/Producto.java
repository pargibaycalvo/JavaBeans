/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author oracle
 */
public class Producto implements Serializable {

    public static final String PROP_SAMPLE_PROPERTY = "sampleProperty";

    private String sampleProperty;
    private PropertyChangeSupport propertySupport;

    private String descripcion;
    private int idproducto;
    private int stockminimo;
    private float pvp;

    public Producto() {
        propertySupport = new PropertyChangeSupport(this);
    }

    public Producto(String sampleProperty, PropertyChangeSupport propertySupport, String descripcion, int idproducto, int stockminimo, float pvp) {
        this.sampleProperty = sampleProperty;
        this.propertySupport = propertySupport;
        this.descripcion = descripcion;
        this.idproducto = idproducto;
        this.stockminimo = stockminimo;
        this.pvp = pvp;
    }

    public String getSampleProperty() {
        return sampleProperty;
    }

    public void setSampleProperty(String sampleProperty) {
        this.sampleProperty = sampleProperty;
    }

    public PropertyChangeSupport getPropertySupport() {
        return propertySupport;
    }

    public void setPropertySupport(PropertyChangeSupport propertySupport) {
        this.propertySupport = propertySupport;
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

    public int getStockminimo() {
        return stockminimo;
    }

    public void setStockminimo(int stockminimo) {
        this.stockminimo = stockminimo;
    }

    public float getPvp() {
        return pvp;
    }

    public void setPvp(float pvp) {
        this.pvp = pvp;
    }
    

    

}
