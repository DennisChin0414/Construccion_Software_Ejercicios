
/**
 * Write a description of class Viaje_Sasaima here.
 * 
 * @author Dennis Urrea 
 * @version 04082019
 */

import java.util.Scanner;

public class Ejercicio_7
{
    public static void main (String [] args)
    {
         // Asociar teclado al programa
        Scanner teclado = new Scanner(System.in);
        
        // Declarar variables
        double galones_por_kilometros;
        double n_kilos;
        double n_viajes;
        int distancia_bogota_sasaima;
        double kilos_camion;
        double cost_gasolina;
             
        // Solicitar datos de entrada
           System.out.println("N° de kilos que el camión puede cargar: ");
            kilos_camion= teclado.nextDouble();
            
             System.out.println("Cantidad de kilos a llevar: ");
             n_kilos= teclado.nextDouble();
         
               System.out.println("Ingrese la distancia en KM entre Bogotá y Sasaima: ");
               distancia_bogota_sasaima = teclado.nextInt();
               
         //número de viajes a realizar
           if (n_kilos >= kilos_camion)
           {
           n_viajes = n_kilos / kilos_camion;
           }
              else
              { 
                  n_viajes=1;
                }
         //número de galones a usar
         galones_por_kilometros = n_viajes * distancia_bogota_sasaima * 2;
         cost_gasolina = galones_por_kilometros * 10.000;
         
         System.out.println(" Los galones gastados en el trayecto son:" + galones_por_kilometros); 
         System.out.println(" El número de viajes son:" + n_viajes);
         System.out.println(" El costo total de gasolina es:" + cost_gasolina);
               }
    }