# Help

## Array
```java
public class ArrayExamples {
    public static void main(String[] args) {

        // Crear un Array con valores iniciales (1, 2, 3, 4)
        int[] array = {1, 2, 3, 4};

        // Crear un Array vacío de N elementos (42 en este caso)
        int arrayLength = 42;
        int[] array = new int[arrayLength];
        
        // Modificar el valor de un elemento del array
        int elementIndex = 4;
        int newValue = 13;
        array[elementIndex] = newValue;
        
        // o directamente...
        array[4] = 13;

        // Acceder al primer elemento de un Array
        int firstValue = array[0];

        // Acceder al últmo elemento de un Array
        int lastValue = array[array.length - 1];

        // Acceder a un elemento concreto del Array (el 4, en este caso)
        int elementIndex = 4;
        int specificValue = array[elementIndex];
        
        // o directamente...
        int specificIndex = array[4];
        
    }
}
```

## ArrayList
```java
// Cuando quieras usar ArrayList deberás importar esta Utilidad de Java
import java.util.ArrayList;

public class ArrayListExamples {
    public static void main(String[] args) {

        // Crear un ArrayList vacío
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Añadir elementos al ArrayList
        arrayList.add(42);

        // Acceder al primer elemento del Array
        int firstValue = arrayList.getFirst();

        // Acceder al último elemento del Array
        int lastValue = arrayList.getLast();
        int alsoLastValue = arrayList.get(arrayList.size() - 1);

        // Acceder a un elemento concreto del Array (el 12, en este caso)
        int elementIndex = 12;
        int specificValue = arrayList.get(elementIndex);
        
        // o directamente...
        int specificValue = arrayList.get(12);
        
    }
}
```

## Métodos
```java
public class MethodsExample {
    public static void main(String[] args) {

    }
}
```
