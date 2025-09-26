/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author gabi0
 */

public class Ejercicio2 {
    public static void main(String[] args) {
        Bateria bateria1 = new Bateria("Energizer 3000", 3000);
        Celular celular1 = new Celular("123456789", "Samsung", "Galaxy S21");
        celular1.setBateria(bateria1);
        Usuario usuario1 = new Usuario("Gabriel Antuña", "47248327");
        celular1.setUsuario(usuario1);
        
        System.out.println("Celular: " + celular1);
        System.out.println("Usuario desde celular: " + celular1.getUsuario());
        System.out.println("Celular desde usuario: " + usuario1.getCelular());
    }
    
}

class Bateria {
    private String modelo;
    private int capacidad;
    
    public Bateria(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }
    
    public String getModelo() { return modelo; }
    public int getCapacidad() { return capacidad; }
    
    @Override
    public String toString() {
        return "Bateria{modelo='" + modelo + "', capacidad=" + capacidad + "mAh}";
    }
}

class Usuario {
    private String nombre;
    private String dni;
    private Celular celular; 
    
    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
    public Celular getCelular() { return celular; }
    
    public void setCelular(Celular celular) {
        this.celular = celular;
    }
    
    @Override
    public String toString() {
        return "Usuario{nombre='" + nombre + "', dni='" + dni + "'}";
    }
}

class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria; 
    private Usuario usuario; 
    
    public Celular(String imei, String marca, String modelo) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public void setBateria(Bateria bateria) {
        this.bateria = bateria; 
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if (usuario.getCelular() != this) {
            usuario.setCelular(this); 
        }
    }

    public String getImei() { return imei; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public Bateria getBateria() { return bateria; }
    public Usuario getUsuario() { return usuario; }
    
    @Override
    public String toString() {
        return "Celular{imei='" + imei + "', marca='" + marca + "', modelo='" + modelo + "', bateria=" + bateria + ", usuario=" + (usuario != null ? usuario.getNombre() : "Sin usuario") + "}";
    }
}