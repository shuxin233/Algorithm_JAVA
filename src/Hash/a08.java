package Hash;

/*
给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。

         

        示例：

        s = "leetcode"
        返回 0

        s = "loveleetcode"
        返回 2
         

        提示：你可以假定该字符串只包含小写字母。*/


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class a08 {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for (int i = 0; i <s.length() ; i++) {
            char c=s.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else map.put(c,1);
        }
        for (int i = 0; i <s.length() ; i++) {
            char c=s.charAt(i);
            if(map.get(c)==1){
                return i;
            }
        }
        return -1;
    }
}
