package com.utn.universidad;

public class Curso {
    private String codigo;
    private String nombre; // <--- El atributo que necesitamos acceder
    private Profesor profesor; 

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }
    
    // Getters y otros métodos...
    public String getCodigo() { return codigo; }
    

    public String getNombre() { 
        return nombre; // 
    }

    
    public Profesor getProfesor() { return profesor; }

    // Método clave para la bidireccionalidad: asigna/cambia el profesor sincronizando ambos lados.
    public void setProfesor(Profesor nuevoProfesor) {
        // ... (Tu lógica de sincronización bidireccional) ...
    }
    
    // Método para ser llamado internamente por Profesor
    public void setProfesorInterno(Profesor p) {
        this.profesor = p;
    }

    public void mostrarInfo() { 
        String nombreProfesor = (profesor != null) ? profesor.getNombre() : "Sin asignar";
        System.out.printf("Curso: %s (%s) | Profesor: %s\n", codigo, nombre, nombreProfesor);
    }
}