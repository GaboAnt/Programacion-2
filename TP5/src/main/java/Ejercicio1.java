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
        Pasaporte pasaporte1 = new Pasaporte("123456789", "26/9/2025", "foto_pasaporte.jpg", "JPEG");
        Titular titular1 = new Titular("Gabriel Antuña", "47248327");
        pasaporte1.setTitular(titular1); 
        
        System.out.println("Pasaporte: " + pasaporte1);
        System.out.println("Titular desde pasaporte: " + pasaporte1.getTitular());
        System.out.println("Pasaporte desde titular: " + titular1.getPasaporte());
    }
    
}
class Foto {
    private String imagen;
    private String formato;
    
    public Foto(String imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }
    
    public String getImagen() { return imagen; }
    public String getFormato() { return formato; }
    
    @Override
    public String toString() {
        return "Foto{imagen='" + imagen + "', formato='" + formato + "'}";
    }
}

class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte;
    
    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
    public Pasaporte getPasaporte() { return pasaporte; }
    
    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
    }
    
    @Override
    public String toString() {
        return "Titular{nombre='" + nombre + "', dni='" + dni + "'}";
    }
}

class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto;
    private Titular titular;
    
    public Pasaporte(String numero, String fechaEmision, String imagenFoto, String formatoFoto) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagenFoto, formatoFoto);
    }
    
    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular.getPasaporte() != this) {
            titular.setPasaporte(this);
        }
    }
    

    public String getNumero() { return numero; }
    public String getFechaEmision() { return fechaEmision; }
    public Foto getFoto() { return foto; }
    public Titular getTitular() { return titular; }
    
    @Override
    public String toString() {
        return "Pasaporte{numero='" + numero + "', fechaEmision='" + fechaEmision + "', foto=" + foto + ", titular=" + (titular != null ? titular.getNombre() : "Sin titular") + "}";
    }
}