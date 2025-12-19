/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete7;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author A S U S A16
 */
public class Problema07 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double[][] matrizX = new double[3][3];
        double[][] matrizA = new double[3][3];
        double[][] matrizB = new double[3][3];
        boolean cumplimientoMatriz = true;

        for (int fila = 0; fila < matrizX.length; fila++) {
            for (int columna = 0; columna < matrizX[fila].length; columna++) {
                System.out.printf("Ingrese valor para [%d][%d]: ", fila, columna);
                matrizX[fila][columna] = entrada.nextDouble();
            }
        }

        for (int fila = 0; fila < matrizX.length; fila++) {
            for (int columna = 0; columna < matrizX[fila].length; columna++) {
                double x = matrizX[fila][columna];
                matrizA[fila][columna] = Math.pow(x + 1, 2);
            }
        }

        for (int fila = 0; fila < matrizX.length; fila++) {
            for (int columna = 0; columna < matrizX[fila].length; columna++) {
                double x = matrizX[fila][columna];
                matrizB[fila][columna] = (x * x) + (2 * x) + 1;
            }
        }

        for (int fila = 0; fila < matrizX.length; fila++) {
            for (int columna = 0; columna < matrizX[fila].length; columna++) {
                if (matrizA[fila][columna] != matrizB[fila][columna]) {
                    cumplimientoMatriz = false;
                    break;
                }
            }
        }

        System.out.println("\n--- Resultado del Análisis ---");
        if (cumplimientoMatriz) {
            System.out.println("La identidad algebraica se cumple todos los "
                    + "valores coinciden");
        } else {
            System.out.println("La identidad algebraica no se cumple los valores"
                    + "no coinciden");
        }
    }
}
