/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author gabi0
 */
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double porcentaje = 0;
        
        System.out.println("Ingrese el precio del producto: ");
        double precio = input.nextInt();
        input.nextLine();
        System.out.println("Ingrese el tipo de categoria");
        String categoria = input.nextLine();
        
        switch (categoria) {
            case "A":
                porcentaje = 0.10;
                break;
            case "B":
                porcentaje = 0.15;
                break;
            case "C":
                porcentaje = 0.20;
                break;
        }
        
        double descuento = precio * porcentaje;
        double precioFinal = precio - descuento;
        
        System.out.println("Precio original: " + precio);
        System.out.println("Descuento aplicado: " + (porcentaje*100) + "%");
        System.out.println("El precio final es: " + precioFinal);
        
        
    }
    
}
