package BinaryTrees.experiments;

import BinaryTrees.tree_definition.Node;


public class TreeExperiments {
    public static void main(String[] args) {
        /* String Tree
                    a
                  /   \
                 b     c
                / \     \
               d   e     f
        */
        Node<String> strHead = new Node<>("a");
        strHead.left = new Node<>("b");
        strHead.right = new Node<>("c");
        strHead.left.left = new Node<>("d");
        strHead.left.right = new Node<>("e");
        strHead.right.right = new Node<>("f");

        //Depth first Traversal: a -> b -> d -> e -> c -> f
//        strHead.dfs_iteratively(strHead);
        strHead.dfs_recursively(strHead);
    }



}
/*
    /* Integer Tree
                1
              /   \
             2     3
            / \     \
           4   5     6

    Node<Integer> head = new Node<>(1);
        head.left = new Node<>(2);
        head.right = new Node<>(3);
        head.left.left = new Node<>(4);
        head.left.right = new Node<>(5);
        head.right.right = new Node<>(6);
        */