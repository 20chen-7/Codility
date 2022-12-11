import java.util.Stack;

public class Nesting   {
    public int solution(String S) {
        // write your code in Java SE 8
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i <S.length(); i++){
            if (S.charAt(i) == '('){
                stack.push(')');
            }else if(S.charAt(i) == ')'){
                if (stack.isEmpty() == true){
                    return 0;
                }
                stack.pop();
            }
        }
        if (stack.isEmpty()==true){
            return 1;
        }
        return 0;
    }
}
