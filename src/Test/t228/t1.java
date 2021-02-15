package Test.t228;

public class t1 {
    public int minOperations(String s) {

        char[] a=s.toCharArray();
        int ans=a.length;
        int i=0;
        int j=1;
        int temp=0;
        while (i<a.length){
            if(a[i]!='0'){
                temp++;
                i=i+2;
            }else {
                i=i+2;
            }
        }
        while (j<a.length){
            if(a[j]!='1'){
                temp++;
                j=j+2;
            }else {
                j=j+2;
            }
        }

        ans=Math.min(ans,temp);
        temp=0;
         i=0;
         j=1;
        while (i<a.length){
            if(a[i]!='1'){
                temp++;
                i=i+2;
            }else {
                i=i+2;
            }
        }
        while (j<a.length){
            if(a[j]!='0'){
                temp++;
                j=j+2;
            }else {
                j=j+2;
            }
        }
        ans=Math.min(ans,temp);
        return ans;
    }
}
