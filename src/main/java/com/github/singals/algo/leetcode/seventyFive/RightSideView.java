package com.github.singals.algo.leetcode.seventyFive;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RightSideView {
    private List<Integer> res = new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) {
        getView(root, 0);
        return res;
    }

    private void getView(TreeNode root, int level) {
        if (root == null) return;
        if (level == res.size()) res.add(root.val);
        if (root.right != null) getView(root.right, level + 1);
        if (root.left != null) getView(root.left, level + 1);
    }
}
