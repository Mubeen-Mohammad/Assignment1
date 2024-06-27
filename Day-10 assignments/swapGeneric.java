
import java.util.Arrays;

// Task 2: Generic Classes and Methods
// Implement a generic method that swaps the positions of two elements in an array, regardless of their type, and
// demonstrate its usage with different object types.

class ArrayUtils {
    public static <T> void swap(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
public class swapGeneric {
    public static void main(String[] args) {

        // Swapping elements in an Integer array
        Integer[] intArray = {2,5,3,4,7};
        System.out.println("Before swap: " + Arrays.toString(intArray));
        ArrayUtils.swap(intArray, 1, 3);
        System.out.println("After swap: " + Arrays.toString(intArray));

        // Swapping elements in a String array
        String[] strArray = {"R","N","M","F"};
        System.out.println("Before swap: " + Arrays.toString(strArray));
        ArrayUtils.swap(strArray, 1, 2);
        System.out.println("After swap: " + Arrays.toString(strArray));

        // Swapping elements in a Double array
        Double[] dblArray = {1.5,2.5,4.4,3.7};
        System.out.println("Before swap: " + Arrays.toString(dblArray));
        ArrayUtils.swap(dblArray, 0, 2);
        System.out.println("After swap: " + Arrays.toString(dblArray));
    }
}