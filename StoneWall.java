import java.util.Stack;

public class StoneWall {
    public int solution(int[] H) {
        // write your code in Java SE 8
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        for (int i = 0; i < H.length; i++){
            while (!stack.isEmpty() && stack.peek() > H[i]){
                stack.pop();
            }
            if (stack.isEmpty()==true){
                res ++;
                stack.push(H[i]);
            }else if(stack.peek() < H[i]){
                res ++;
                stack.push(H[i]);
            }
        }return res;
    }
}
