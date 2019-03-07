package java.com.teavamc.leetcodes.RepeatedNTimes;

/**
 * @author 张超 teavamc
 * @Description:TODO
 * @ClassName Solution
 * @date 2019/3/7 13:10
 **/
public class Solution {
public int repeatedNTimes(int[] A) {
        HashSet<Integer> res = new HashSet<>();
        for(int i=0;i<A.length;i++){
            if(!res.add(A[i])){
                return A[i];
            }
        }
        return 0;
    }
}
