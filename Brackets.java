import java.util.Stack;

public class Brackets {
    public int solution(String S) {
        // write your code in Java SE 8
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < S.length(); i++){
            if (S.charAt(i) == '('){
                stack.push(')');
            } else if (S.charAt(i) == '[') {
                stack.push(']');
            }else if (S.charAt(i) == '{') {
                stack.push('}');
            }else if (S.charAt(i) == ')' || S.charAt(i) == ']'||S.charAt(i) == '}') {
                if (stack.isEmpty()==true){
                    return 0;
                }else{
                    char c = stack.pop();
                    if (c != S.charAt(i)) {
                        return 0;
                    }
                }
            }

        }
        if (stack.isEmpty()==true) {
            return 1;
        }
        return 0;
    }
}
