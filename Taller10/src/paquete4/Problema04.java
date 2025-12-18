/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int filas = 3, columnas = 2;
        int[][] matriz1 = new int[filas][columnas];
        int[][] matriz2 = new int[filas][columnas];
        boolean mayorIgual = true;
        boolean mayor = false;

        System.out.printf("Ingrese los valores para las matrices A y B (%dx%d):"
                + "\n", filas, columnas);

        for (int indice = 0; indice < filas; indice++) {
            for (int subIndice = 0; subIndice < columnas; subIndice++) {
                System.out.printf("A[%d][%d]: ", indice, subIndice);
                matriz1[indice][subIndice] = entrada.nextInt();
                System.out.printf("B[%d][%d]: ", indice, subIndice);
                matriz2[indice][subIndice] = entrada.nextInt();
            }
        }
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                System.out.printf("\nMATRIZ A:\n%d\t", matriz1[f][c]);
            }
        }

        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                System.out.printf("\nMATRIZ B:\n%d\t", matriz2[f][c]);
            }
        }
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                if (matriz1[f][c] < matriz2[f][c]) {
                    mayorIgual = false;
                } else if (matriz1[f][c] > matriz2[f][c]) {
                    mayor = true;
                }
            }
        }
        if (mayorIgual && mayor) {
            System.out.println("\n\nLa matriz A es mayor que la matriz B\n");
        } else {
            System.out.println("\n\nLa matriz A no es mayor que la matriz B\n");
        }
    }
}
