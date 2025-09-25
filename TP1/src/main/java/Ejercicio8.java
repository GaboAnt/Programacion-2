/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabi0
 */
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Con int
        System.out.println("Ingrese el primer numero entero: ");
        int num1 = input.nextInt();
        System.out.println("Ingrese el segundo numero entero: ");
        int num2 = input.nextInt();
        
        int resultado = num1 / num2;
        System.out.println("Resultado de la division: " + resultado);
        
        // Con double
        System.out.println("Ingrese el primer numero entero: ");
        double numero1 = input.nextInt();
        System.out.println("Ingrese el segundo numero entero: ");
        double numero2 = input.nextInt();
        
        double resultado2 = numero1 / numero2;
        System.out.println("Resultado de la division: " + resultado2);
    }
}
