import se.kth.id1020.util.Word;

/**
 * Created by Oscar on 16-11-30.
 */
public class BinarySearchTree<Key extends Comparable<Key>, Value> {
    WordNode[] letterArr = new WordNode[26];

    public void addNode(WordNode node) {
        if(letterArr[node.getWord().charAt(0) - 'a'] == null)
            letterArr[node.getWord().charAt(0) - 'a'] = node;
        WordNode head = letterArr[node.getWord().charAt(0) - 'a'];
        addingNode(head, node);
    }

    public void addingNode(WordNode head, WordNode newNode) {
        for (int i = 0; i < head.getWord().length(); i++) {
            if()
        }
    }
}
