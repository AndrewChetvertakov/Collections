package BinaryTrees.experiments;

import BinaryTrees.tree_definition.Node;

public class TreeTest {
    public static void main(String[] args) {

        Node<Character> treeHead = new Node<>('a', 'b', 'c');
        Node.dfs_recursively(treeHead);
    }

}
