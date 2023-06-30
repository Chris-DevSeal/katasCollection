package josephusPermutation;

import java.util.ArrayList;
import java.util.List;

public class JosephusPermutation {

    public <T> List<T> josephusPermutation(final List<T> items, final int k) {
        int removingIndex = 0;
        List<T> newItems = new ArrayList<>();
        while (!items.isEmpty()) {
            removingIndex = getNextIndex(removingIndex, items.size(), k);
            System.out.println(removingIndex + " - " + items.size());

            T t = items.get(removingIndex);
            T removedItem = items.remove(removingIndex);
            System.out.println(newItems);
            newItems.add(removedItem);
        }
        return newItems;
    }

    private int getNextIndex(int currentIndex, int size, int k) {
        int nextIndex = currentIndex + k;
        return nextIndex < size - 1 ? nextIndex : 0;
    }
}
