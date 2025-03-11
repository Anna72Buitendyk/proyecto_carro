/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.carrito.entidades;

import mx.itson.carrito.enums.TipoMotor;

/**
 *
 * @author alumnog
 */
public class Carro {

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the kilometraje
     */
    public float getKilometraje() {
        return kilometraje;
    }

    /**
     * @param kilometraje the kilometraje to set
     */
    public void setKilometraje(float kilometraje) {
        this.kilometraje = kilometraje;
    }
    
    /**
     * @param tipoMotor the kilometraje to set
     */
    public void setTipoMotor(TipoMotor tipoMotor) {
        this.tipoMotor = tipoMotor;
    }
    
    /**
     *
     * @return  Retorna tipoMotor
     */
    public TipoMotor getTipoMotor() {
        return this.tipoMotor;
    }
    
    
    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propiatario) {
        this.propietario = propiatario;
    }

    private String color;
    private int year;
    private String marca;
    private float kilometraje;
    private TipoMotor tipoMotor;
    private Propietario propietario;

    
    /**
     * Calcula cuanto tiempo va tomar viajar n kilometros a m km/hr
     * @param distancia Distancia que ha viajado el carro
     * @param velocidad Velocidad a que esta viajando
     * @return float Tiempo que va durar a llegar
     */
    public float determinarTiempo(float distancia, int velocidad ){
        float tiempo = distancia/velocidad;
        return tiempo;
    }

}
