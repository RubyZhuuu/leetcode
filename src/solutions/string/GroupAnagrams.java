package solutions.string;

import java.util.*;

/**
 * 49. Group Anagrams
 * Created by Ruby on 2016/1/20 14:32.
 * Given an array of strings, group anagrams together.

 For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"],
 Return:

 [
 ["ate", "eat","tea"],
 ["nat","tan"],
 ["bat"]
 ]
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap();
        List<List<String>> res = new ArrayList();
        int len = strs.length;

        for(int i = len; -- i >= 0; ) {  //本来想用String temp = strs[i] 结果效率反而变低了一些
            char[] ca = strs[i].toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if(map.containsKey(key)) {
                map.get(key).add(strs[i]);
            } else {
                List<String> group = new ArrayList();
                group.add(strs[i]);
                map.put(key, group);
            }
        }

        Iterator iter = map.keySet().iterator();  //用map.values() 方法反而不如迭代快
        while(iter.hasNext()) {
            String key = (String)iter.next();
            List<String> val = map.get(key);
            Collections.sort(val);
            res.add(val);
        }

        return res;
    }
}
