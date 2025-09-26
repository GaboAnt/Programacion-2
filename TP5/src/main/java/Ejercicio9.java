/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author gabi0
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("Willy Wonca", "OSDE");
        Profesional profesional1 = new Profesional("Dr. Jorge Galiano", "Cardiologia");
        
        CitaMedica cita1 = new CitaMedica("26/9/20025", "16:20");
        cita1.setPaciente(paciente1); 
        cita1.setProfesional(profesional1); 
        
        System.out.println("Cita Medica: " + cita1);
        System.out.println();
        
    }
}

class Paciente {
    private String nombre;
    private String obraSocial;
    
    public Paciente(String nombre, String obraSocial) {
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }
    

    public String getNombre() { return nombre; }
    public String getObraSocial() { return obraSocial; }
    
    @Override
    public String toString() {
        return "Paciente{nombre='" + nombre + "', obraSocial='" + obraSocial + "'}";
    }
}

class Profesional {
    private String nombre;
    private String especialidad;
    
    public Profesional(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }
    
    public String getNombre() { return nombre; }
    public String getEspecialidad() { return especialidad; }
    
    @Override
    public String toString() {
        return "Profesional{nombre='" + nombre + "', especialidad='" + especialidad + "'}";
    }
}

class CitaMedica {
    private String fecha;
    private String hora;
    private Paciente paciente; 
    private Profesional profesional; 
    
    public CitaMedica(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }
    
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }
    

    public String getFecha() { return fecha; }
    public String getHora() { return hora; }
    public Paciente getPaciente() { return paciente; }
    public Profesional getProfesional() { return profesional; }
    
    @Override
    public String toString() {
        return "CitaMedica{fecha='" + fecha + "', hora='" + hora + "', paciente=" + paciente + ", profesional=" + profesional + "}";
    }
}
