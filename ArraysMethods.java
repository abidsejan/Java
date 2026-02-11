import java.util.Arrays;

public class ArraysMethods {
    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 1, 7};

        System.out.println("Original Array: " + Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("Sorted: " + Arrays.toString(arr));

        int key = 7;
        int index = Arrays.binarySearch(arr, key);
        System.out.println("Binary Search 7: " + index);

        int[] copy = Arrays.copyOf(arr, arr.length);
        System.out.println("CopyOf: " + Arrays.toString(copy));

        int[] rangeCopy = Arrays.copyOfRange(arr, 1, 4);
        System.out.println("CopyOfRange: " + Arrays.toString(rangeCopy));

        Arrays.fill(copy, 0);
        System.out.println("Fill with 0: " + Arrays.toString(copy));

        int[] arr2 = {1,2,5,7,9};
        System.out.println("Equals: " + Arrays.equals(arr, arr2));

        int[][] matrix1 = {{1,2},{3,4}};
        int[][] matrix2 = {{1,2},{3,4}};
        System.out.println("Deep Equals: " + Arrays.deepEquals(matrix1, matrix2));

        System.out.println("HashCode: " + Arrays.hashCode(arr));

        System.out.println("Stream sum:");
        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);

        System.out.println("Parallel Sort:");
        int[] arr3 = {9,3,6,2,8};
        Arrays.parallelSort(arr3);
        System.out.println(Arrays.toString(arr3));
    }
}