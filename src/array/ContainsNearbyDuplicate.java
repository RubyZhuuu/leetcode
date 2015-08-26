package array;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ruby on 2015/8/26.
 * Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the difference between i and j is at most k.
 */
public class ContainsNearbyDuplicate {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int len = nums.length;

        Map<Integer, Integer> storage = new HashMap<Integer, Integer>();
        for(int i = 0; i < len; i++){
            if(storage.containsKey(nums[i])){
                if(i - storage.get(nums[i]) <= k){
                    return true;
                }else{
                    storage.put(nums[i], i);
                }
            }else{
                storage.put(nums[i], i);
            }
        }

        return false;
    }
}
