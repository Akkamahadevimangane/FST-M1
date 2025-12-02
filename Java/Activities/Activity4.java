package activities;


public class Activity4 {

    // Insertion Sort method
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements greater than key one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // Method to display array
    public static void displayArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Initialize array with random numbers
        int[] numbers = {9, 5, 1, 4, 3};

        System.out.println("Array before sorting:");
        displayArray(numbers);

        // Sort using insertion sort
        insertionSort(numbers);

        System.out.println("Array after sorting:");
        displayArray(numbers);
    }
}

