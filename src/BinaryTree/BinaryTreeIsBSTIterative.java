package BinaryTree;

import java.util.Stack;

public class BinaryTreeIsBSTIterative {
    public static boolean isBST(TreeNode root) {
        if (root == null) {
            return true; // An empty tree is considered a BST.
        }

        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> minValues = new Stack<>();
        Stack<Integer> maxValues = new Stack<>();

        stack.push(root);
        minValues.push(Integer.MIN_VALUE);
        maxValues.push(Integer.MAX_VALUE);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            int minValue = minValues.pop();
            int maxValue = maxValues.pop();

            if (node.val <= minValue || node.val >= maxValue) {
                return false; // Violates the BST property.
            }



            if (node.right != null) {
                stack.push(node.right);
                minValues.push(node.val);
                maxValues.push(maxValue);
            }



            if (node.left != null) {
                stack.push(node.left);
                minValues.push(minValue);
                maxValues.push(node.val);
            }
        }

        return true; // All nodes satisfy the BST property.
    }

    public static void main(String[] args) {
        // Create a sample binary tree
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        boolean isBST = isBST(root);
        System.out.println("Is the tree a BST? " + isBST);
    }
}
