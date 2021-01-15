package String;

public class a02动态规划 {

    public static void main(String[] args) {
        String a="cbba";
        System.out.println(longestPalindrome(a));
    }

    public static String longestPalindrome(String s) {
        if(s==null||s.length()<2)return s;
        boolean[][] dp=new boolean[s.length()][s.length()];
        for(int i=0;i<s.length();i++){
            dp[i][i]=true;
        }
        int begin=0;
        int maxLen=0;
        char[] ss=s.toCharArray();
        for(int j=1;j<s.length();j++){
            for(int i=0;i<j;i++){
                if(ss[j]!=ss[i]){
                    dp[i][j]=false;
                }else {
                    if(j-i<3){
                        dp[i][j]=true;
                    }else {
                        dp[i][j]=dp[i+1][j-1];
                    }
                }
                if(dp[i][j]&&j-i>maxLen){
                    maxLen=j-i;
                    begin=i;
                }
            }
        }
        return s.substring(begin,maxLen+begin+1);
    }



}
