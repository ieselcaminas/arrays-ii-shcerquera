package EJERCICIOS;

//Crea un programa que a partir de un array de enteros, cree una copia en otro array con los
// elementos en orden inverso
public class Inverso {
    public static int[] invertir(int[] array) {

        int[] copiaArray = array.clone();

        int posicionOriginalParaCopiar = (array.length - 1);
        for (int index = copiaArray.length - 1; index >= 0; index--) {
            copiaArray[index] = array[index - posicionOriginalParaCopiar];

            posicionOriginalParaCopiar = posicionOriginalParaCopiar - 2;
        }

        return copiaArray;
    }

    public static void main(String[] args) {

        int[] primerArray;

        primerArray = new int[6];
        primerArray[0] = 10;
        primerArray[1] = 25;
        primerArray[2] = 30;
        primerArray[3] = 45;
        primerArray[4] = 50;
        primerArray[5] = 65;

        for (int index = 0; index < primerArray.length; index++) {
            System.out.print(primerArray[index] + ", ");
        }

        System.out.println();

        int[] copiaArray = primerArray.clone();

        int posicionOriginalParaCopiar = -5;
        for (int index = copiaArray.length - 1; index >= 0; index--) {
            copiaArray[index] = primerArray[index + posicionOriginalParaCopiar];

            posicionOriginalParaCopiar = posicionOriginalParaCopiar + 2;
        }

        for (int index = 0; index < copiaArray.length; index++) {
            System.out.print(copiaArray[index] + ", ");
        }


    }
}
