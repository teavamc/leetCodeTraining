package com.teavamc.leetcodes.LongestCommonPrefix;

/**
 * @author 张超 teavamc
 * @Description:
 * 题目
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 * 思路
 * 字符串数组[0]位的str作为扫描项，遍历数组后续字符串
 * prefix从后递减长度，遍历完成则为最长公共子串，若为空则无
 * @ClassName Solution
 * @date 2019/2/26 14:48
 **/
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length != 0) {
            String prefix = strs[0];
            for (int i=0;i<strs.length;i++){
                while (strs[i].indexOf(prefix)!=0){
                    prefix = prefix.substring(0,prefix.length()-1);
                    if (prefix=="") return "";
                }
            }
            return prefix;
        }return "";
    }
}
