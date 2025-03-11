/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.carrito.entidades;

/**
 *
 * @author alumnog
 */
public class Seguro {
    
    private String emisor;
    private float deduciblePercentaje;
    private boolean ayudaLegal;
    private int sumaAsegurada;

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public float getDeduciblePercentaje() {
        return deduciblePercentaje;
    }

    public void setDeduciblePercentaje(float deduciblePercentaje) {
        this.deduciblePercentaje = deduciblePercentaje;
    }

    public boolean isAyudaLegal() {
        return ayudaLegal;
    }

    public void setAyudaLegal(boolean ayduLegal) {
        this.ayudaLegal = ayudaLegal;
    }

    public int getSumaAsegurada() {
        return sumaAsegurada;
    }

    public void setSumaAsegurada(int sumaAsegurada) {
        this.sumaAsegurada = sumaAsegurada;
    }
    
}
