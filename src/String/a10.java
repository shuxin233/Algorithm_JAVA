package String;
/*实现 strStr()
        实现 strStr() 函数。

        给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。

        示例 1:

        输入: haystack = "hello", needle = "ll"
        输出: 2
        示例 2:

        输入: haystack = "aaaaa", needle = "bba"
        输出: -1
        说明:

        当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。

        对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。*/


public class a10 {


    public static void main(String[] args) {
        String a="hello";
        String b="ll";

        System.out.println(a.indexOf(b));

        System.out.println(strStr(a,b));
    }

    public static  int strStr(String haystack, String needle) {
        char[] a=haystack.toCharArray();
        char[] b=needle.toCharArray();

        for (int i = 0; i <a.length-b.length+1; i++) {
            boolean flag=true;
            for (int j = 0; j <b.length; j++) {
                if(a[i+j]==b[j])continue;
                else {
                    flag=false;
                    break;
                }
            }
            if (flag)return i;
        }
        return -1;
    }



}
