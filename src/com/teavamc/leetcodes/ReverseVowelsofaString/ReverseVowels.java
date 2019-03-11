package com.teavamc.leetcodes.ReverseVowelsofaString;

import java.util.HashSet;

/**
 * @author 张超 teavamc
 * @Description:
 * 编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
 *
 * 示例 1:
 *
 * 输入: "hello"
 * 输出: "holle"
 * 示例 2:
 *
 * 输入: "leetcode"
 * 输出: "leotcede"
 * 说明:
 * 元音字母不包含字母"y"。
 * @ClassName ReverseVowels
 * @date 2019/3/11 21:23
 **/
public class ReverseVowels {
    public String reverseVowels(String s) {
        char[] c = s.toCharArray();
        int cLength = c.length;
        int left = 0;
        int right = cLength-1;

        while (left < right){
           while (!isAeiou(c[left]) && left < right){
               left++;
           }
           while (!isAeiou(c[right]) && left < right){
               right--;
           }
           swap(c,left,right);
           left++;
           right--;
        }
    return new String(c);
    }

    boolean isAeiou(char c){
        if("aeiouAEIOU".indexOf(c) != -1){
            return true;
        }
        return false;
    }

    void swap(char[] c,int left,int right){
        char t = c[left];
        c[left] = c[right];
        c[right] = t;
    }
}
