/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Problema03 {

    public static void main(String[] args) {
        // TODO code application logic here

        boolean[][] sensores = {
            {true, true, true, true, true, true},
            {true, false, true, false, true, false},
            {false, false, false, false, false, false},
            {true, true, false, true, true, false}};
        String mensaje = "";
        int[] funcional = new int[sensores.length];
        int[] noFuncional = new int[sensores.length];
        
        for (int fila = 0; fila < sensores.length; fila++) {
            int contadorFuncional = 0;
            int contadorNoFuncional = 0;
            for (int columna = 0; columna < sensores[fila].length; columna++) {
                if (sensores[fila][columna] == true) {
                    contadorFuncional = contadorFuncional + 1;
                } else {
                    contadorNoFuncional = contadorNoFuncional + 1;
                }
            }
            funcional[fila] = contadorFuncional;
            noFuncional[fila] = contadorNoFuncional;
        }
        int contador = 1;
        for (int i = 0; i < 4; i++) {

            if (funcional[i] == 6) {
                mensaje = mensaje + String.format("Zona %d: SIN FALLOS\n",
                        contador);
            } else {
                mensaje = mensaje + String.format("Zona %d: %d FALLOS\n",
                        contador, noFuncional[i]);
            }
            contador = contador + 1;
        }
        System.out.println("REPORTE DE LOS SENSORES\n");
        System.out.printf(mensaje);
    }
}
