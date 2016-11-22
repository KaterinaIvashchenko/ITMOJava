package Stack;

import java.util.Stack;

/**
 *
 */
public class Main {

    public static void main(String[] args) {

        String str = "([)]";
        boolean res = parse(str);
        System.out.println(res);

    }

    private static boolean parse(String str) {
        Stack stack = new Stack();
        char last = '0';
        System.out.println(str.length());
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(' || c == '[') {
                stack.push(c);
                last = c;
            } else if ((c == ')' || c == ']') && stack.isEmpty()) {
                return false;
            } else if ((c == ')' && last == '(') || (c == ']' && last == '[')) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
