package com.github.singals.algo.leetcode.seventyFive.bst;

/**
 * Given a root node reference of a BST and a key, delete the node with the given
 * key in the BST. Return the root node reference (possibly updated) of the BST.
 * <p>
 * Basically, the deletion can be divided into two stages:
 * - Search for a node to remove.
 * - If the node is found, delete the node.
 */
public class DeleteFromBst {

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;

        if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else {
            if (root.left == null && root.right == null) return null;
            else if (root.left == null) return root.right;
            else if (root.right == null) return root.left;
            else {
                TreeNode ptr = getLeastValueFromBst(root.right);
                root.val = ptr.val;
                root.right = deleteNode(root.right, root.val);
            }
        }
        return root;
    }

    private TreeNode getLeastValueFromBst(TreeNode node) {
        while (node.left != null) node = node.left;
        return node;
    }
}
