package w6.weeklysales;

/**
 * @author Naia Siti Az-zahra
 * @version 1.0
 * @since 2023-02-23
 * @description Demonstrates the selection sort and insertion sort algorithms
 */

public class Sorting {
    // Sorts the specified array of objects using the selection sort algoruthm
    public static void selectionSort(Comparable[] list) {
        int min;
        Comparable temp;
        
        for(int index = 0; index < list.length-1; index++) {
            min = index;
            for(int scan = index+1; scan < list.length; scan++) {
                if(list[scan].compareTo(list[min]) < 0)
                    min = scan;
            }
            
            // Swap the values
            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }
    }
    
    // Sorts the specified array of objects using the insertion sort algorithm in descending order
    public static void insertionSort(Comparable[] list) {
        for(int index = 1; index < list.length; index++) {
            Comparable key = list[index];
            int position = index;

            // Shift smaller values to the right
            while(position > 0 && key.compareTo(list[position-1]) > 0) {
                list[position] = list[position-1];
                position--;
            }

            list[position] = key;
        }
    }
}
