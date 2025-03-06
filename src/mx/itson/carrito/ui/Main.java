/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.carrito.ui;

import java.util.Scanner;
import mx.itson.carrito.entidades.Carro;

/**
 *
 * @author alumnog
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la distancia que recorrio: ");
        float distancia = scanner.nextFloat();
        
        System.out.print("Ingrese a que velocidad esta viajando: ");
        int velocidad = scanner.nextInt();
        
        //Creamos un nuevo instancia de la clase carro
        Carro enclave = new Carro();
        enclave.setMarca("Buick");
        enclave.setColor("negro");
        enclave.setYear(2008);
        enclave.setKilometraje(357000);
        
        float tiempo = enclave.determinarTiempo(distancia, velocidad);
        System.out.println("El tiempo que tomara el " + enclave.getMarca() + " del año " + enclave.getYear() + " de color " + enclave.getColor() + ", para llegar es " + tiempo + " horas" );
        enclave.setKilometraje(enclave.getKilometraje() + distancia);
        System.out.println("El nuevo kilometraje es " + enclave.getKilometraje());
    }
}
