/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Problema02 {

    public static void main(String[] args) {
        // TODO code application logic here

        int[][] edades = {
            {5, 12, 35, 40},
            {8, 15, 33, 38},
            {6, 10, 30, 36}};

        int totalMenoresGeneral = 0;
        int[] adultosPorFamilia = new int[edades.length];
        String mensaje = "";

        for (int i = 0; i < edades.length; i++) {
            int contadorAdultos = 0;

            for (int j = 0; j < edades[i].length; j++) {
                if (edades[i][j] < 18) {
                    totalMenoresGeneral = totalMenoresGeneral + 1;
                } else {
                    contadorAdultos = contadorAdultos + 1;
                }
            }

            adultosPorFamilia[i] = contadorAdultos;

            mensaje = mensaje + String.format("Familia %d: %d Adultos Registrados"
                    + ".%n", i + 1, adultosPorFamilia[i]);
        }

        mensaje = mensaje + String.format("Total de Menores en Todas las "
                + "Familias: %d", totalMenoresGeneral);

        System.out.println("\tREPORTE FINAL DE FAMILIAS");
        System.out.println(mensaje);
    }
}
