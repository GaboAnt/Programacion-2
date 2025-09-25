/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author gabi0
 */
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean esCero = false;
        int num;
        int sumaPar = 0;
        
        while (esCero == false) {
            System.out.println("Ingrese un numero (0 para terminar): ");
            num = input.nextInt();
            
            if (num == 0) {
                esCero = true;
                break;
            }
            
            if (num % 2 == 0) {
                sumaPar = sumaPar + num;         
            }
            
        }
        System.out.println("La suma de los numeros pares es: " + sumaPar);
        
    }
    
}
