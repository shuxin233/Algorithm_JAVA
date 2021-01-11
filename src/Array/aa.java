package Array;

public class aa {
    public static void main(String[] args) {

    }


    public static boolean isUnique(String astr) {
        if(astr==null){
            return true;
        }
        char [] a=astr.toCharArray();
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                if(a[i]==a[j]){
                    return false;
                }
            }
        }
        return true;
    }
}

