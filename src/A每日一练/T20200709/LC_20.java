package A每日一练.T20200709;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 20. 有效的括号
 * <p>
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合
 */
public class LC_20 {

    public static void main(String[] args) {
        String c = "({";
        System.out.println(check(c.toCharArray()));
    }

    public static boolean check(char[] c) {

        if(c.length<=1) return false;
        Stack<Character> stack=new Stack<>();
        for (int i=0;i<c.length;i++){
            char t=c[i];
            if(t=='('||t=='{'||t=='['){
                stack.push(t);
            }else{
                if(stack.empty()) return false;
                if(t==')'){
                    if(stack.pop()!='('){
                        return  false;
                    }
                }
                if(t=='}'){
                    if(stack.pop()!='{'){
                        return  false;
                    }
                }
                if(t==']'){
                    if(stack.pop()!='['){
                        return  false;
                    }
                }
            }
        }

        if(!stack.empty()) return  false;

        return true;
    }

    public static boolean check1(char[] c){
        if(c.length<=1) return false;
        Stack<Character> stack=new Stack<>();
        for (int i=0;i<c.length;i++){
            char t=c[i];
            if(t=='('||t=='{'||t=='['){
                stack.push(t);
            }else{
                if(t==')'){
                    if(stack.pop()!='('){
                        return false;
                    }
                }
                if(t=='}'){
                    if(stack.pop()!='{'){
                        return false;
                    }
                }
                if(t==']'){
                    if(stack.pop()!='['){
                        return false;
                    }
                }
            }
        }
        if(!stack.empty()) return false;
        return true;
    }

}
