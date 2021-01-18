package String;

import java.sql.SQLOutput;

public class a11 {

    public static void main(String[] args) {
        String a="hello";
        String b="ll";
        char[] aa=a.toCharArray();
        char[] bb=b.toCharArray();

        System.out.println(indexOf(aa,0,a.length(),bb,0,b.length(),0));

    }

    public int strStr(String haystack, String needle) {
        char[] aa=haystack.toCharArray();
        char[] bb=needle.toCharArray();
        return indexOf(aa,0,aa.length,bb,0,bb.length,0);
    }

    public static int indexOf(char[] source, int sourceOffset, int sourceCount,
                       char[] target, int targetOffset, int targetCount,
                       int fromIndex) {
        if (fromIndex >= sourceCount) {
            return (targetCount == 0 ? sourceCount : -1);
        }
        if (fromIndex < 0) {
            fromIndex = 0;
        }
        if (targetCount == 0) {
            return fromIndex;
        }

        char first = target[targetOffset];
        int max = sourceOffset + (sourceCount - targetCount);

        for (int i = sourceOffset + fromIndex; i <= max; i++) {
            /* Look for first character. */
            if (source[i] != first) {
                while (++i <= max && source[i] != first);
            }

            /* Found first character, now look at the rest of v2 */
            if (i <= max) {
                int j = i + 1;
                int end = j + targetCount - 1;
                for (int k = targetOffset + 1; j < end && source[j]
                        == target[k]; j++, k++);

                if (j == end) {
                    /* Found whole string. */
                    return i - sourceOffset;
                }
            }
        }
        return -1;
    }
}


