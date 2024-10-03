import java.util.*;

public class BubbleSort {
    public void bubbleSort(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size() - 1; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    private static void swap(ArrayList<Integer> arr, int baseIdx, int swapIdx) {
        int temp = arr.get(baseIdx);
        arr.set(baseIdx, arr.get(swapIdx));
        arr.set(swapIdx, temp);
    }
}
