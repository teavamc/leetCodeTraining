package com.teavamc.leetcodes.SortArrayByParity;

/**
 * @author 张超 teavamc
 * @Description:
 * 给定一个非负整数数组 A，返回一个由 A 的所有偶数元素组成的数组，后面跟 A 的所有奇数元素。
 *
 * 你可以返回满足此条件的任何数组作为答案。
 *
 *
 *
 * 示例：
 *
 * 输入：[3,1,2,4]
 * 输出：[2,4,3,1]
 * 输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
 *
 *
 * 提示：
 *
 * 1 <= A.length <= 5000
 * 0 <= A[i] <= 5000
 * @ClassName Solution
 * @date 2019/3/7 11:35
 **/
public class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] res = new int[A.length];
        int b = 0;
        int e = A.length-1;
        for (int i=0;i<A.length;i++){
            if (A[i] % 2 == 0){
                res[b] = A[i];
                b++;
            }else{
                res[e] = A[i];
                e--;
            }
        }
        return res;
    }
}
