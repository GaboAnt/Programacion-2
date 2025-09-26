/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author gabi0
 */
public class Ejercicio11 {
    public static void main(String[] args) {
         Artista artista1 = new Artista("Yandel", "Reagueton");
        Cancion cancion1 = new Cancion("Encantadora", artista1);
        
        Reproductor reproductor = new Reproductor();
        reproductor.reproducir(cancion1);
    }
}

class Artista {
    private String nombre;
    private String genero;
    
    public Artista(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }
    
    public String getNombre() { return nombre; }
    public String getGenero() { return genero; }
    
    @Override
    public String toString() {
        return "Artista{nombre='" + nombre + "', genero='" + genero + "'}";
    }
}

class Cancion {
    private String titulo;
    private Artista artista; 
    
    public Cancion(String titulo, Artista artista) {
        this.titulo = titulo;
        this.artista = artista;
    }
    
    public String getTitulo() { return titulo; }
    public Artista getArtista() { return artista; }
    
    @Override
    public String toString() {
        return "Cancion{titulo='" + titulo + "', artista=" + artista + "}";
    }
}

class Reproductor {
    public void reproducir(Cancion cancion) {
        System.out.println("Reproduciendo: " + cancion.getTitulo() + " - " + cancion.getArtista().getNombre());
        System.out.println("Genero: " + cancion.getArtista().getGenero());
    }
}
