package String;

/*
最长回文子串
        给你一个字符串 s，找到 s 中最长的回文子串。

         

        示例 1：

        输入：s = "babad"
        输出："bab"
        解释："aba" 同样是符合题意的答案。
        示例 2：

        输入：s = "cbbd"
        输出："bb"
        示例 3：

        输入：s = "a"
        输出："a"
        示例 4：

        输入：s = "ac"
        输出："a"
         

        提示：

        1 <= s.length <= 1000
        s 仅由数字和英文字母（大写和/或小写）组成

*/

public class a02 {
    public static void main(String[] args) {

    }


    public String longestPalindrome(String s) {
        if(s==null||s.length()<=1)return s;
        int[] range=new int[2];
        char[] ss=s.toCharArray();
        for(int i=0;i<s.length();i++){
            i=findLongest(ss,range,i);
        }
        return s.substring(range[0],range[1]+1);
    }

    public static int findLongest(char[] s,int[] range,int low){
        int high=low;
        while (high<s.length-1&&s[low]==s[high+1]){
            high++;
        }
        int ans=high;
        while (low>0&&high<s.length-1&&s[low-1]==s[high+1]){
            low--;
            high++;
        }
        if(high-low>range[1]-range[0]){
            range[1]=high;
            range[0]=low;
        }
        return ans;
    }






}
