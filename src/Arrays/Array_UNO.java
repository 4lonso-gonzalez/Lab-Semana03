/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Random;
/**
 *
 * @author alons
 */
public class Array_UNO {
    //Genere un array llamado “uno” con 10 números aleatorios en el rango [1-20]
    public int[] ArrayUNO(){
        int[] uno = new int[10];
        System.out.println("Array UNO creado");
        Random random = new Random();
        for (int i = 0; i < uno.length; i++) {
            uno[i] = random.nextInt(20) + 1;
        }
        return uno;
    }
}

