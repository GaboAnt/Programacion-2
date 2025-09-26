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
        Computadora pc1 = new Computadora("Dell", "123456789", "ASUS Prime B450", "AMD 3400g");

        Propietario propietario1 = new Propietario("Gabriel Antuña", "47248327");
        pc1.setPropietario(propietario1);
        
        System.out.println("Computadora: " + pc1);
        System.out.println("Propietario desde computadora: " + pc1.getPropietario());
        System.out.println("Computadora desde propietario: " + propietario1.getComputadora());
    }
}

class PlacaMadre {
    private String modelo;
    private String chipset;
    
    public PlacaMadre(String modelo, String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
    }
    
    // Getters
    public String getModelo() { return modelo; }
    public String getChipset() { return chipset; }
    
    @Override
    public String toString() {
        return "PlacaMadre{modelo='" + modelo + "', chipset='" + chipset + "'}";
    }
}

class Propietario {
    private String nombre;
    private String dni;
    private Computadora computadora; 
    
    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
    public Computadora getComputadora() { return computadora; }
    
    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }
    
    @Override
    public String toString() {
        return "Propietario{nombre='" + nombre + "', dni='" + dni + "'}";
    }
}

class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre; 
    private Propietario propietario; 
    
    public Computadora(String marca, String numeroSerie, String modeloPlaca, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modeloPlaca, chipset); 
    }
    
    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if (propietario.getComputadora() != this) {
            propietario.setComputadora(this); 
        }
    }

    public String getMarca() { return marca; }
    public String getNumeroSerie() { return numeroSerie; }
    public PlacaMadre getPlacaMadre() { return placaMadre; }
    public Propietario getPropietario() { return propietario; }
    
    @Override
    public String toString() {
        return "Computadora{marca='" + marca + "', numeroSerie='" + numeroSerie + 
               "', placaMadre=" + placaMadre + ", propietario=" + 
               (propietario != null ? propietario.getNombre() : "Sin propietario") + "}";
    }
}

