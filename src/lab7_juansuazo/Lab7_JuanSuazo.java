/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab7_juansuazo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author juanp
 */
public class Lab7_JuanSuazo {

   static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("1. iniciar el pacman");
            System.out.println("2. Volver an jugar ");
            System.out.println("3. Ingrese una opcion");
            System.out.println("Salir");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    char [][] tablero = new char [10][15];
                    Random random = new Random();
                    for (int i = 0; i < tablero.length; i++) {
                        for (int j = 0; j < tablero[i].length; j++) {
                            tablero[i][j]='*';
                            
                        }
                        
                    }
                    int filas;
                    int columnas;
                    do {
                        filas = random.nextInt(5, 10);
                        columnas = random.nextInt(5, 15);
                    } while (filas== 0 && columnas == 0);
                    tablero[filas][columnas] =  'B';
                    
                    for (int i = 0; i < tablero.length; i++) {
                        for (int j = 0; j < tablero[i].length; j++) {
                            System.out.print(tablero[i][j]+" ");
                            
                        }
                        System.out.println();
                        
                    }
                    break;
                    
                case 2:
                    
                    break;
            }
        } while (opcion!=3);
    }
    
}
