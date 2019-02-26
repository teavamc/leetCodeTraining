package com.teavamc.leetcodes.LongestCommonPrefix;

/**
 * @author 张超 teavamc
 * @Description:TODO
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
