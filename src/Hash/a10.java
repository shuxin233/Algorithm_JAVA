package Hash;

import java.util.*;

public class a10 {
    public static void main(String[] args) {
        String[] a= {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(a));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for (int i = 0; i <strs.length ; i++) {
            char[] c=strs[i].toCharArray();
            Arrays.sort(c);
            if(map.containsKey(String.valueOf(c))){
                List<String> temp=map.get(String.valueOf(c));
                temp.add(strs[i]);
                map.put(String.valueOf(c),temp);
            }else {
                List<String> temp=new ArrayList<>();
                temp.add(strs[i]);
                map.put(String.valueOf(c),temp);
            }
        }
        List<List<String>> ans=new ArrayList<>();
        for (String key : map.keySet()) {
            ans.add(map.get(key));
        }
        return ans;
        //return new ArrayList<List<String>>(map.values());//直接返回。
    }
}
