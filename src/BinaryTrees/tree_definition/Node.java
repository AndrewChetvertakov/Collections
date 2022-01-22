package BinaryTrees.tree_definition;

import java.util.Stack;

public class Node<T> {
    T value;
    public Node<T> left, right;

    public Node(T value) {
        this.value = value;
        left = null;
        right = null;
    }

    public void dfs_iteratively(Node<T> head) {
        if (head == null) return;
        Stack<Node<T>> stack = new Stack<Node<T>>() {{ push(head); }};
        while (!stack.isEmpty()) {
            Node<T> current = stack.pop();
            System.out.println(current.value);
            if (current.right != null) stack.push(current.right);
            if (current.left != null) stack.push(current.left);
        }
    }

    public void dfs_recursively(Node<T> head) {
        if (head == null) return;
        System.out.println(head.value);
        dfs_recursively(head.left);
        dfs_recursively(head.right);
    }

}
