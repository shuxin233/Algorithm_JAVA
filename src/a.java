public class a {
    public boolean isLongPressedName(String name, String typed) {
        char[] a=name.toCharArray();
        char[] b=typed.toCharArray();
        int i=0;
        int j=0;
        while (j<b.length){
            if(a[i]==b[j]&&a[i+1]!=a[i]&&i<a.length){
                while (b[j+1]==b[j]&&j<b.length){
                    j++;
                }
                i++;
                j++;
            }else if(a[i]==b[j]&&a[i+1]==a[i]&&i<a.length){
                i++;
                j++;
            }else {
                return false;
            }
        }
        return true;
    }
}
