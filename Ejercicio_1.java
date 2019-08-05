/**
 * Write a description of class Calculadora here.
 * 
 * @author Dennis urrea Chingual 
 * @version 03082019
 */

import java.util.Scanner;

public class Ejercicio_1
{
    public static void main(String[] args) {
  
 //Creamos el objeto de la Clase Scanner para ingresar texto.
 Scanner input=new Scanner(System.in);
 //Mostramos un menu al usuario:
 System.out.println("Escoga una opcion:");
 System.out.println("a- Si desea sumar 2 números.");
 System.out.println("b- Si desea restar 2 números.");
 System.out.println("c- Si desea multiplicar 2 números.");
 System.out.println("d- Si desea dividir 2 números.");
 System.out.println("e- Si desea conocer el residuo 2 números.");
 System.out.print("Respuesta: ");
 //capturamos en una variable la opcion que escogio el usuario
 String op=input.nextLine();
 //creamos el vector para guardar los numeros
 //sera de 2 posiciones.
 float[] nums=new float[2];
 //creamos una variable para guardar el resultado de
 //de las operaciones
 float result=0;
 /*creamos una variable booleana para comprobar que las
 operaciones a realizar van bien, si llega a ser falsa
 es porque no se puede dividir entre cero y
 le mandaremos una notificacion al usuario.
 */
 boolean error=true;
 //creamos el switch para evaluar la operacion
 //que el usuario escogio
 switch(op){
 case "a":
 op="Suma";
 //creamos un for para capturar los 2 numeros a operar
 System.out.println("");
 for (int i = 0; i < 2; i++) {
 System.out.print("Numero "+(i+1)+": ");
 nums[i]=input.nextFloat();
 }
 //Realizamos la operacion
 result=nums[0] + nums[1];
 //Y a la variable booleana de error le damos el valor false
 error=false;
 break;
 case "b":
 op="Resta";
 System.out.println("");
 for (int i = 0; i < 2; i++) {
 System.out.print("Numero "+(i+1)+": ");
 nums[i]=input.nextFloat();
 }
 result=(nums[1]) - (nums[0]);
 error=false;
 break;
 case "c":
 op="Multiplicacion";
 System.out.println("");
 for (int i = 0; i < 2; i++) {
 System.out.print("Numero "+(i+1)+": ");
 nums[i]=input.nextFloat();
 }
 result=(nums[0]) * (nums[1]);
 error=false;
 break;
 case "d":
 op="Division";
 System.out.println("");
 for (int i = 0; i < 2; i++) {
 System.out.print("Numero "+(i+1)+": ");
 nums[i]=input.nextFloat();
 }
 //Para poder dividir evaluamos primero que el segundo numero
 //no sea cero, caso contrario la variable error sera true
 if(nums[1]!=0){
 result=(nums[0])/(nums[1]);
 error=false;
 }else{
 error=true;
 }
 break;
 case "e":
 op="Residuo";
 System.out.println("");
 for (int i = 0; i < 2; i++) {
 System.out.print("Numero "+(i+1)+": ");
 nums[i]=input.nextFloat();
 }
 result=(nums[0]) % (nums[1]);
 error=false;
 break;
 //Si el usuario digita una opcion diferente a la del menu
 default:
 error=true;
 break;
 }
 System.out.println("");
 /*
 - Si la variable "error" es false entonces mostramos los resultados
 - Si la variable "error" es true entonces imprimimos un error
 */
 if(error==false){
 System.out.println("Resultado de "+op+": "+result);
 }else if(error==true){
 System.out.println("ERROR: No se puede realizar la operacion.");
 }
}
}
