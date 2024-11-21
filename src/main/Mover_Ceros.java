package main;

import java.util.ArrayList;

//Escribid un programa Java para mover todos los 0 al final de un array.
// Mantened el orden relativo de los otros elementos de la array (distintos de cero).
public class Mover_Ceros {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 0, 0, 3, 5, 0, 4, 0, 0};

        ArrayList<Integer> cerosAlFinal = moverCeros(numeros);

        for (int numero : cerosAlFinal) {
            System.out.print(numero + ", ");
        }
    }

    public static ArrayList<Integer> moverCeros(int[] numeros) {
        ArrayList<Integer> cerosAlFinal = new ArrayList<>();

        int distintoDeCeroEncontrado = 0;

        for (int i = 0; i < numeros.length; i++) {
            int numeroAct = numeros[i];

            if (numeroAct == 0) {
                cerosAlFinal.add(numeroAct);
            } else {
                cerosAlFinal.add(distintoDeCeroEncontrado, numeroAct);
                distintoDeCeroEncontrado++;
            }
        }
        return cerosAlFinal;
    }
}
