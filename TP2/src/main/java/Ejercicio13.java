/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author gabi0
 */

public class Ejercicio13 {
    public static void main(String[] args) {
        double[] precios = {199.99, 299.50, 149.75, 399.00, 89.99};
        System.out.println("Precios originales:");
        imprimirArray(precios, 0);
        
        precios[2] = 129.99;
        
        System.out.println("Precios modificados:");
        imprimirArray(precios, 0);
        
    }
    
    public static void imprimirArray(double[] precios, int indice) {
        if (indice == precios.length) {
            return;
        }
        System.out.println("Precio: $" + precios[indice]);
        imprimirArray(precios, indice + 1);
    }
    
}
