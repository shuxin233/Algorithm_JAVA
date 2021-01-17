package String;
/*
字符串中的第一个唯一字符
        给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。

         

        示例：

        s = "leetcode"
        返回 0

        s = "loveleetcode"
        返回 2
         

        提示：你可以假定该字符串只包含小写字母。
*/


public class a08 {
    public int firstUniqChar(String s) {
        if(s.length()==1)return 0;

        char[] a=s.toCharArray();
        int i=0;
        int j=0;
        while (i<a.length){
            boolean temp= true;
            while (j<a.length){
                if(a[i]==a[j]&&i!=j){
                    temp=false;
                    break;
                }
                j++;
            }
            if(temp)return i;
            i++;
            j=0;
        }
        return -1;
    }
}
