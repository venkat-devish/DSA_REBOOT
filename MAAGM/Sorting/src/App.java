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

        // MergeSort mergeSort = new MergeSort();
        // mergeSort.mergeSort(list, 0, list.size() - 1);

        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(list, 0, list.size() - 1);

        // Print the final array :)
        for (int i : list) {
            System.out.print(i + " ");
        }
    }
}
