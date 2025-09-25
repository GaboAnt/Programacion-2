/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author gabi0
 */

public class Ejercicio4 {
    public static void main(String[] args) {
        Gallina gallina1 = new Gallina(1, 2);
        Gallina gallina2 = new Gallina(2, 1);
        
        gallina1.mostrarEstado();
        gallina1.ponerHuevo();
        gallina1.envejecer();
        gallina1.mostrarEstado();
        
        System.out.println();
        
        gallina2.mostrarEstado();
        gallina2.ponerHuevo();
        gallina2.ponerHuevo();
        gallina2.envejecer();
        gallina2.mostrarEstado();
    }
    
}

class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;
    
    public Gallina(int idGallina, int edad) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = 0;
    }
    
    public void ponerHuevo(){
        this.huevosPuestos++;
        System.out.println("La gallina " + idGallina + " puso un huevo. Total: " + huevosPuestos);    
    }
    
    public void envejecer() {
        this.edad++;
        System.out.println("La gallina " + idGallina + " envejecio. Ahora tiene " + edad + " años.");
    }
    
    public void mostrarEstado(){
        System.out.println("ID: " + idGallina);
        System.out.println("Edad: " + edad);
        System.out.println("Huevos puestos: " + huevosPuestos);
    }
}
