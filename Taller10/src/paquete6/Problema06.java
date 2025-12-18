/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema06 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int[][] matriz = new int[5][6];
        int[][] matrizResultante = new int[5][6];
        int valor;

        System.out.print("Ingrese el valor entero: ");
        valor = entrada.nextInt();

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.printf("Ingrese valor para [%d][%d]: ", fila, columna);
                matriz[fila][columna] = entrada.nextInt();
            }
        }

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                matrizResultante[fila][columna] = matriz[fila][columna] * valor;
            }
        }
        System.out.println("\n\t--- Matriz ---");
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.printf("%4d ", matriz[fila][columna]);
            }
            System.out.println();
        }

        System.out.println("\n  --- Matriz Resultante ---");
        for (int fila = 0; fila < matrizResultante.length; fila++) {
            for (int columna = 0; columna < matrizResultante[fila].length; columna++) {
                System.out.printf("%4d ", matrizResultante[fila][columna]);
            }
            System.out.println();
        }
    }
}
