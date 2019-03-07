package com.teavamc.leetcodes.MaximumProductofThreeNumbers;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author 张超 teavamc
 * @Description:
 * 给定一个整型数组，在数组中找出由三个数组成的最大乘积，并输出这个乘积。
 *
 * 示例 1:
 *
 * 输入: [1,2,3]
 * 输出: 6
 * 示例 2:
 *
 * 输入: [1,2,3,4]
 * 输出: 24
 * 注意:
 *
 * 给定的整型数组长度范围是[3,104]，数组中所有的元素范围是[-1000, 1000]。
 * 输入的数组中任意三个数的乘积不会超出32位有符号整数的范围。
 * @ClassName Solution
 * @date 2019/3/6 18:30
 **/
public class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int end = nums.length-1;
        int ans1 = nums[0]*nums[1]*nums[end];
        int ans2 = nums[end]*nums[end-1]*nums[end-2];
        return ans1>ans2?ans1:ans2;
    }
}
