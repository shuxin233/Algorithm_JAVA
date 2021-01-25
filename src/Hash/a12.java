package Hash;

import java.util.HashSet;

public class a12 {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int i=0;
        int ans=0;
        int temp=0;
        char[] a=s.toCharArray();
        while (i<s.length()){
            if(!set.contains(a[i])){
                set.add(a[i]);
                i++;
                temp++;
            }else {

            }
        }
        return ans;
    }
}
