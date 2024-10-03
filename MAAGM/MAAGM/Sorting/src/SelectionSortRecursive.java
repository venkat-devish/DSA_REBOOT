import java.util.*;

public class SelectionSortRecursive {
    public void selectionSortRecursive(ArrayList<Integer> arr, int minIdx) {
        if (minIdx >= arr.size()) {
            return;
        }

        int findIdx = find(arr, minIdx);

        if (findIdx != minIdx) {
            swap(arr, minIdx, findIdx);
        }

        selectionSortRecursive(arr, minIdx + 1);
    }

    private static int find(ArrayList<Integer> arr, int minIdx) {
        int returnIdx = minIdx;
        for (int i = minIdx + 1; i < arr.size(); i++) {
            if (arr.get(i) < arr.get(returnIdx)) {
                returnIdx = i;
            }
        }

        return returnIdx;
    }

    private static void swap(ArrayList<Integer> arr, int baseIdx, int swapIdx) {
        int temp = arr.get(baseIdx);
        arr.set(baseIdx, arr.get(swapIdx));
        arr.set(swapIdx, temp);
    }
}
