package com.teavamc.leetcodes.ShortestToChar;

import java.util.ArrayList;

/**
 * @author 张超 teavamc
 * @Description:
 * 给定一个字符串 S 和一个字符 C。返回一个代表字符串 S 中每个字符到字符串 S 中的字符 C 的最短距离的数组。
 *
 * 示例 1:
 *
 * 输入: S = "loveleetcode", C = 'e'
 * 输出: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
 * 说明:
 *
 * 字符串 S 的长度范围为 [1, 10000]。
 * C 是一个单字符，且保证是字符串 S 里的字符。
 * S 和 C 中的所有字母均为小写字母。
 * @ClassName Solution
 * @date 2019/2/27 16:37
 **/
class Solution {
    public int[] shortestToChar(String S, char C) {
        char[] ary_S = S.toCharArray();
        int[] res = new int[ary_S.length];
        ArrayList<Integer> index = new ArrayList<>();
        //拿到字符C的所有位置
        for (int i=0;i<ary_S.length;i++){
            if (ary_S[i] == C){
                index.add(i);
            }
        }
        //在S中，每一位与C进行遍历后，取绝对值的最小值
        for (int j=0;j<ary_S.length;j++){
            int[] temp = new int[index.size()];
            for (int charIndex = 0;charIndex<index.size();charIndex++){
                temp[charIndex] = Math.abs(j - index.get(charIndex));
            }
            int mini = temp[0];
            for(int findmini = 1;findmini<temp.length;findmini++){
                if (temp[findmini] < mini){
                    mini = temp[findmini];
                }
            }
            res[j] = mini;
        }
        return res;
    }
}
