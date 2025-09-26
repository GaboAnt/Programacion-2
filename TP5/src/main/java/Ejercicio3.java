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
        Autor autor1 = new Autor("Edward Richtofen", "Aleman");
        Editorial editorial1 = new Editorial("Los Primis", "Buenos Aires, Argentina");
        
        Libro libro1 = new Libro("Shadows Of Evil", "115");
        libro1.setAutor(autor1); 
        libro1.setEditorial(editorial1);
        
        System.out.println("Libro: " + libro1);
    }
    
}

class Autor {
    private String nombre;
    private String nacionalidad;
    
    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
    

    public String getNombre() { return nombre; }
    public String getNacionalidad() { return nacionalidad; }
    
    @Override
    public String toString() {
        return "Autor{nombre='" + nombre + "', nacionalidad='" + nacionalidad + "'}";
    }
}

class Editorial {
    private String nombre;
    private String direccion;
    
    public Editorial(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    

    public String getNombre() { return nombre; }
    public String getDireccion() { return direccion; }
    
    @Override
    public String toString() {
        return "Editorial{nombre='" + nombre + "', direccion='" + direccion + "'}";
    }
}

class Libro {
    private String titulo;
    private String isbn;
    private Autor autor; 
    private Editorial editorial; 
    
    public Libro(String titulo, String isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
    }
    
    public void setAutor(Autor autor) {
        this.autor = autor; 
    }
    
    public void setEditorial(Editorial editorial) {
        this.editorial = editorial; 
    }
    
    public String getTitulo() { return titulo; }
    public String getIsbn() { return isbn; }
    public Autor getAutor() { return autor; }
    public Editorial getEditorial() { return editorial; }
    
    @Override
    public String toString() {
        return "Libro{titulo='" + titulo + "', isbn='" + isbn + "', autor=" + autor + ", editorial=" + editorial + "}";
    }
}
