/**
 * Write a description of class Eficiencia_Combustible here.
 * 
 * @author Dennis Urrea  
 * @version 04082019
 */

import java.util.Scanner;

public class Ejercicio_2
{
    public static void main (String[] argv)
    {
        // Se definen variables
       float millasUSA; 
       double conversion;
       double resultado;
                
        // 1 milla = 1.6093 km
        // 1 Galon =  3.7854 litros
        //
        // Se divide la milla sobre galón para averiguar el factor de conversión
        // Resultado = 0,4251
        //
        // 1 Milla   = 0,425  Lts X Kilometro
       
         
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese las millas por galón que desea convertir:");
        millasUSA=entrada.nextInt();
        
        conversion = 0.425 ;        
        resultado = millasUSA * conversion;
                
       
        System.out.printf ("La conversión es: " +resultado + " Litros por Kilometros");


    }
}