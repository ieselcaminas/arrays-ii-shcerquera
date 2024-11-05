package main;

import java.util.Scanner;

//Escribid un programa Java para encontrar todos los pares de elementos en un array cuya suma es
// igual a un número especificado por el usuario.
public class SumaIgual {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Especifica el numero del resultado: ");

        int result = sc.nextInt();

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        String results = sumaIguales(numbers, result);

        System.out.println(results);
    }

    public static String sumaIguales(int[] numbers, int result) {
        String results = "";

        for (int indexA = 0; indexA < numbers.length; indexA++) {
            for (int indexB = indexA + 1; indexB < numbers.length; indexB++) {
                if (numbers[indexA] + numbers[indexB] == result) {
                    results += "[" + numbers[indexA] + " + " + numbers[indexB] + "] ";
                }
            }
        }

        if (results == "") {
            return "Ninguna coincidencia";
        }

        return results;
    }

}
