package javaSE;

import java.util.HashMap;
import java.util.TreeMap;

public class acwing67 {
    public static void main(String[] args) {
    }
    public static int getNumberOfK(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        return map.getOrDefault(k,0);
    }
}


