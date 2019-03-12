package com.teavamc.leetcodes.PeakIndexinaMountainArray;

/**
 * @author 张超 teavamc
 * @Description:
 * 我们把符合下列属性的数组 A 称作山脉：
 *
 * A.length >= 3
 * 存在 0 < i < A.length - 1 使得A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
 * 给定一个确定为山脉的数组，返回任何满足 A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1] 的 i 的值。
 *
 *
 *
 * 示例 1：
 *
 * 输入：[0,1,0]
 * 输出：1
 * 示例 2：
 *
 * 输入：[0,2,1,0]
 * 输出：1
 * @ClassName PeakIndexInMountainArray
 * @date 2019/3/12 21:17
 **/
public class PeakIndexInMountainArray {
    public int peakIndexInMountainArray(int[] A) {
        int left = 0;
        int right = A.length-1;
        int mid;
        while (left <= right){
            mid = (left + right)/2;
            if (A[mid-1] < A[mid] && A[mid] > A[mid+1]){
                return mid+1;
            }else if (A[mid-1] < A[mid] && A[mid] < A[mid+1]){
                left = mid+1;
            }else {
                right = mid-1;
            }
        }
        return -1;
    }
}
