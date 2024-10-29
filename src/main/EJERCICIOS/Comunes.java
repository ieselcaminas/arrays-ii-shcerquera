package EJERCICIOS;

public class Comunes {
    public static void main(String[] args) {
        String resultado = "";
        int[] num1 = { 3, 5, 8, 9, 11};
        int[] num2 = { 2, 4, 6, 7, 8,};
        for (int i = 0; i < num1.length ; i++) {
            for (int j = 0; j < num2.length; j++) {
                if (num1[i] == num2[j]){
                    resultado += num1[i] + " ";
                    break;
                }
            }
        }
        System.out.println(resultado);
    }
}// falta metodo
