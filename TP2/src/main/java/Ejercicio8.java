/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author gabi0
 */
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.print("Ingrese el precio base del producto: ");
        double precioBase = input.nextDouble();

        System.out.print("Ingrese el impuesto en porcentaje (ej. 10 para 10%): ");
        double impuestoPorc = input.nextDouble();

        System.out.print("Ingrese el descuento en porcentaje (ej. 5 para 5%): ");
        double descuentoPorc = input.nextDouble();

        double impuesto = impuestoPorc / 100;
        double descuento = descuentoPorc / 100;

        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);

        System.out.println("El precio final del producto es: " + precioFinal);
    }
    
     public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double precioFinal = precioBase + (precioBase * impuesto) - (precioBase * descuento);
        return precioFinal;
    }
    
}
