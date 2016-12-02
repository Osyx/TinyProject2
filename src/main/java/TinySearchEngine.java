import se.kth.id1020.TinySearchEngineBase;
import se.kth.id1020.util.Attributes;
import se.kth.id1020.util.Document;
import se.kth.id1020.util.Word;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Oscar on 16-11-30.
 */
public class TinySearchEngine implements TinySearchEngineBase {
    BinarySearchTree bst = new BinarySearchTree();

    public void insert(Word word, Attributes attributes) {
        if(word.word.toLowerCase().replaceAll("[^a-z]", "@").charAt(0) != '@') {
            WordNode test = new WordNode(word, attributes);
            bst.addNode(word, attributes);
        }

    }

    public List<Document> search(String s) {
        if(s.contains(" ")) {
            String[] arguments = s.split(" ");

            LinkedList<WordNode.AboutWord> aboutList = new LinkedList<WordNode.AboutWord>();
            for (String i:arguments) {
                LinkedList<WordNode.AboutWord> temp = bst.search(i, bst.letterArr[s.charAt(0) - 'a']).getAboutList();
                for (int j = 0; j < temp.size(); j++)
                    aboutList.add(temp.get(j));
            }

            BubbleSort bs = new BubbleSort();
            bs.sort(aboutList, "count", true);


            List<Document> results = new ArrayList<Document>();
            for (String i:arguments) {
                List<Document> list = bst.search(i);
                for (int j = 0; j < list.size(); j++) {
                    if (!results.contains(list.get(j)))
                        results.add(list.get(j));
                }
            }
            return results;

        }

        return bst.search(s);
    }

}
