/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

/**
 *
 * @author reroes
 */
public class Problema05 {

    public static void main(String[] args) {

        String[][] estudiantes = {
            {"Sarah Ward", "Philip Payne"},
            {"Carrie Burton", "Lauren Rice"},
            {"Emma Escobar", "Lori Flores"},
            {"Steven West", "Toni Martin"}};
        
        String mensaje = "";

        for (int fila = 0; fila < estudiantes.length; fila++) {
            for (int columna = 0; columna < estudiantes[fila].length; columna++) {
                String nombreCompleto = estudiantes[fila][columna];
                String inicial = nombreCompleto.substring(0, 1);
                switch (inicial) {
                    case "S":
                    case "P":
                    case "T":
                        mensaje = mensaje + String.format("- %s\n", nombreCompleto);
                        break;
                    default:
                        break;

                }
            }
        }
        System.out.printf(mensaje);
    }
}
