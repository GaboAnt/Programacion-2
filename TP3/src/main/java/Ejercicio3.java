/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author gabi0
 */

public class Ejercicio3 {
    public static void main(String[] args) {
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", 1605);
        libro1.mostrarInfo();
        libro1.setAñoPublicacion(2030); 
        libro1.setAñoPublicacion(2020); 
        libro1.mostrarInfo();
    }
    
}

class Libro{
    private String titulo;
    private String autor;
    private int añoPublicacion;
    
    public Libro(String titulo, String autor, int añoPublicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public int getAñoPublicacion(){
        return añoPublicacion;
    }
    
    public void setAñoPublicacion(int año) {
        if (año > 0 && año <= 2025) {
            this.añoPublicacion = año;
            System.out.println("Año de publicacion actualizado a: " + año);
        } else {
            System.out.println("Error: Año invalido. Debe estar entre 1 y 2024.");
        }
    }
    
    public void mostrarInfo(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de Publicacion: " + añoPublicacion);
    }
}