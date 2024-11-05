package main;

import main.utils.Utilidades;

import java.util.ArrayList;
import java.util.Scanner;

//Escribid un programa Java para eliminar de un array un elemento específico (índice) introducido
// por el usuario (moviéndolo al final del mismo). Si el índice es mayor que el tamaño del array,
// debe volver a pedírselo.

public class Eliminar {

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.println(num + " ");
        }

        System.out.println();
    }

    public static int[] eliminar(int[] originalArray, int indexToMoveLatest) {

        // Array vacío con 0 elementos
        ArrayList<Integer> resultArray = new ArrayList<Integer>();

        int originalArrayLength = originalArray.length;

        for (int index = 0; index < originalArrayLength; index++) {
            if (index != indexToMoveLatest) {
                resultArray.add(originalArray[index]);
            }
        }

        resultArray.add(originalArray[indexToMoveLatest]);

        return resultArray.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] moverAlFinal(int[] originalArray, int indexToMoveLatest) {
        int originalArrayLength = originalArray.length;

        // array vacío con N elementos
        int[] resultArray = new int[originalArrayLength];

        int indexMinus = 0;

        for (int index = 0; index < originalArrayLength; index++) {
            if (index != indexToMoveLatest) {
                resultArray[index - indexMinus] = originalArray[index];
            } else {
                indexMinus = 1;

                resultArray[originalArrayLength - 1] = originalArray[indexToMoveLatest];
            }
        }

        return resultArray;
    }

    public static void printArray(int[] array, String initialMessage) {
        int arraySize = array.length;

        System.out.print(initialMessage);

        for (int index = 0; index < arraySize; index++) {
            System.out.print(array[index] + ", ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Indica una longitud para el array aleatorio: ");

        int arrayLength = sc.nextInt();

        int[] array = new int[arrayLength];

        Utilidades.rellenaArray(array, 1, 100);

        int size = array.length;

        printArray(array, "El Array original es: ");

        System.out.print("\n\nIntroduce el índice que deseas eliminar del Array: ");

        // se pide indicar el que desea eliminar
        int userIndex;
        while (true) {
            userIndex = sc.nextInt();

            // hacemos la comparativa de valores
            if (userIndex >= 0 && userIndex < size) {
                break;
            } else {
                System.out.print("Valor no valido. Introduce un número entre 0 y " + (size - 1) + ": ");
            }
        }

        int[] modifiedArray = eliminar(array, userIndex);

        printArray(modifiedArray, "El Array modificado es: ");
    }
}
