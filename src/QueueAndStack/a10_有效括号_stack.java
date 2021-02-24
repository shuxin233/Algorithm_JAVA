package QueueAndStack;
/*
有效的括号
        给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。

        有效字符串需满足：

        左括号必须用相同类型的右括号闭合。
        左括号必须以正确的顺序闭合。
         

        示例 1：

        输入：s = "()"
        输出：true
        示例 2：

        输入：s = "()[]{}"
        输出：true
        示例 3：

        输入：s = "(]"
        输出：false
        示例 4：

        输入：s = "([)]"
        输出：false
        示例 5：

        输入：s = "{[]}"
        输出：true
         

        提示：

        1 <= s.length <= 104
        s 仅由括号 '()[]{}' 组成*/


import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class a10_有效括号_stack {

    public static void main(String[] args) {
        String a="({}[{}])";
        System.out.println(isValid(a));
    }

    public static boolean isValid(String s) {
        if(s.length()==0||s.length()%2!=0)return false;
        Map<Character,Character> map=new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        Stack<Character> stack=new Stack<>();
        for (char temp: s.toCharArray()) {
            if(map.containsKey(temp))stack.push(temp);
            else if(stack.empty()&&!map.containsKey(temp))return false;
            else if(map.get(stack.pop())!=temp)return false;
        }
        return stack.empty();
    }
}
