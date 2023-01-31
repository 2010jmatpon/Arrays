package Actividad_4_2;

import java.util.Arrays;

public class Actividad_4_2 {
    public static void main(String[] args) {
        int[][][] multiplicar = new int [10][10][3];

        for (int i = 1; i <= 10; i++){
            multiplicar[i - 1] =  multiplicarTablas (i);
        }
        imprimirTablas(multiplicar);
    }

    private static void multiplicarTablas(int num) {
        int[][] tablaMultiplicar = new int [10][3];

        for (int i = 0; i < tablaMultiplicar.length; i++){
            tablaMultiplicar[i][0] = num;
            tablaMultiplicar[i][1] = i + 1;
            tablaMultiplicar[i][2] = num * tablaMultiplicar[i][1];
        }
        System.out.println(tablaMultiplicar[i]);
    }

    private static void imprimirTablas (int[][][] tabla) {

        for (int i = 0; i < tabla.length; i++) {
            System.out.print("Tabla del " + (i + 1) + ":\t");

            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(Arrays.toString(tabla[i][j]) + "\t");
            }

            System.out.println();
        }
    }
}
