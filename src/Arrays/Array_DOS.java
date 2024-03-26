/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Scanner;

/**
 *
 * @author alons
 */
public class Array_DOS {
    //Genere un array llamado “dos” con 10 números ingresados por el usuario, estos deben ser mayores que 5 y menores que 10
    public int[] ArrayDOS(){
        int[] dos = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 10 numeros, los cuales sean mayores que 5 pero menores que 10: ");
        for (int i = 0; i < dos.length; i++){
            int numero;
            do{
                System.out.println("Numero " + (i + 1) + ":");
                numero = scanner.nextInt();
                if (numero <= 5 || numero >= 10){
                    System.out.println("Numero no valido, intente de nuevo");
                }
            } while (numero <= 5 || numero >= 10);
            dos[i] = numero;
        }
        System.out.println("Array 2 creado");
        scanner.close();
        return dos;
    }
}
