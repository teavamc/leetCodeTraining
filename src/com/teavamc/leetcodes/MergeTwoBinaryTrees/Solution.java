package com.teavamc.leetcodes.MergeTwoBinaryTrees;

/**
 * @author 张超 teavamc
 * @Description:
 * 给定两个二叉树，想象当你将它们中的一个覆盖到另一个上时，两个二叉树的一些节点便会重叠。
 * 你需要将他们合并为一个新的二叉树。合并的规则是如果两个节点重叠，那么将他们的值相加作为节点合并后的新值，否则不为 NULL 的节点将直接作为新二叉树的节点。
 * @ClassName Solution
 * @date 2019/3/6 17:03
 **/

import javax.swing.tree.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1!=null&&t2!=null){
            t1.val += t2.val;
            t1.left = mergeTrees(t1.left,t2.left);
            t1.right = mergeTrees(t1.right,t2.right);
        }if (t1==null){
            return t2;
        }else if (t2==null){
            return t1;
        }
        return t1;
    }

    public class TreeNode {
      int val;
      TreeNode left;
    TreeNode right;
   TreeNode(int x) { val = x; }
    }
}
