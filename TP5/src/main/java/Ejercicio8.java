/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author gabi0
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Documento doc1 = new Documento("Contrato de Trabajo", "Trabajo si o no?", "1234123412341234", "26/09/2025");
        
        UsuarioDoc usuarioDoc1 = new UsuarioDoc("Ricardo Arjona", "Ricardo@empresa.com");
        doc1.asignarUsuarioFirma(usuarioDoc1);
        
        System.out.println("Documento: " + doc1);
        System.out.println();
        
    }
    
}

class UsuarioDoc {
    private String nombre;
    private String email;
    
    public UsuarioDoc(String nombre, String email) {
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

class FirmaDigital {
    private String codigoHash;
    private String fecha;
    private UsuarioDoc usuario;
    
    public FirmaDigital(String codigoHash, String fecha) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
    }
    
    public void setUsuario(UsuarioDoc usuario) {
        this.usuario = usuario; 
    }
    

    public String getCodigoHash() { return codigoHash; }
    public String getFecha() { return fecha; }
    public UsuarioDoc getUsuario() { return usuario; }
    
    @Override
    public String toString() {
        return "FirmaDigital{codigoHash='" + codigoHash + "', fecha='" + fecha + "', usuario=" + usuario + "}";
    }
}

class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital;
    
    public Documento(String titulo, String contenido, String codigoHash, String fecha) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital = new FirmaDigital(codigoHash, fecha); 
    }
    
    public void asignarUsuarioFirma(UsuarioDoc usuario) {
        if (this.firmaDigital != null) {
            this.firmaDigital.setUsuario(usuario);
        }
    }
    
    public String getTitulo() { return titulo; }
    public String getContenido() { return contenido; }
    public FirmaDigital getFirmaDigital() { return firmaDigital; }
    
    @Override
    public String toString() {
        return "Documento{titulo='" + titulo + "', contenido='" + contenido.substring(0, Math.min(50, contenido.length())) + 
               "...', firmaDigital=" + firmaDigital + "}";
    }
}
