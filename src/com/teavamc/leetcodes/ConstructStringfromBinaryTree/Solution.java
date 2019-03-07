package com.teavamc.leetcodes.ConstructStringfromBinaryTree;
/**
 * @author 张超 teavamc
 * @Description:
 * 你需要采用前序遍历的方式，将一个二叉树转换成一个由括号和整数组成的字符串。
 * 空节点则用一对空括号 "()" 表示。而且你需要省略所有不影响字符串与原始二叉树之间的一对一映射关系的空括号对。
 *
 *示例 1:
 *
 * 输入: 二叉树: [1,2,3,4]
 *        1
 *      /   \
 *     2     3
 *    /
 *   4
 *
 * 输出: "1(2(4))(3)"
 *
 * 解释: 原本将是“1(2(4)())(3())”，
 * 在你省略所有不必要的空括号对之后，
 * 它将是“1(2(4))(3)”。
 *
 * @ClassName Solution
 * @date 2019/3/6 17:27
 **/
public class Solution {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }

    StringBuffer str = new StringBuffer();
    public String tree2str(TreeNode t) {
        preOrder(t,str);
        return str.toString();
    }

    public void preOrder(TreeNode t,StringBuffer str) {
        TreeNode temp = t;
        if (t != null) {
            str.append(t.val);
            if (t.left != null) {
                str.append("(");
                preOrder(t.left, str);
                str.append(")");
            }
            if (t.left == null && t.right != null)
                str.append("()");
            if (t.right != null) {
                str.append("(");
                preOrder(t.right, str);
                str.append(")");
            }
        }
    }
 }
}
