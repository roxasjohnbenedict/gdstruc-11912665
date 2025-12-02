//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[10];

        // Initialize array elements
        numbers[0] = 35;
        numbers[1] = 69;
        numbers[2] = 1;
        numbers[3] = 10;
        numbers[4] = -50;
        numbers[5] = 320;
        numbers[6] = 63;
        numbers[7] = 58;
        numbers[8] = 26;
        numbers[9] = 13;

        // Print original array
        System.out.println("Before sorting:");
        printArrayElements(numbers);

        // Bubble Sort Ascending
        bubbleSortAscending(numbers);
        System.out.println("\n\nAfter bubble sort (ascending):");
        printArrayElements(numbers);

        // Bubble Sort Descending
        bubbleSortDescending(numbers);
        System.out.println("\n\nAfter bubble sort (descending):");
        printArrayElements(numbers);

        // Reset array to original unsorted values for selection sort
        int[] numbersForSelection = {35, 69, 1, 10, -50, 320, 63, 58, 26, 13};

        // Selection Sort Ascending
        selectionSortAscending(numbersForSelection);
        System.out.println("\n\nAfter selection sort (ascending):");
        printArrayElements(numbersForSelection);

        // Selection Sort Descending
        selectionSortDescending(numbersForSelection);
        System.out.println("\n\nAfter selection sort (descending):");
        printArrayElements(numbersForSelection);

    }

    // Bubble Sort Ascending
    private static void bubbleSortAscending(int[] arr) {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--) {
            for (int i = 0; i < lastSortedIndex; i++) {
                if (arr[i] > arr[i + 1]) { // Swap if current element is greater than next
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    // Bubble Sort Descending
    private static void bubbleSortDescending(int[] arr) {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--) {
            for (int i = 0; i < lastSortedIndex; i++) {
                if (arr[i] < arr[i + 1]) { // Swap if current element is smaller than next
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    // Selection Sort Ascending
    private static void selectionSortAscending(int[] arr) {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--) {
            int largestIndex = 0; // Index of largest element in unsorted part

            for (int i = 1; i <= lastSortedIndex; i++) {
                if (arr[i] > arr[largestIndex]) {
                    largestIndex = i; // Update index of largest element
                }
            }

            // Swap largest element with last element of unsorted part
            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[largestIndex];
            arr[largestIndex] = temp;
        }
    }

    // Selection Sort Descending
    private static void selectionSortDescending(int[] arr) {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--) {
            int smallestIndex = 0; // Index of smallest element in unsorted part

            for (int i = 1; i <= lastSortedIndex; i++) {
                if (arr[i] < arr[smallestIndex]) {
                    smallestIndex = i; // Update index of smallest element
                }
            }

            // Swap smallest element with last element of unsorted part
            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }
    }

    // Method to print array elements
    private static void printArrayElements(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
