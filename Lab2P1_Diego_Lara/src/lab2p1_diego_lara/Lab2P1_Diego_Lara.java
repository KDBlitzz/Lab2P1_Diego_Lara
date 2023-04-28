/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_diego_lara;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class Lab2P1_Diego_Lara {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int respuesta = 1;
        
        while(respuesta < 4) {
            System.out.println("1. Clasificando Numeros");
            System.out.println("2. Aproximando PI");
            System.out.println("3. MCD");
            System.out.println("Para salir del menu, presione 4.");
            int opcion = leer.nextInt();
            
            switch(opcion) {
                case 1: {
                    System.out.println("Ingrese el numero que desea evaluar: ");
                    int numero = leer.nextInt();
                    while(numero <= 0 ) {
                        System.out.println("Ingrese un numero positivo");
                        numero = leer.nextInt();
                    }
                    int contador_primo = 0;
                    int contador = 1;
                    boolean par = (numero % 2 == 0);
                    while(contador <= numero)
                    {
                        if (numero % contador == 0)
                        {
                            contador_primo++;
                        }
                        contador++;
                    }
                    if (contador_primo == 2)
                    {
                        if(par) {
                            System.out.println("El numero ingresado es primo y par");
                        } else {
                            System.out.println("El numero ingresado es impar y primo");
                        }
                    } else {
                        if(par) {
                            System.out.println("El numero ingresado es par");
                        } else {
                            System.out.println("El numero ingresado es impar");
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.println("Ingrese la presicion de calculo(limite): ");
                    double numero = leer.nextInt();
                    double contador = 1;
                    double parteA = 1;
                    double aproximado = 1;
                    
                    while(contador <= numero) {
                        double i = Math.pow(contador, 2);
                        parteA = ((4*i)/(4*i-1));
                        aproximado *= parteA;
                        contador++;
                    }
                    System.out.println("El valor aproximado de PI es: " + aproximado*2);
                    break;
                }
                case 3: {
                    System.out.println("Ingrese el primer numero entero positivo: ");
                    int numeroA = leer.nextInt();
                    System.out.println("Ingrese el segundo numero entero positivo");
                    int numeroB = leer.nextInt();
                    
                    while(numeroA <= 0) {
                        System.out.println("Numero invalido, ingrese un entero positivo");
                        numeroA = leer.nextInt();
                    }
                    while(numeroB <= 0) {
                        System.out.println("Numero invalido, ingrese un entero positivo");
                        numeroB = leer.nextInt();
                    }                   
                    while(numeroA != numeroB) {
                        if (numeroA > numeroB)
                        {
                            numeroA = numeroA - numeroB;
                        } else {
                            numeroB = numeroB - numeroA;
                        }
                    }
                    System.out.println("El MCD del numero ingresado es " + numeroA);
                    break;
                }
                    
                default :
                    if (opcion !=4) {
                    System.out.println("Error, opcion invalida");                               
                            }
                    break;
                    
            }
            
            System.out.println("Para regresar al menu, precione 1, de lo contrario precione 4.");
            respuesta = leer.nextInt();
        }
    }
    
}
