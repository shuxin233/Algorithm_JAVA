package String;
/*
验证回文串
        给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。

        说明：本题中，我们将空字符串定义为有效的回文串。

        示例 1:

        输入: "A man, a plan, a canal: Panama"
        输出: true
        示例 2:

        输入: "race a car"
        输出: false
*/


public class a09 {

    public static void main(String[] args) {

    }
    public boolean isPalindrome(String s) {
        StringBuffer sgood = new StringBuffer();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                sgood.append(Character.toLowerCase(ch));
            }
        }
        int n = sgood.length();
        int left = 0, right = n - 1;
        while (left < right) {
            if (Character.toLowerCase(sgood.charAt(left)) != Character.toLowerCase(sgood.charAt(right))) {
                return false;
            }
            ++left;
            --right;
        }
        return true;
    }


    /*public boolean isPalindrome(String s) {
        char[] ss=s.toCharArray();
        for (int i = 0; i <ss.length ; i++) {
            if(ss[i]<=90&&ss[i]>=65){
                ss[i]+=32;
            }
        }
        int left=0;
        int right=ss.length;
        while (left<right){
            if(left<right&&ss[left]<97||ss[left]>122){
                left++;
            }
            if(left<right&&ss[right]<97||ss[right]>122){
                right--;
            }
            if(left<right&&ss[left]==ss[right]){
                left++;
                right--;
                continue;
            }else {
                return false;
            }
        }
        return true;
    }*/


}
