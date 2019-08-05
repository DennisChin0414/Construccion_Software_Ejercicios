
/**
 * Write a description of class Tronco_Cono here.
 * 
 * @author Dennis Urrea Chingual 
 * @version 01082019
 */

import java.util.Scanner;
import java.lang.Math;


public class Ejercicio_10
{
    public static void main (String [] args)
    {
         
         // Asociar teclado al programa
        Scanner teclado = new Scanner(System.in);
        
        // declarar variables
        double radio, altura, volumen;
                            
        // Solicitar datos de entrada
        System.out.println("Ingrese el valor del Radio: ");
         radio= teclado.nextDouble();
                          
        System.out.println("Ingrese el valor de la Altura: ");
        altura = teclado.nextDouble();
        
        volumen = Math.PI * Math.pow(radio,2) * altura;
        
        // Mostrar Los Datos de Salida En Pantalla
        System.out.println("El Volumen del Tronco Es: " + volumen); 
        
    }
    
}