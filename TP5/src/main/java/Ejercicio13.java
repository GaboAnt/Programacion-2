/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author gabi0
 */
public class Ejercicio13 {
    public static void main(String[] args) {
         UsuarioQR usuarioQR1 = new UsuarioQR("Leo Messi", "LeoMessi@email.com");
        GeneradorQR generador = new GeneradorQR();
        
        CodigoQR qr = generador.generar("https://www.utn.edu.ar", usuarioQR1);
        System.out.println();
    }
    
}

class UsuarioQR {
    private String nombre;
    private String email;
    
    public UsuarioQR(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }
    
    public String getNombre() { return nombre; }
    public String getEmail() { return email; }
    
    @Override
    public String toString() {
        return "Usuario{nombre='" + nombre + "', email='" + email + "'}";
    }
}

class CodigoQR {
    private String valor;
    private UsuarioQR usuario;
    
    public CodigoQR(String valor, UsuarioQR usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }
    
    public String getValor() { return valor; }
    public UsuarioQR getUsuario() { return usuario; }
    
    @Override
    public String toString() {
        return "CodigoQR{valor='" + valor + "', usuario=" + usuario + "}";
    }
}

class GeneradorQR {
    public CodigoQR generar(String valor, UsuarioQR usuario) {
        System.out.println("Generando codigo QR para: " + usuario.getNombre());
        CodigoQR codigoQR = new CodigoQR(valor, usuario); 
        System.out.println("Codigo QR generado: " + codigoQR);
        return codigoQR; 
    }
}