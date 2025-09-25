/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author gabi0
 */
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero: ");
        int num1 = input.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = input.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        int num3 = input.nextInt();
        
        if (num1 > num2 && num1 > num3){
            System.out.println("El mayor es: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El mayor es: " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("El mayor es: " + num3);
        }
    }
}
