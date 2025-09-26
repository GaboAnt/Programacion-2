/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author gabi0
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        ProyectoVideo proyecto1 = new ProyectoVideo("Book de XV", 120);
        EditorVideo editor = new EditorVideo();
        
        editor.exportar("MP4", proyecto1);
    }
    
}

class ProyectoVideo {
    private String nombre;
    private int duracionMin;
    
    public ProyectoVideo(String nombre, int duracionMin) {
        this.nombre = nombre;
        this.duracionMin = duracionMin;
    }
    
    // Getters
    public String getNombre() { return nombre; }
    public int getDuracionMin() { return duracionMin; }
    
    @Override
    public String toString() {
        return "Proyecto{nombre='" + nombre + "', duracionMin=" + duracionMin + "}";
    }
}

class Render {
    private String formato;
    private ProyectoVideo proyecto;
    
    public Render(String formato, ProyectoVideo proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }
    
    public String getFormato() { return formato; }
    public ProyectoVideo getProyecto() { return proyecto; }
    
    @Override
    public String toString() {
        return "Render{formato='" + formato + "', proyecto=" + proyecto + "}";
    }
}

class EditorVideo {
    public Render exportar(String formato, ProyectoVideo proyecto) {
        System.out.println("Iniciando exportacion de video...");
        System.out.println("Proyecto: " + proyecto.getNombre());
        System.out.println("Formato: " + formato);
        System.out.println("Duracion: " + proyecto.getDuracionMin() + " minutos");
        
        Render render = new Render(formato, proyecto);
        
        System.out.println("Render completado: " + render);
        System.out.println("Archivo guardado como: " + proyecto.getNombre() + "." + formato.toLowerCase());
        
        return render;
    }
}
