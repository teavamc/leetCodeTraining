package com.teavamc.leetcodes.JewelsAndStones;

import javafx.scene.chart.Chart;

/**
 * @author 张超 teavamc
 * @Description:TODO
 * @ClassName Solution
 * @date 2019/2/26 12:00
 **/
public class Solution {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        for (int j=0;j<S.length();j++){
            for (int z=0;z<J.length();z++){
                if (S.charAt(j) == J.charAt(z)){
                    count += 1;
                    break;
                }
            }
        }
        return count;
    }
}
