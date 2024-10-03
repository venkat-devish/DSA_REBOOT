import java.util.*;

public class BubbleSortRecursive {
    public void bubbleSortRecursive(ArrayList<Integer> arr, int sIdx) {
        if (arr.size() <= 1) {
            return;
        }

        if (sIdx > arr.size() - 1) {
            return;
        }

        boolean isSwapped = swapElements(arr, 0);
        if (isSwapped == false) {
            return;
        }

        bubbleSortRecursive(arr, sIdx + 1);
    }

    private static boolean swapElements(ArrayList<Integer> arr, int idx) {
        boolean isSwapped = false;
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) > arr.get(i + 1)) {
                swap(arr, i, i + 1);
                isSwapped = true;
            }
        }

        return isSwapped;
    }

    private static void swap(ArrayList<Integer> arr, int baseIdx, int swapIdx) {
        int temp = arr.get(baseIdx);
        arr.set(baseIdx, arr.get(swapIdx));
        arr.set(swapIdx, temp);
    }
}