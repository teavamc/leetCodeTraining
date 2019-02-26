package com.teavamc.leetcodes.ToLowerCase;

/**
 * @author 张超 teavamc
 * @Description:TODO
 * @ClassName Solution
 * @date 2019/2/26 14:02
 **/
public class Solution {
    public String toLowerCase(String str) {
        char[] ary = str.toCharArray();
        for (int i=0;i<ary.length;i++){
            if (ary[i]>='A'&&ary[i]<='Z'){
                ary[i] = (char)((int)ary[i] + 32);
            }
        }
        return new String(ary);
    }
}
