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
    static Random random = new Random();

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
                    char[][] tablero = new char[10][15];
                    char[][] tablero2 = new char[10][15];
                    int cantidades = 0;
                    int filaspac;
                    int columnaspac;
                    int[] filasfantasmita = new int[3];
                    int[] columnasfantasmita = new int[3];
                    char[] fantasmas = {'R', 'M', 'G'};
                    int puntos = 0;
                    boolean Cristiano = false;
                    boolean Ronaldo = false;
                    for (int i = 0; i < tablero.length; i++) {
                        for (int j = 0; j < tablero[i].length; j++) {
                            tablero[i][j] = '*';
                            tablero2[i][j] = '*';

                        }

                    }

                    for (int i = 0; i < 8; i++) {
                        int filasobstaculo = 0;
                        int columnasobstaculo = 0;
                        do {
                            filasobstaculo = random.nextInt(10);
                            columnasobstaculo = random.nextInt(15);
                        } while (tablero[filasobstaculo][columnasobstaculo] != '*');
                        tablero[filasobstaculo][columnasobstaculo] = 'O';

                    }
                    do {
                        filaspac = random.nextInt(10);
                        columnaspac = random.nextInt(15);
                    } while (tablero[filaspac][columnaspac] != '*');
                    tablero[filaspac][columnaspac] = 'C';
                    for (int i = 0; i < 3; i++) {
                        int filasfantasmas = 0;
                        int columnasfantasmas = 0;
                        do {
                            filasfantasmas = random.nextInt(10);
                            columnasfantasmas = random.nextInt(15);
                        } while (tablero[filasfantasmas][columnasfantasmas] != '*');
                        filasfantasmita[i] = filasfantasmas;
                        columnasfantasmita[i] = columnasfantasmas;
                        tablero[filasfantasmas][columnasfantasmas] = fantasmas[i];

                    }

                    int filasfrutas = 0;
                    int columnasfrutas = 0;
                    do {
                        filasfrutas = random.nextInt(10);
                        columnasfrutas = random.nextInt(15);

                    } while (tablero[filasfrutas][columnasfrutas] != '*');
                    tablero[filasfrutas][columnasfrutas] = 'B';
//                    System.out.println("Bienvenido a Pacman");
//                    System.out.println("Puntos|| " + puntos);
//                     for (int i = 0; i < tablero.length; i++) {
//                         for (int j = 0; j < tablero[i].length; j++) {
//                             System.out.print(tablero[i][j]+ " ");
//                             
//                             
//                         }
//                         System.out.println();
//                    }

                    char movimiento = ' ';
                    while (movimiento != 'W' || movimiento != 'S' || movimiento != 'A' || movimiento != 'D') {
                        int filanueva = filaspac;
                        int columnasnueva = columnaspac;
                        System.out.println("Bienvenido a Pacman");
                        System.out.println("Puntos || " + puntos);
                        for (int i = 0; i < tablero.length; i++) {
                            for (int j = 0; j < tablero[i].length; j++) {
                                System.out.print(tablero[i][j] + " ");
                            }
                            System.out.println();

                        }
                        System.out.println("W(ARRIBA)");
                        System.out.println("S(ABAJO)");
                        System.out.println("A(IZQUIERDA)");
                        System.out.println("D(DERECHA)");
                        movimiento = entrada.next().toLowerCase().charAt(0);
                        if (movimiento == 'w') {
                            if (filaspac > 0) {
                                filaspac--;

                            }

                        }
                        if (movimiento == 's') {
                            if (filaspac > 0) {
                                filaspac++;

                            }

                        }
                        if (movimiento == 'a') {
                            if (columnaspac > 0) {
                                columnaspac--;

                            }

                        }
                        if (movimiento == 'd') {
                            if (columnaspac > 0) {
                                columnaspac++;

                            }

                        }
                        if (movimiento == 'x') {
                            break;

                        }
                        if (filaspac < 0) {
                            filaspac = 9;

                        }
                        if (filaspac > 9) {
                            filaspac = 0;

                        }
                        if (columnaspac < 0) {
                            filaspac = 14;

                        }
                        if (columnaspac > 14) {
                            filaspac = 0;

                        }
                        if (tablero[filaspac][columnaspac] == 'R' || tablero[filaspac][columnaspac] == 'M' || tablero[filaspac][columnaspac] == 'G') {
                            System.out.println("You lose");
                            break;
                        }

                        tablero[filaspac][columnaspac] = 'C';
                        System.out.println();
                        if (tablero[filanueva][columnasnueva] == 'C') {
                            tablero[filanueva][columnasnueva] = ' ';
                            puntos += 50;
                            puntos++;
                        }
                        if (puntos >= 1000) {
                            System.out.println("You win");
                            break;

                        }

                    }

                    break;

                case 2:
                    case2();

                    break;
            }
        } while (opcion != 3);
    }

    public static void case2() {
        char[][] tablero = new char[10][15];
        char[][] tablero2 = new char[10][15];
        int cantidades = 0;
        int filaspac;
        int columnaspac;
        int[] filasfantasmita = new int[3];
        int[] columnasfantasmita = new int[3];
        char[] fantasmas = {'R', 'M', 'G'};
        int puntos = 0;
        boolean Cristiano = false;
        boolean Ronaldo = false;
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = '*';
                tablero2[i][j] = '*';

            }

        }

        for (int i = 0; i < 8; i++) {
            int filasobstaculo = 0;
            int columnasobstaculo = 0;
            do {
                filasobstaculo = random.nextInt(10);
                columnasobstaculo = random.nextInt(15);
            } while (tablero[filasobstaculo][columnasobstaculo] != '*');
            tablero[filasobstaculo][columnasobstaculo] = 'O';

        }
        do {
            filaspac = random.nextInt(10);
            columnaspac = random.nextInt(15);
        } while (tablero[filaspac][columnaspac] != '*');
        tablero[filaspac][columnaspac] = 'C';
        for (int i = 0; i < 3; i++) {
            int filasfantasmas = 0;
            int columnasfantasmas = 0;
            do {
                filasfantasmas = random.nextInt(10);
                columnasfantasmas = random.nextInt(15);
            } while (tablero[filasfantasmas][columnasfantasmas] != '*');
            filasfantasmita[i] = filasfantasmas;
            columnasfantasmita[i] = columnasfantasmas;
            tablero[filasfantasmas][columnasfantasmas] = fantasmas[i];

        }

        int filasfrutas = 0;
        int columnasfrutas = 0;
        do {
            filasfrutas = random.nextInt(10);
            columnasfrutas = random.nextInt(15);

        } while (tablero[filasfrutas][columnasfrutas] != '*');
        tablero[filasfrutas][columnasfrutas] = 'B';
//                    System.out.println("Bienvenido a Pacman");
//                    System.out.println("Puntos|| " + puntos);
//                     for (int i = 0; i < tablero.length; i++) {
//                         for (int j = 0; j < tablero[i].length; j++) {
//                             System.out.print(tablero[i][j]+ " ");
//                             
//                             
//                         }
//                         System.out.println();
//                    }

        char movimiento = ' ';
        while (movimiento != 'W' || movimiento != 'S' || movimiento != 'A' || movimiento != 'D') {
            int filanueva = filaspac;
            int columnasnueva = columnaspac;
            System.out.println("Bienvenido a Pacman");
            System.out.println("Puntos || " + puntos);
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[i].length; j++) {
                    System.out.print(tablero[i][j] + " ");
                }
                System.out.println();

            }
            System.out.println("W(ARRIBA)");
            System.out.println("S(ABAJO)");
            System.out.println("A(IZQUIERDA)");
            System.out.println("D(DERECHA)");
            movimiento = entrada.next().toLowerCase().charAt(0);
            if (movimiento == 'w') {
                if (filaspac > 0) {
                    filaspac--;

                }

            }
            if (movimiento == 's') {
                if (filaspac > 0) {
                    filaspac++;

                }

            }
            if (movimiento == 'a') {
                if (columnaspac > 0) {
                    columnaspac--;

                }

            }
            if (movimiento == 'd') {
                if (columnaspac > 0) {
                    columnaspac++;

                }

            }
            if (movimiento == 'x') {
                break;

            }
            if (filaspac < 0) {
                filaspac = 9;

            }
            if (filaspac > 9) {
                filaspac = 0;

            }
            if (columnaspac < 0) {
                filaspac = 14;

            }
            if (columnaspac > 14) {
                filaspac = 0;

            }
            if (tablero[filaspac][columnaspac] == 'R' || tablero[filaspac][columnaspac] == 'M' || tablero[filaspac][columnaspac] == 'G') {
                System.out.println("You lose");
                break;
            }

            tablero[filaspac][columnaspac] = 'C';
            System.out.println();
            if (tablero[filanueva][columnasnueva] == 'C') {
                tablero[filanueva][columnasnueva] = ' ';
                puntos += 50;
                puntos++;
            }
            if (puntos >= 1000) {
                System.out.println("You win");
                break;

            }

        }
    }
}
