package main;

public class Comunes {
    //Escribid un programa Java para encontrar los elementos comunes entre dos arrays de enteros.

    // se define el metodo
    public static String comunes(int[] array1, int[] array2) {

        String comunes = "";

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    comunes += array1[i] + ", ";
                    break;
                }
            }
        }

        return comunes;
    }


    public static void main(String[] args) {
        int[] array1 = {3, 5, 8, 2, 11};
        int[] array2 = {2, 5, 6, 7, 8,};

        //se llama el metodo
        String comunes = comunes(array1, array2);

        System.out.println(comunes);
    }
}
