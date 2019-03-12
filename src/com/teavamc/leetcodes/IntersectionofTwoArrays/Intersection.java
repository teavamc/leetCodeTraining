package com.teavamc.leetcodes.IntersectionofTwoArrays;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 张超 teavamc
 * @Description:
 * 给定两个数组，编写一个函数来计算它们的交集。
 *
 * 示例 1:
 *
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2]
 * 示例 2:
 *
 * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出: [9,4]
 * 说明:
 *
 * 输出结果中的每个元素一定是唯一的。
 * 我们可以不考虑输出结果的顺序。
 * @ClassName Intersection
 * @date 2019/3/12 21:35
 **/
public class Intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> hashset = new HashSet<Integer>();
        for (int i=0;i < nums1.length;i++){
            for (int j=0;j < nums2.length;j++){
                if (nums1[i] == nums2[j]){
                    hashset.add(nums1[i]);
                }
            }
        }
        int[] res = new int[hashset.size()];
        int i = 0;
        for (Integer ppp:hashset){
            res[i++] = ppp.intValue();
        }
        return res;
    }
}
