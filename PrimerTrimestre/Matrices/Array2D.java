package PrimerTrimestre.Matrices;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        /*
        boolean [][] asientos = new boolean[4][4];
        asientos[0][0] = true;
        asientos[0][1] = true;
        asientos[0][2] = true;
        asientos[0][3] = false;
        asientos[1][0] = false;
        asientos[1][1] = true;
        asientos[1][2] = true;
        asientos[1][3] = true;
        asientos[2][0] = true;
        asientos[2][1] = true;
        asientos[2][2] = true;
        asientos[2][3] = true;
        asientos[3][0] = true;
        asientos[3][1] = true;
        asientos[3][2] = true;
        asientos[3][3] = true;
        */
        boolean [][] asientos = { {false, true, false, true},
                                 {false, true, true, false},
                                 {false, true, false, false},
                                 {false, false, false, false},
                                };

        for (int fila = 0; fila < asientos.length; fila++) {
            for (int columna = 0; columna < asientos.length; columna++) {
                int Nfila = fila;
                int Ncolumna = columna;
                if (asientos[fila][columna] == false) {

                    System.out.println("El asiendo " + (Ncolumna + 1) + " de la fila " + (Nfila + 1) +" está ocupado");
                } else {
                    System.out.println("El asiendo " + (Ncolumna + 1) + " de la fila " + (Nfila + 1) +" está libre");
                }
            }
        }
        String [][] horario = {{"BD","BD","PROG","ING","COD"},
                               {"BD","BD","PROG","ING","LMSXI"},
                               {"BD","BD","PROG","SI","LMSXI"},
                               {"BD","SASP","LMSXI","SI","SI"},
                               {"PROG","SI","LMSXI","PROG","SI"},
                               {"PROG","SI","COD","PROG","IPE"},
                               {"PROG","IPE","COD","PROG","IPE"}
                              };
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Que asignatura toca?");
        System.out.print("Introduce el dia de la semana (1-5): ");
        int Ndia = sc.nextInt() - 1;
        System.out.print("Introduce la hora del dia (1-7): ");
        int Nhora = sc.nextInt() - 1;
        for (int hora = 0; hora < horario.length; hora++) {
            for (int dia = 0; dia < horario.length; dia++) {
                if (hora == Nhora) {
                    if (dia == Ndia){
                        System.out.println("Toca: " + horario[hora][dia]);
                        break;
                    }
                }
            }
        }


    }
}
