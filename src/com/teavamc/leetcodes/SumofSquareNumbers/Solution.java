package com.teavamc.leetcodes.SumofSquareNumbers;

/**
 * @author 张超 teavamc
 * @Description:
 * 给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c。
 * 示例1:
 *
 * 输入: 5
 * 输出: True
 * 解释: 1 * 1 + 2 * 2 = 5
 *
 *
 * 示例2:
 *
 * 输入: 3
 * 输出: False
 * @ClassName Solution
 * @date 2019/3/6 18:39
 **/
public class Solution {
    public boolean judgeSquareSum(int c) {
        int a = 0;
        int b = (int)Math.sqrt(c);
        while (a <= b){
            int sum = a*a + b*b;
            if (sum == c){
                return true;
            }else if (sum > c){
                b--;
            }else if (sum < c){
                a++;
            }
        }
        return false;
    }
}
