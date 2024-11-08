/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exa_2_24550259;

import java.util.Scanner;

/**
 *
 * @author calza
 */
public class Exa_2_24550259 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int usuarioGanados = 0;
        int computadoraGanados = 0;
        int empates = 0;
        boolean continuar = true;

        System.out.println("Bienvenido al juego de Piedra, Papel o Tijera!");
        
        while (continuar) {
            System.out.println("Elige una opción: 1 para Piedra, 2 para Papel, 3 para Tijera (o cualquier otro número para salir): ");
            int eleccionUsuario = scanner.nextInt();

            if (eleccionUsuario < 1 || eleccionUsuario > 3) {
                continuar = false;
                break;
            }

            int eleccionComputadora = (int)(Math.random() * 3) + 1;
            System.out.println("La computadora eligió: " + obtenerEleccion(eleccionComputadora));

            if (eleccionUsuario == eleccionComputadora) {
                System.out.println("Es un empate!");
                empates++;
            } else if ((eleccionUsuario == 1 && eleccionComputadora == 3) ||
                       (eleccionUsuario == 2 && eleccionComputadora == 1) ||
                       (eleccionUsuario == 3 && eleccionComputadora == 2)) {
                System.out.println("¡Ganaste esta ronda!");
                usuarioGanados++;
            } else {
                System.out.println("La computadora ganó esta ronda.");
                computadoraGanados++;
            }

            System.out.println("Puntuación:");
            System.out.println("Ganados por la computadora = " + computadoraGanados);
            System.out.println("Ganados por el usuario = " + usuarioGanados);
            System.out.println("Empates = " + empates);
            System.out.println();
        }

        System.out.println("Juego terminado.");
        if (usuarioGanados > computadoraGanados) {
            System.out.println("¡Felicidades, ganaste más juegos que la computadora!");
        } else if (computadoraGanados > usuarioGanados) {
            System.out.println("La computadora ganó más juegos.");
        } else {
            System.out.println("Hubo un empate en el número de juegos ganados.");
        }
    }

    private static String obtenerEleccion(int eleccion) {
        switch (eleccion) {
            case 1:
                return "Piedra";
            case 2:
                return "Papel";
            case 3:
                return "Tijera";
            default:
                return "";
        }
        
    }
    
}   
