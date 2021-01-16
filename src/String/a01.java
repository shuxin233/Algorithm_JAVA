package String;
/*
最长公共前缀
        编写一个函数来查找字符串数组中的最长公共前缀。

        如果不存在公共前缀，返回空字符串 ""。

         

        示例 1：

        输入：strs = ["flower","flow","flight"]
        输出："fl"
        示例 2：

        输入：strs = ["dog","racecar","car"]
        输出：""
        解释：输入不存在公共前缀。
         

        提示：

        0 <= strs.length <= 200
        0 <= strs[i].length <= 200
        strs[i] 仅由小写英文字母组成
*/




public class a01 {
    public static void main(String[] args) {

        String [] a={"abab","aba","a"};
        System.out.println(longestCommonPrefix(a));

    }


    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0)return "";
        if(strs.length==1)return strs[0];
        char[][] chars=new char[strs.length][];
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()==0)return "";
            chars[i]=strs[i].toCharArray();
        }
        boolean flag=true;
        int temp=0;
        int min=chars[0].length;
        for(int i=0;i<chars.length;i++){
            if(min>chars[i].length){
                min=chars[i].length;
            }
        }


        while (flag){
            for(int i=0;i<chars.length-1;i++){
                if(chars[i][temp]==chars[i+1][temp]){
                    continue;
                }else {
                    flag=false;
                    break;
                }
            }
            if(temp==min-1){
                if(flag){
                    temp++;
                }
                break;
            }
            if(flag){
                temp++;
            }

        }
        String ans="";
        for(int i=0;i<temp;i++){
            ans+=chars[0][i];
        }
      return ans;
    }


}
