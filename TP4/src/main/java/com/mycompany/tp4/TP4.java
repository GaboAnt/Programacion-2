/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp4;

/**
 *
 * @author gabi0
 */

public class TP4 {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(1, "Alejo Fredes", "Finanzas", 100000);
        Empleado empleado2 = new Empleado("Maximo Lascano", "Marketing");
        Empleado empleado3 = new Empleado(3, "Misael Cabrera", "Recursos Humanos", 85000);
        Empleado empleado4 = new Empleado("Santino Disanzo", "Conductor");
        
        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());
        System.out.println(empleado3.toString());
        System.out.println(empleado4.toString());
        System.out.println("Numero de empleaados: " + Empleado.mostrarTotalEmpleados());
        
        empleado1.actualizarSalario(15.0);
        empleado2.actualizarSalario(20000);
        empleado3.actualizarSalario(20.0);
        empleado4.actualizarSalario(25000);
        
        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());
        System.out.println(empleado3.toString());
        System.out.println(empleado4.toString());
        System.out.println("Numero de empleaados: " + Empleado.mostrarTotalEmpleados());
        
        System.out.println("ID de " + empleado1.getNombre() + ": " + empleado1.getId());
        System.out.println("Puesto de " + empleado2.getNombre() + ": " + empleado2.getPuesto());
        System.out.println("Salario de " + empleado3.getNombre() + ": $" + empleado3.getSalario());
        
        empleado1.setPuesto("Jefe de Finanzas");
        empleado2.setSalario(-1000);
        empleado3.setId(-3);
        empleado4.setNombre("Santino Lucas Disanzo");
        
        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());
        System.out.println(empleado3.toString());
        System.out.println(empleado4.toString());
        System.out.println("Numero de empleaados: " + Empleado.mostrarTotalEmpleados());
    }
}

class Empleado{
    private int id=1;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;
    private static int siguienteId=1;
    
    public Empleado(int id, String nombre, String puesto, double salario){
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
        if (id >= siguienteId) {
            siguienteId = id + 1;
        }
    }
    
    public Empleado(String nombre, String puesto){
        this.id = siguienteId++;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 50000.0;
        totalEmpleados++;
    }
    
    public void actualizarSalario(double porcentaje) {
        double aumento = this.salario * (porcentaje/100);
        
        this.salario += aumento;
        System.out.println("El salario de " + this.nombre + " aumento un " + porcentaje + "%. Nuevo salario: " + salario);
    }
    
    public void actualizarSalario(int cantidadFija) {
        this.salario += cantidadFija;
        System.out.println("El salario de " + this.nombre + "recibio un aumento de $" + cantidadFija + " Nuevo salario: " + salario);
    }

    @Override
    public String toString() {
        return "Empleado{" + "Id= " + id + ", Nombre= " + nombre + ", Puesto= " + puesto + ", Salario= $" + salario + '}';
    }
    
    public static int mostrarTotalEmpleados(){
        return totalEmpleados;
    }
        
    public int getId(){
        return this.id;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public String getPuesto() {
        return this.puesto;
    }
    
    public double getSalario() {
        return this.salario;
    }
    
    public void setId(int id) {
         if (id > 0) {
            this.id = id;
        } else {
            System.out.println("El ID debe ser mayor a 0");
        }
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("El salario no puede ser negativo");
        }
    }
    
}