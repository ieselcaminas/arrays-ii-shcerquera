package EJERCICIOS;

import java.util.ArrayList;
import java.util.HashSet;

//Escribid un programa Java para encontrar los valores duplicados de un array de valores enteros.
public class Duplicados {
    public static void main(String[] args) {

        int[] numeros = {1, 2, 1, 3, 5, 8, 2, 4, 6, 5, 3};

        numerDuplicados(numeros);
    }
    public static void numerDuplicados (int[]array){
        ArrayList<Integer> duplicados = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j] && !duplicados.contains(j));
                duplicados.add(array[i]);
                System.out.println("valores duplicados," + duplicados);

            }

        }
        if (duplicados.isEmpty()){
            System.out.println("no hay duplicados");
        }





    }// incompleto falta metodo  y hay un error al ejecutarlo
}
