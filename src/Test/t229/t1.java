package Test.t229;

public class t1 {
    public static void main(String[] args) {

    }

    public String mergeAlternately(String word1, String word2) {
        String ans="";
        int len1=word1.length();
        int len2=word2.length();
        if(len1<len2){
            for (int k = 0; k <len1; k++) {
                ans+=word1.charAt(k);
                ans+=word2.charAt(k);
            }
            for (int k = len1; k <len2 ; k++) {
                ans+=word2.charAt(k);
            }
        }else {
            for (int k = 0; k <len2; k++) {
                ans+=word1.charAt(k);
                ans+=word2.charAt(k);
            }
            for (int k = len2; k <len1 ; k++) {
                ans+=word1.charAt(k);
            }
        }

        return ans;
    }
}
