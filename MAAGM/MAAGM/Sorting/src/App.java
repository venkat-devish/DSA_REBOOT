import java.util.*;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(8);
        list.add(5);
        list.add(1);
        list.add(4);
        list.add(23);

        // list.add(3);
        // list.add(3);
        // list.add(3);
        // list.add(3);
        // list.add(3);

        // MergeSort mergeSort = new MergeSort();
        // mergeSort.mergeSort(list, 0, list.size() - 1);

        // QuickSort quickSort = new QuickSort();
        // quickSort.quickSort(list, 0, list.size() - 1);

        // SelectionSort selectionSort = new SelectionSort();
        // selectionSort.selectionSort(list);

        // SelectionSortRecursive selectionSortRecursive = new SelectionSortRecursive();
        // selectionSortRecursive.selectionSortRecursive(list, 0);

        // BubbleSort bubbleSort = new BubbleSort();
        // bubbleSort.bubbleSort(list);

        BubbleSortRecursive bubbleSortRecursive = new BubbleSortRecursive();
        bubbleSortRecursive.bubbleSortRecursive(list, 0);

        // Print the final array :)
        for (int i : list) {
            System.out.print(i + " ");
        }
    }
}
