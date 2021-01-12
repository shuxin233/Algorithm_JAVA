package Array;

public class a07 {

    public static void main(String[] args) {
        String a="(al)G(al)()()G";
        System.out.println(interpret(a));
    }

    public static String interpret(String command) {
        char[] a=command.toCharArray();
        String ans="";
        int i=0;
        int j=0;
        while (i<a.length){
            if(a[i]=='('){
                j=i+1;
                while (a[j]!=')'){
                    j++;
                }
                if(j==i+1){
                    ans=ans+'o';
                }
                if(j>i+1){
                    for(int l=i+1;l<j;l++){
                        ans=ans+a[l];
                    }
                }
                i=j+1;
            }else {
                ans=ans+a[i];
                i++;
            }
        }
        return ans;
    }
}
