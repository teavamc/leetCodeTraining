package com.teavamc.leetcodes.TopKFrequentElements;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author 张超 teavamc
 * @Description:
 * 给定一个非空的整数数组，返回其中出现频率前 k 高的元素。
 *
 * 示例 1:
 *
 * 输入: nums = [1,1,1,2,2,3], k = 2
 * 输出: [1,2]
 * 示例 2:
 *
 * 输入: nums = [1], k = 1
 * 输出: [1]
 * 说明：
 *
 * 你可以假设给定的 k 总是合理的，且 1 ≤ k ≤ 数组中不相同的元素的个数。
 * 你的算法的时间复杂度必须优于 O(n log n) , n 是数组的大小。
 * @ClassName TopKFrequent
 * @date 2019/3/11 21:50
 **/
public class TopKFrequent {
    public List<Integer> topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        int[] temp = new int[nums.length];
        Arrays.sort(nums);
        int count = 1;
        int j = 0;
        for (int i = 0;i < nums.length-1;i++){
            if (i < nums.length-1){
                if (nums[i] == nums[i+1]){
                    count++;
                }
                temp[j++] = count;
                count = 1;
            }
            temp[j] = 1;
        }



    }
}
