import java.util.Stack;

/**
 * Created by klb on 28.07.17.
 */
public class Brackets {

    public int solution(String S) {
        Stack<Character> stack = new Stack<>();
        Character top = null;
        for(Character c : S.toCharArray()) {
            switch(c) {
                case '[':
                    stack.push(c);
                    break;
                case '(':
                    stack.push(c);
                    break;
                case '{':
                    stack.push(c);
                    break;
                case ']':
                    if(stack.empty()) {
                        return 0;
                    }
                    top = stack.pop();
                    if(!top.equals('[')) {
                        return 0;
                    }
                    break;
                case ')':
                    if(stack.empty()) {
                        return 0;
                    }
                    top = stack.pop();
                    if(!top.equals('(')) {
                        return 0;
                    }
                    break;
                case '}':
                    if(stack.empty()) {
                        return 0;
                    }
                    top = stack.pop();
                    if(!top.equals('{')) {
                        return 0;
                    }
                    break;

            }
        }
        return stack.empty() ?  1 : 0;
    }
}