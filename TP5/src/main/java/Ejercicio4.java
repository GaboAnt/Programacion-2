/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author gabi0
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Banco banco1 = new Banco("Banco Nacion", "12-34567890-1");
        
        // Crear tarjeta y cliente
        TarjetaDeCredito tarjeta1 = new TarjetaDeCredito("1234-5678-9012-3456", "26/2030");
        Cliente cliente1 = new Cliente("Gabriel Antuña", "47248327");
        
        tarjeta1.setBanco(banco1);
        tarjeta1.setCliente(cliente1);
        
        System.out.println("Tarjeta: " + tarjeta1);
        System.out.println("Cliente desde tarjeta: " + tarjeta1.getCliente());
        System.out.println("Tarjeta desde cliente: " + cliente1.getTarjeta());
    }
    
}

class Cliente {
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjeta; 
    
    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
    public TarjetaDeCredito getTarjeta() { return tarjeta; }
    
    public void setTarjeta(TarjetaDeCredito tarjeta) {
        this.tarjeta = tarjeta;
    }
    
    @Override
    public String toString() {
        return "Cliente{nombre='" + nombre + "', dni='" + dni + "'}";
    }
}

class Banco {
    private String nombre;
    private String cuit;
    
    public Banco(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }
    
    // Getters
    public String getNombre() { return nombre; }
    public String getCuit() { return cuit; }
    
    @Override
    public String toString() {
        return "Banco{nombre='" + nombre + "', cuit='" + cuit + "'}";
    }
}

class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente;
    private Banco banco; 
    
    public TarjetaDeCredito(String numero, String fechaVencimiento) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if (cliente.getTarjeta() != this) {
            cliente.setTarjeta(this); 
        }
    }
    
    public void setBanco(Banco banco) {
        this.banco = banco; 
    }
    
    public String getNumero() { return numero; }
    public String getFechaVencimiento() { return fechaVencimiento; }
    public Cliente getCliente() { return cliente; }
    public Banco getBanco() { return banco; }
    
    @Override
    public String toString() {
        return "TarjetaDeCredito{numero='" + numero + "', fechaVencimiento='" + fechaVencimiento + 
               "', cliente=" + (cliente != null ? cliente.getNombre() : "Sin cliente") + ", banco=" + banco + "}";
    }
}

