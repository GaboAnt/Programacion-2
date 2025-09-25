/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author gabi0
 */

public class Ejercicio5 {
    public static void main(String[] args) {
        NaveEspacial nave1 = new NaveEspacial("Chocolatada ", 50);
        nave1.mostrarEstado();
        
        nave1.despegar();
        nave1.avanzar(30);
        
        nave1.avanzar(30);
        
        nave1.recargarCombustible(60);
        nave1.avanzar(30);
        
        nave1.mostrarEstado();
    }
    
}

class NaveEspacial {
    private String nombre;
    private double combustible;
    private final double COMBUSTIBLE_MAXIMO = 100.0;
    private final double CONSUMO_POR_KM = 1.0;
    
    public NaveEspacial(String nombre, double combustibleInicial){
        this.nombre = nombre;
        this.combustible = Math.min(combustibleInicial, COMBUSTIBLE_MAXIMO);
    }
    
    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println(nombre + "Despego, Combustible restante: " + combustible);
        } else {
            System.out.println("Error: No hay suficiente combustible para despegar. Se necesitan al menos 10 unidades.");
        }
    }
    
    public void avanzar(double distancia) {
        double combustibleNecesario = distancia * CONSUMO_POR_KM;
        
        if (combustible >= combustibleNecesario) {
            combustible -= combustibleNecesario;
            System.out.println(nombre + " avanzo " + distancia + " km. Combustible restante: " + combustible);
        } else {
            System.out.println("Error: No hay suficiente combustible para avanzar " + distancia + " km.");
            System.out.println("Se necesitan " + combustibleNecesario + " unidades, pero solo hay " + combustible);
        }
    }
    
    public void recargarCombustible(double cantidad) {
        double nuevoNivel = combustible + cantidad;
        
        if (nuevoNivel <= COMBUSTIBLE_MAXIMO) {
            combustible = nuevoNivel;
            System.out.println("Combustible recargado. Ahora tiene: " + combustible);
        } else {
            combustible = COMBUSTIBLE_MAXIMO;
            System.out.println("Tanque lleno. Se recargo hasta el maximo: " + COMBUSTIBLE_MAXIMO);
        }
    }
    
    public void mostrarEstado(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Combustible: " + combustible + "/" + COMBUSTIBLE_MAXIMO);
    }
}


