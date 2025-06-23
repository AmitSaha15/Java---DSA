package TreeDataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }

    public static void inOrderTraversal(TreeNode root){
        if(root == null) return; // base condition

        inOrderTraversal(root.left); // traverse left of root

        System.out.print(root.val + " -> "); // print root value

        inOrderTraversal(root.right); // traverse right of root
    }

    public static void preOrderTraversal(TreeNode root){
        if(root == null) return; // base condition

        System.out.print(root.val + " -> "); // print root value

        preOrderTraversal(root.left); // traverse left of root

        preOrderTraversal(root.right); // traverse right of root
    }

    public static void postOrderTraversal(TreeNode root){
        if(root == null) return; // base condition

        postOrderTraversal(root.left); // traverse left of root

        postOrderTraversal(root.right); // traverse right of root

        System.out.print(root.val + " -> "); // print root value
    }

    public static void levelOrderTraversal(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()){ // process queue until empty
            TreeNode node = queue.poll(); // pop and print the value
            System.out.print(node.val + "-> ");

            if(node.left != null){ // add left child of popped node
                queue.add(node.left);
            }
            if(node.right != null){ // add right child of popped node
                queue.add(node.right);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);

        root.left = new TreeNode(8);
        root.right = new TreeNode(3);

        TreeNode leftNode = root.left;
        TreeNode rightNode = root.right;

        leftNode.left = new TreeNode(10);

        rightNode.left = new TreeNode(21);
        rightNode.right = new TreeNode(27);

        inOrderTraversal(root);
        System.out.println();
        preOrderTraversal(root);
        System.out.println();
        postOrderTraversal(root);
        System.out.println();
        levelOrderTraversal(root);
    }
}
