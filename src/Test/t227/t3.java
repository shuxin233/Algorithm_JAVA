package Test.t227;

public class t3 {
    public static void main(String[] args) {

        String a="jvjjjjjjvjjvjvjjjvjvjjjj";
        String b="jjjjjjvjjjjjjvjjjjv";
        System.out.println(largestMerge(a,b));
    }

    public static String largestMerge(String word1, String word2) {
        char[] w1=word1.toCharArray();
        char[] w2=word2.toCharArray();
        int len1=w1.length;
        int len2=w2.length;
        int i=0;//作为w1的指针
        int j=0;//作为w2的指针
        String ans="";
        while (i<len1&&j<len2){//遍历
            if(w1[i]==w2[j]){//当首字母相等时
                int a=i;
                int b=j;
                while (w1[a]==w2[b]&&a<len1-1&&b<len2-1){//
                    a++;
                    b++;
                }
                if(w1[a]>w2[b]||w1[a]<w2[b]){
                    if(w1[a]>w2[b]){
                        ans+=w1[i];
                        i++;
                    }else {
                        ans+=w2[j];
                        j++;
                    }
                }else if(b>=len2-1){
                    ans+=w1[i];
                    i++;
                }else if(a>=len1-1){
                    ans+=w2[j];
                    j++;
                }
            }
            else if(w1[i]>w2[j]){
                ans+=w1[i];
                i++;
            }else {
                ans+=w2[j];
                j++;
            }
        }
        while (i<len1){
            ans+=w1[i];
            i++;
        }
        while (j<len2){
            ans+=w2[j];
            j++;
        }
        return ans;
    }
}
