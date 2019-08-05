
/**
 * Write a description of class Circulo here.
 * 
 * @author Dennis Urrea Chingual 
 * @version 03082019
 */

import java.util.Scanner;

public class Ejercicio_4
{
    public static void main(String[] args) {
        double r, area;
        Scanner num = new Scanner(System.in);
        try {
            System.out.print("Introduce el valor del radio del Círculo: ");
            r = num.nextDouble();
            area = Math.PI*(r*r);
            System.out.println("El área del Círculo es: " + area);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }        
    }
}