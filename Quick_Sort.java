import java.util.Scanner;

public class Quick_Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] array = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        System.out.println("Array before sorting:");
        printArray(array);
        
        quickSort(array, 0, n - 1);
        
        System.out.println("\nArray after sorting:");
        printArray(array);
        
        scanner.close();
    }
    
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Partitioning index
            int partitionIndex = partition(array, low, high);
            
            // Recursively sort elements before and after partition
            quickSort(array, low, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, high);
        }
    }
    
    public static int partition(int[] array, int low, int high) {
        // Pivot (Element to be placed at right position)
        int pivot = array[high];
        
        int i = (low - 1); // Index of smaller element
        
        for (int j = low; j < high; j++) {
            // If current element is smaller than the pivot
            if (array[j] < pivot) {
                i++;
                
                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        
        // Swap array[i+1] and array[high] (or pivot)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        
        return i + 1;
    }
    
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
