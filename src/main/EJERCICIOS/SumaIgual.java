package EJERCICIOS;

import java.util.HashSet;

//Escribid un programa Java para encontrar todos los pares de elementos en un array cuya suma es
// igual a un número especificado por el usuario.
public class SumaIgual {
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] nums2 = nums1.clone();

        //verificar y almacenar  igualdad de los dos arrays
        boolean esIgual = true;

        //verificar igualdad
        if (nums1.length != nums2.length){
            esIgual = false; // si son diferentes las longitudes
        }else{
            for (int i = 0; i < nums1.length; i++) {
                if (nums1[i] != nums2[i]){
                    esIgual= false;
                    break;
                }

            }
        }// verificar y añadir metodo













    }

}
