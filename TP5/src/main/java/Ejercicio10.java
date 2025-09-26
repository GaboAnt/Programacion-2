/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author gabi0
 */

public class Ejercicio10 {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("0123456789012345678901", 25000.50, "clave123", "26/9/2025");
        TitularCuenta titularCta1 = new TitularCuenta("Moni Argento", "12345678");
        cuenta1.setTitular(titularCta1);
        
        System.out.println("Cuenta Bancaria: " + cuenta1);
        System.out.println("Titular desde cuenta: " + cuenta1.getTitular());
        System.out.println("Cuenta desde titular: " + titularCta1.getCuenta());
        System.out.println();
        
    }
    
}

class TitularCuenta {
    private String nombre;
    private String dni;
    private CuentaBancaria cuenta;
    
    public TitularCuenta(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
    public CuentaBancaria getCuenta() { return cuenta; }
    
    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }
    
    @Override
    public String toString() {
        return "Titular{nombre='" + nombre + "', dni='" + dni + "'}";
    }
}

class ClaveSeguridad {
    private String codigo;
    private String ultimaModificacion;
    
    public ClaveSeguridad(String codigo, String ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }
    
    public String getCodigo() { return codigo; }
    public String getUltimaModificacion() { return ultimaModificacion; }
    
    @Override
    public String toString() {
        return "ClaveSeguridad{codigo='***', ultimaModificacion='" + ultimaModificacion + "'}";
    }
}

class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad claveSeguridad; 
    private TitularCuenta titular; 
    
    public CuentaBancaria(String cbu, double saldo, String codigoClave, String fechaClave) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = new ClaveSeguridad(codigoClave, fechaClave); 
    }
    
    public void setTitular(TitularCuenta titular) {
        this.titular = titular;
        if (titular.getCuenta() != this) {
            titular.setCuenta(this); 
        }
    }

    public String getCbu() { return cbu; }
    public double getSaldo() { return saldo; }
    public ClaveSeguridad getClaveSeguridad() { return claveSeguridad; }
    public TitularCuenta getTitular() { return titular; }
    
    @Override
    public String toString() {
        return "CuentaBancaria{cbu='" + cbu + "', saldo=" + saldo + ", claveSeguridad=" + claveSeguridad + 
               ", titular=" + (titular != null ? titular.getNombre() : "Sin titular") + "}";
    }
}