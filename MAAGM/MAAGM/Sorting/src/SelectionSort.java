import java.util.*;

public class SelectionSort {
    public void selectionSort(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            int mindIdx = i;

            for (int j = i; j < arr.size(); j++) {
                if (arr.get(j) < arr.get(i)) {
                    mindIdx = j;
                }
            }

            if (mindIdx != i) {
                int temp = arr.get(i);
                arr.set(i, arr.get(mindIdx));
                arr.set(mindIdx, temp);
            }
        }
    }
}
