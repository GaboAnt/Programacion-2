/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author gabi0
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        Contribuyente contrib1 = new Contribuyente("Empresa ABC", "12-34567890-1");
        Impuesto impuesto1 = new Impuesto(15000.0, contrib1);
        
        Calculadora calc = new Calculadora();
        calc.calcular(impuesto1); 
    }
}

class Contribuyente {
    private String nombre;
    private String cuil;
    
    public Contribuyente(String nombre, String cuil) {
        this.nombre = nombre;
        this.cuil = cuil;
    }
    
    public String getNombre() { return nombre; }
    public String getCuil() { return cuil; }
    
    @Override
    public String toString() {
        return "Contribuyente{nombre='" + nombre + "', cuil='" + cuil + "'}";
    }
}

class Impuesto {
    private double monto;
    private Contribuyente contribuyente;
    
    public Impuesto(double monto, Contribuyente contribuyente) {
        this.monto = monto;
        this.contribuyente = contribuyente;
    }
    
    public double getMonto() { return monto; }
    public Contribuyente getContribuyente() { return contribuyente; }
    
    @Override
    public String toString() {
        return "Impuesto{monto=" + monto + ", contribuyente=" + contribuyente + "}";
    }
}

class Calculadora {
    public void calcular(Impuesto impuesto) {
        double interes = impuesto.getMonto() * 0.05;
        double total = impuesto.getMonto() + interes;
        
        System.out.println("Calculando impuesto para: " + impuesto.getContribuyente().getNombre());
        System.out.println("Monto base: $" + impuesto.getMonto());
        System.out.println("Interes (5%): $" + interes);
        System.out.println("Total a pagar: $" + total);
    }
}