/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabi0
 */

import java.util.Scanner;
public class Ejercicio5 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        
        System.out.println("Ingrese dos numeros enteros");
        System.out.println("Numero 1");
        num1 = Integer.parseInt(input.nextLine());
        System.out.println("Numero 2");
        num2 = Integer.parseInt(input.nextLine());
        
        System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
        System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
        System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
        System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
    } 
}
