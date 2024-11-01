package main.EJERCICIOS;

import main.Utilidades;

import java.util.Arrays;

//Escribir un programa Java para probar la igualdad de dos vectores (en este caso, como será difícil
// que os dé dos veces el mismo array, igualad el segundo al primero, para probarlo. Esto se hace
// mediante el método clone() del array).
public class Iguales {

    public static boolean sonIguales(int[] array1, int[] array2) {

        return Arrays.equals(array1, array2);
    }

    public static void main(String[] args) {
        int[] array1 = new int[22];

        Utilidades.rellenaArray(array1, 1, 5);

        int[] array2 = array1.clone();

        //Utilidades.rellenaArray(array2, 1, 5);

        boolean sonIguales = sonIguales(array1, array2);

        if (sonIguales) {
            System.out.println("Los Arrays son iguales.");
        } else {
            System.out.println("Los Arrays no son iguales.");
        }

    }
}
