/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author gabi0
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        ClienteReserva clienteRes1 = new ClienteReserva("Pedro Sanchez", "11-2345-6789");
        Mesa mesa1 = new Mesa(5, 4);

        Reserva reserva1 = new Reserva("26/9/2025", "21:30");
        reserva1.setCliente(clienteRes1); 
        reserva1.setMesa(mesa1);
        
        System.out.println("Reserva: " + reserva1);   
    }
}

class ClienteReserva {
    private String nombre;
    private String telefono;
    
    public ClienteReserva(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() { return nombre; }
    public String getTelefono() { return telefono; }
    
    @Override
    public String toString() {
        return "Cliente{nombre='" + nombre + "', telefono='" + telefono + "'}";
    }
}

class Mesa {
    private int numero;
    private int capacidad;
    
    public Mesa(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }

    public int getNumero() { return numero; }
    public int getCapacidad() { return capacidad; }
    
    @Override
    public String toString() {
        return "Mesa{numero=" + numero + ", capacidad=" + capacidad + "}";
    }
}

class Reserva {
    private String fecha;
    private String hora;
    private ClienteReserva cliente; 
    private Mesa mesa; 
    
    public Reserva(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }
    
    public void setCliente(ClienteReserva cliente) {
        this.cliente = cliente; 
    }
    
    public void setMesa(Mesa mesa) {
        this.mesa = mesa; 
    }
    
    public String getFecha() { return fecha; }
    public String getHora() { return hora; }
    public ClienteReserva getCliente() { return cliente; }
    public Mesa getMesa() { return mesa; }
    
    @Override
    public String toString() {
        return "Reserva{fecha='" + fecha + "', hora='" + hora + "', cliente=" + cliente + ", mesa=" + mesa + "}";
    }
}