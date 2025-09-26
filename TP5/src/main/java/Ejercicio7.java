/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author gabi0
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        
        Motor motor1 = new Motor("V16", "123456789");
        
       
        Vehiculo vehiculo1 = new Vehiculo("ABC123", "Nissan Silvia S15");
        Conductor conductor1 = new Conductor("Rayo Mcqueen", "123456789");
        
       
        vehiculo1.setMotor(motor1); 
        vehiculo1.setConductor(conductor1);
        
        System.out.println("Vehiculo: " + vehiculo1);
        System.out.println("Conductor desde vehiculo: " + vehiculo1.getConductor());
        System.out.println("Vehiculo desde conductor: " + conductor1.getVehiculo());
    }
}

class Motor {
    private String tipo;
    private String numeroSerie;
    
    public Motor(String tipo, String numeroSerie) {
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }

    public String getTipo() { return tipo; }
    public String getNumeroSerie() { return numeroSerie; }
    
    @Override
    public String toString() {
        return "Motor{tipo='" + tipo + "', numeroSerie='" + numeroSerie + "'}";
    }
}

class Conductor {
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo; 
    
    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }
    
    public String getNombre() { return nombre; }
    public String getLicencia() { return licencia; }
    public Vehiculo getVehiculo() { return vehiculo; }
    
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    @Override
    public String toString() {
        return "Conductor{nombre='" + nombre + "', licencia='" + licencia + "'}";
    }
}

class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor; 
    private Conductor conductor; 
    
    public Vehiculo(String patente, String modelo) {
        this.patente = patente;
        this.modelo = modelo;
    }
    
    public void setMotor(Motor motor) {
        this.motor = motor; 
    }
    
    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        if (conductor.getVehiculo() != this) {
            conductor.setVehiculo(this);
        }
    }
    
    public String getPatente() { return patente; }
    public String getModelo() { return modelo; }
    public Motor getMotor() { return motor; }
    public Conductor getConductor() { return conductor; }
    
    @Override
    public String toString() {
        return "Vehiculo{patente='" + patente + "', modelo='" + modelo + "', motor=" + motor + ", conductor=" + (conductor != null ? conductor.getNombre() : "Sin conductor") + "}";
    }
}