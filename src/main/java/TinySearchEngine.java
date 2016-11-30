import se.kth.id1020.TinySearchEngineBase;
import se.kth.id1020.util.Attributes;
import se.kth.id1020.util.Document;
import se.kth.id1020.util.Word;

import java.util.List;

/**
 * Created by Oscar on 16-11-30.
 */
public class TinySearchEngine implements TinySearchEngineBase {

    public void insert(Word word, Attributes attributes) {
        if(word.word.toLowerCase().replaceAll("[^a-z]", "@").charAt(0) != '@') {
            WordNode test = new WordNode(word, attributes);
            System.out.println(test.getWord());
        }

    }

    public List<Document> search(String s) {
        return null;
    }

}
