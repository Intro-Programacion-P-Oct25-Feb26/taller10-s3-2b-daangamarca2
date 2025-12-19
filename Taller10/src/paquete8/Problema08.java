/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete8;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author A S U S A16
 */
public class Problema08 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double[][] dato1 = {{1, 2, 3}, {6, 8, 9}};
        double[][] dato2 = {{10, 1, 2}, {10, 9, 1}};
        double[][] valorReal = new double[2][3];
        String mensaje = "";

        for (int fila = 0; fila < dato1.length; fila++) {
            for (int columna = 0; columna < dato1[fila].length; columna++) {
                if (dato1[fila][columna] < dato2[fila][columna]) {
                    valorReal[fila][columna] = dato1[fila][columna];
                } else {
                    valorReal[fila][columna] = dato2[fila][columna];
                }

                mensaje = mensaje + String.format("%.0f\t",
                        valorReal[fila][columna]);
            }
            mensaje = mensaje + "\n";
        }

        System.out.println(mensaje);
    }
}
