package com.teavamc.leetcodes.SquaresOfASortedArray;

import java.util.Arrays;

/**
 * @author 张超 teavamc
 * @Description:TODO
 * @ClassName Solution
 * @date 2019/2/26 12:34
 **/
public class Solution {
    public int[] sortedSquares(int[] A) {
        for (int i=0;i<A.length;i++){
            A[i] = A[i] * A[i];
        }
//        sort(A,0,A.length-1);
        Arrays.sort(A);
        return A;
    }
    //快排
    public void sort(int[] A,int begin,int end){
        if (begin < end){
            int left = begin;
            int right = end;
            if (left!=right){
                while (A[right] >= A[begin] && right>left){
                    right--;
                }
                while (A[left] <= A[begin] && left<right){
                    left++;
                }
                if (right>left){
                    swap(A,left,right);
                }
            }
        swap(A,begin,left);
        sort(A,begin,left-1);
        sort(A,right+1,end);
        }
    }
    public void swap(int[] arr,int left,int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
