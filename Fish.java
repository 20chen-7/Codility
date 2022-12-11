import java.util.Stack;

public class Fish {
    public int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        Stack<Integer> stack = new Stack<>();
        int res = A.length;
        for (int i= 0; i < A.length; i++){
            if (B[i] == 1){
                stack.push(A[i]);
            }
            if (B[i] == 0) {
                while (!stack.isEmpty()) {
                    if (stack.peek() > A[i]) {
                        res--;
                        break;
                    } else if (stack.peek() < A[i]) {
                        res--;
                        stack.pop();
                    }
                }
            }
        }return res;
    }

}
