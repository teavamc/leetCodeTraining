package com.teavamc.leetcodes.InvertBinaryTree;

import javax.swing.tree.TreeNode;

/**
 * @author 张超 teavamc
 * @Description:
 *
 * 翻转一棵二叉树。
 *
 * 示例：
 *
 * 输入：
 *
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 * 输出：
 *
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 *
 * @ClassName InvertBinaryTree
 * @date 2019/3/12 22:38
 **/
public class InvertBinaryTree {



    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }


    public TreeNode invertTree(TreeNode root) {
        // 是否为叶节点
        if (root == null){
            return root;
        }
        // 递归下去
        root.left = invertTree(root.left);
        root.right = invertTree(root.right);
        //交换左右子树
        swap(root);
        return root;
    }

    public TreeNode swap(TreeNode root){
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;
        return root;
    }

}
