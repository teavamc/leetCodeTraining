package com.teavamc.leetcodes.HammingDistance;

/**
 * @author 张超 teavamc
 * @Description:
 * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 *
 * 给出两个整数 x 和 y，计算它们之间的汉明距离。
 *
 * 注意：
 * 0 ≤ x, y < 231.
 *
 * 示例:
 *
 * 输入: x = 1, y = 4
 *
 * 输出: 2
 *
 * 解释:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 *        ↑   ↑
 *
 * 上面的箭头指出了对应二进制位不同的位置。
 * @ClassName HammingDistance
 * @date 2019/3/7 13:53
 **/
public class HammingDistance {
    public int hammingDistance(int x, int y) {
//        算法思想，直接用位运算符^,相同元素为0.不同元素为1,再把结果转成二进制，统计1的个数
        String bs = Integer.toBinaryString(x^y).replaceAll("0","");
        return  bs.length();
    }
}
