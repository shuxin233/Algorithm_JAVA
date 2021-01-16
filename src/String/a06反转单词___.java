package String;
/*反转字符串中的单词 III
        给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。

         

        示例：

        输入："Let's take LeetCode contest"
        输出："s'teL ekat edoCteeL tsetnoc"
         

        提示：

        在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。*/

public class a06反转单词___ {
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }

    public static String reverseWords(String s) {
        if(s==null||s.length()<1)return s;
        char[] ss=s.toCharArray();
        String ans="";
        int low=0;
        int fast=0;
        while (fast<s.length()){
            while (fast<s.length()&&ss[fast]!=' '){
                fast++;
            }
            for(int i=fast-1;i>=low;i--){
                ans+=ss[i];
            }
            if(fast<s.length()){
                ans+=" ";
            }
            fast++;
            low=fast;
        }
        return ans;
    }





}
