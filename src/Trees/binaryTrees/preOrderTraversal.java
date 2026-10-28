
/*

## Preorder Traversal of a Binary Tree

## Problem Statement

Given the following binary tree:

                  10
                /    \
               5      30
             /  \    /  \
            2    7  15   35
           /    / \  /   /
          1    6   8 12 25
         /          \
        0            9

Traverse the tree in preorder and return a list containing
the value of every node in the order visited.

Preorder Traversal:
1. Visit the current root.
2. Visit the left subtree.
3. Visit the right subtree.

## Expected Complexity

Time: O(n) — Each node is visited once.
Auxiliary Space: O(h) — Recursion stack, where h is tree height.
Output Space: O(n) — Stores all node values.

*/

package Trees.binaryTrees;
import java.util.ArrayList;
import java.util.List;

public class preOrderTraversal {
    public static void main(String[] args) {
        Node root = new Node(10);
        Node c1 = new Node(5);
        Node c2 = new Node(2);
        Node c3 = new Node(7);
        Node c4 = new Node(15);
        Node c5 = new Node(30);
        Node c6 = new Node(1);
        Node c7 = new Node(6);
        Node c8 = new Node(8);
        Node c9 = new Node(12);
        Node c10 = new Node(25);
        Node c11 = new Node(35);
        Node c12 = new Node(0);
        Node c13 = new Node(9);
        root.left = c1;
        root.right = c5;
        c1.left =c2;
        c1.right = c3;
        c5.left = c4;
        c5.right = c11;
        c2.left = c6;
        c6.left = c12;
        c3.left = c7;
        c3.right = c8;
        c8.right = c13;
        c4.left = c9;
        c11.left = c10;
        ArrayList<Integer> list = new ArrayList<>();
        preOrder(root, list);
        System.out.println(list);

    }
    private static void preOrder(Node x, List<Integer> ans){
        if(x == null) return;
        ans.add(x.val);
        preOrder(x.left, ans);
        preOrder(x.right, ans);
    }
}



