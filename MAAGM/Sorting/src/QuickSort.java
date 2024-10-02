import java.util.*;;

public class QuickSort {
    public void quickSort(ArrayList<Integer> arr, int low, int high) {
        if (low < high) {
            int pIdx = findAndReplace(arr, low, high);
            quickSort(arr, low, pIdx - 1);
            quickSort(arr, pIdx + 1, high);
        }
    }

    private static int findAndReplace(ArrayList<Integer> arr, int low, int high) {
        int pivot = arr.get(low);
        int i = low, j = high;

        while (i < j) {
            while (arr.get(i) <= pivot && i <= high) {
                i++;
            }

            while (arr.get(j) > pivot && j >= low) {
                j--;
            }

            if (i < j) {
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }

        int temp = arr.get(low);
        arr.set(low, arr.get(j));
        arr.set(j, temp);

        return j;
    }
}
