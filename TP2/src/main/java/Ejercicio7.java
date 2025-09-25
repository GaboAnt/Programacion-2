/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nota = 0;
        boolean notaValida = false;
        
        do {
            System.out.println("Ingrese una nota (0-10): ");
            nota = input.nextInt();
            if (nota >= 0 && nota <= 10) {
                notaValida = true;
                System.out.println("Nota guardada correctamente");
            } else {
                System.out.println("Error: Nota invalida. Ingrese una nota entre 0 y 10");
            }
        } while (notaValida == false);
    }
    
}
