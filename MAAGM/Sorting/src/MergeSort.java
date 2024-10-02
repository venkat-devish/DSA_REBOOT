import java.util.*;

public class MergeSort {
    public void mergeSort(ArrayList<Integer> arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int mid = (low + high) / 2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    private static void merge(ArrayList<Integer> arr, int low, int mid, int high) {
        int i = low, j = mid + 1;
        ArrayList<Integer> temp = new ArrayList<>();

        while (i <= mid && j <= high) {
            int a = arr.get(i);
            int b = arr.get(j);
            if (a <= b) {
                temp.add(a);
                i++;
            } else {
                temp.add(b);
                j++;
            }
        }

        while (i <= mid) {
            int a = arr.get(i);
            temp.add(a);
            i++;
        }

        while (j <= high) {
            int b = arr.get(j);
            temp.add(b);
            j++;
        }

        for (int k = 0; k < temp.size(); k++) {
            arr.set(k + low, temp.get(k));
        }
    }
}
