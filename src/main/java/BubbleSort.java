import se.kth.id1020.util.Document;

import java.util.LinkedList;
import java.util.List;

public class BubbleSort {

    LinkedList<WordNode.AboutWord> sort(LinkedList<WordNode.AboutWord> list, String property, Boolean ascending) {
        int R = list.size() - 2;
        boolean swapped = true;
        while(R >= 0 && swapped) {
            swapped = false;
            for (int i = 0; i <= R; i++) {
                if (list.get(i).getCount() > list.get(i + 1).getCount()) {
                    WordNode.AboutWord tempVal = list.get(i);
                    list.get(i).setAboutWord(list.get(i + 1));
                    list.get(i + 1).setAboutWord(tempVal);
                    swapped = true;
                }
            }
            R = R - 1;
        }
        return a;
    }
}