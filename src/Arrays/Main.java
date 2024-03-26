/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author alons
 */
public class Main {
    public int[] Producto(int[] uno, int[] dos){
        if (uno.length != dos.length){
            throw new Error("Los array UNO y DOS deben tener la misma cantidad de numeros");
        }
        int[] resultado = new int[uno.length];
        for (int i = 0; i < uno.length; i++){
            resultado[i] = uno[i] * dos[i];
        }
        return resultado;
    }
    
    public int[] Resta(int[] uno, int[] dos) {
        if (uno.length != dos.length) {
            throw new Error("Los arrays UNO y DOS deben tener la misma cantidad de numeros");
        }
        int[] resultado = new int[uno.length];
        for (int i = 0; i < uno.length; i++) {
            resultado[i] = uno[i] - dos[i];
        }
        return resultado;
    }

    
    public int[] ParImpar(int[] uno, int[] dos) {
        if (uno.length != dos.length) {
            throw new Error("Los arrays UNO y DOS deben tener la misma cantidad de numeros");
        }
        int[] resultado = new int[uno.length];
        for (int i = 0; i < uno.length; i++) {
            int suma = uno[i] + dos[i];
            resultado[i] = suma % 2 == 0 ? 1 : 0;
        }
        return resultado;
    }

    
    public static void main(String[] args){
        Array_UNO ArrayUno = new Array_UNO();
        Array_DOS ArrayDos = new Array_DOS();
        int[] uno = ArrayUno.ArrayUNO();
        int[] dos = ArrayDos.ArrayDOS();

        Main main = new Main();
        int[] producto = main.Producto(uno, dos);
        int[] resta = main.Resta(uno, dos);
        int[] parImpar = main.ParImpar(uno, dos);

        System.out.println("RESULTADOS:");
        
        System.out.println();
        System.out.println("Array UNO: ");
        for (int num : uno) {
            System.out.print(num + " ");
        }
        
        System.out.println();
        System.out.println("Array DOS: ");
        for (int num : dos) {
            System.out.print(num + " ");
        }
        
        System.out.println();
        System.out.println("Array Producto: ");
        for (int num : producto) {
            System.out.print(num + " ");
        }
       
        System.out.println(); 
        System.out.println("Array Resta: ");
        for (int num : resta) {
            System.out.print(num + " ");
        }
        
        System.out.println();
        System.out.println("Array ParImpar: ");
        for (int num : parImpar) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[][] matriz = new int[5][10];
        for (int i = 0; i < 10; i++) {
            matriz[0][i] = uno[i];
            matriz[1][i] = dos[i];
            matriz[2][i] = producto[i];
            matriz[3][i] = resta[i];
            matriz[4][i] = parImpar[i];
        }
        
        System.out.println();
        System.out.println("Matriz:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
