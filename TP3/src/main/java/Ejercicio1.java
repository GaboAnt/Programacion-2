/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author gabi0
 */


public class Ejercicio1 {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Gabriel", "Antuña", "Programacion II", 7.5);
        estudiante1.mostrarInfo();
        estudiante1.subirCalificacion(1.5);
        estudiante1.bajarCalificacion(0.5);
        estudiante1.mostrarInfo();
    }
    
}

class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;
    
    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificacion: " + calificacion);
    }
    
    public void subirCalificacion(double puntos) {
        this.calificacion += puntos;
        if (this.calificacion > 10) {
            this.calificacion = 10;
        }
        System.out.println("La calificacion subio " + puntos + " puntos. Nueva calificacion: " + this.calificacion);
    }
    
    public void bajarCalificacion(double puntos) {
        this.calificacion -= puntos;
        if (this.calificacion < 0) {
            this.calificacion = 0;
        }
        System.out.println("la calificacion bajo " + puntos + " puntos. Nueva calificacion: " + this.calificacion);
    }
}
