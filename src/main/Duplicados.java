package main;

import java.util.ArrayList;

//Escribid un programa Java para encontrar los valores duplicados de un array de valores enteros.
public class Duplicados {


    public static String duplicados(int[] array) {
        ArrayList<Integer> duplicadosArray = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j] && !duplicadosArray.contains(j)) {
                    duplicadosArray.add(array[i]);
                }
            }
        }
        if (duplicadosArray.isEmpty()) {
            return "";
        } else {
            String duplicados = "";
            for (int index = 0; index < duplicadosArray.size(); index++) {
                duplicados += duplicadosArray.get(index) + ", ";
            }

            return duplicados;
        }
    }

    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 1};

        String resultadoDuplicados = duplicados(numeros);

        if (resultadoDuplicados == "") {
            System.out.println("No hay duplicados.");
        } else {
            System.out.println("Los duplicados son: " + resultadoDuplicados);
        }
    }

}
