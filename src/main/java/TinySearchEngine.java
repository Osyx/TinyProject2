import se.kth.id1020.TinySearchEngineBase;
import se.kth.id1020.util.Attributes;
import se.kth.id1020.util.Document;
import se.kth.id1020.util.Word;

import java.util.List;

/**
 * Created by Oscar on 16-11-30.
 */
public class TinySearchEngine implements TinySearchEngineBase {
    BinarySearchTree bst = new BinarySearchTree();

    public void insert(Word word, Attributes attributes) {
        //if(word.word.toLowerCase().charAt(0) < 97 || word.word.toLowerCase().charAt(0) > 122) {
        if(word.word.toLowerCase().replaceAll("[^a-z]", "@").charAt(0) != '@') {
            WordNode test = new WordNode(word, attributes);
            //System.out.println(test.getWord());
            bst.addNode(word, attributes);
        }

    }

    public List<Document> search(String s) {
        return bst.search(s);
    }

}
