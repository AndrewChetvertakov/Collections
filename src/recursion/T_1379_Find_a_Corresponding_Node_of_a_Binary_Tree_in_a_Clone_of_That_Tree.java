package recursion;

import BinaryTrees.tree_definition.Node;

public class T_1379_Find_a_Corresponding_Node_of_a_Binary_Tree_in_a_Clone_of_That_Tree {
    public static void main(String[] args) {

          Node<Integer> original = build_tree();
          Node<Integer> copy = build_tree();
          Node.dfs_recursively(copy);


    }

    private static Node<Integer> build_tree(){
        Node<Integer> head = new Node<>(7,4,3);
        head.right.add_leaves(6, 19);
        head.left.right = null;
        return head;

         /*
        Input: tree = [7,4,3,null,null,6,19], target = 3
        Output: 3
            7
         /     \
        4       3
      /  \     / \
   null null  6   19

         */
    }
}
