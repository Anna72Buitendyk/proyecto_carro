/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.carrito.ui;

import java.util.Scanner;
import mx.itson.carrito.entidades.Carro;
import mx.itson.carrito.enums.TipoMotor;
import mx.itson.carrito.entidades.Propietario;
import mx.itson.carrito.entidades.Seguro;

/**
 *
 * @author alumnog
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        /*System.out.print("Ingrese la distancia que recorrio: ");
        float distancia = scanner.nextFloat();
        
        System.out.print("Ingrese a que velocidad esta viajando: ");
        int velocidad = scanner.nextInt();*/
        
        //Creamos un nuevo instancia de la clase carro
        Carro enclave = new Carro();
        enclave.setMarca("Buick");
        enclave.setColor("negro");
        enclave.setYear(2008);
        enclave.setKilometraje(357000);
        enclave.setTipoMotor(TipoMotor.COMBUSTION);
        
        Propietario owner = new Propietario();
        System.out.println("Ingrese el nombre del propietario del carro");
        owner.setNombre(scanner.nextLine());
        System.out.println("Ingrese el direcion del propietario");
        owner.setDirecion(scanner.nextLine());
        System.out.println("Ingrese el numero de celular del propietario");
        owner.setCelular(scanner.nextLine());
        System.out.println("Ingrese el correo del propietario");
        owner.setCorreo(scanner.nextLine());
        
        enclave.setPropietario(owner);
        
        Seguro seguro = new Seguro();
        seguro.setAyudaLegal(false);
        seguro.setDeduciblePercentaje(0.15f);
        seguro.setSumaAsegurada(100000);
        seguro.setEmisor("Seguro Azteca");
        
        enclave.setSeguro(seguro);
        
        
        
        /*float tiempo = enclave.determinarTiempo(distancia, velocidad);
        System.out.println("El tiempo que tomara el " + enclave.getMarca() + " del año " + enclave.getYear() + " de color " + enclave.getColor() + ", para llegar es " + tiempo + " horas" );
        enclave.setKilometraje(enclave.getKilometraje() + distancia);*/
        System.out.println("\n####### Espesificaiones del carro #######");
        System.out.println("Color: " + enclave.getColor());
        System.out.println("Marca" + enclave.getMarca());
        System.out.println("Año: " + enclave.getYear());
        System.out.println("Kilometraje: " + enclave.getKilometraje());
        System.out.println("Tipo de motor es: " + enclave.getTipoMotor());
        System.out.println("Propietario: " + enclave.getPropietario().getNombre());
        System.out.println("Direcion de propietario: " + enclave.getPropietario().getDirecion());
        System.out.println("Correo del propietario: " + enclave.getPropietario().getCorreo());
        System.out.println("Celular de propietario: " + enclave.getPropietario().getCelular());
        System.out.println("Seguro: " + enclave.getSeguro().getEmisor());
        System.out.println("Monto asegurado: " + enclave.getSeguro().getSumaAsegurada());
        System.out.println("Porcentaje deducible: " + enclave.getSeguro().getDeduciblePercentaje());
        System.out.println("Ayuda legal: " + enclave.getSeguro().isAyudaLegal());
    }
}
