import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> ParentheseStack = new Stack<>();
        char init = 'i';
        ParentheseStack.push(init);

        for (char c : s.toCharArray()) {
            if (c == ')') {
                if (ParentheseStack.peek() == '(')
                    ParentheseStack.pop();
                else
                    return false;
            } else if (c == ']') {
                if (ParentheseStack.peek() == '[')
                    ParentheseStack.pop();
                else
                    return false;
            } else if (c == '}') {
                if (ParentheseStack.peek() == '{')
                    ParentheseStack.pop();
                else
                    return false;
            } else {
                ParentheseStack.push(c);
            }
        }

        return init == ParentheseStack.peek();
    }
}
