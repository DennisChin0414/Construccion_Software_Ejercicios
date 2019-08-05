
/**
 * Write a description of class Poligono here.
 * 
 * @author Dennis Urrea Chingual 
 * @version 01082019
 */

import java.util.Scanner;

public class Ejercicio_6
{
public static void main (String arg[])
{
Ejercicio_6 P = new Ejercicio_6();
P.leerCanLados();
P.leerLado();
P.leerApotema();
P.Perimetro();
P.Area();
P.Mostrar();

}
double CanLados;
double Lado;
double Apotema;
double Perimetro;
double Area;

Scanner L = new Scanner (System.in);

public void Poligono()
{
CanLados = 0;
Lado = 0;
Apotema = 0;
Perimetro = 0;
Area = 0;
}

public void leerCanLados()
{
System.out.println("Números de lados del Polígono Regular:");
CanLados = L.nextDouble();
}

public void leerLado()
{
System.out.println("Valor de los Lados:");
Lado = L.nextDouble();
}

public void leerApotema()
{
System.out.println("Escribe el valor del Apotema:");
Apotema = L.nextDouble();
}

public void Perimetro()
{
Perimetro = CanLados * Lado;
}

public void Area()
{
Area = Perimetro * Apotema / 2;
}

public void Mostrar()
{
System.out.printf("El área del polígono es:" + Area);
System.out.printf("El número de lados polígono es:" + CanLados);
System.out.printf("El valor de cada uno de los lados del polígono es:" + Lado);
System.out.printf("El perimetro del polígono es:" + Perimetro);
}

}