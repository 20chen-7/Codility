import java.lang.management.MemoryType;
import java.util.Stack;

public class MaxSliceSum {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int prev = A[0];
        int curr = A[0];
        int max = A[0];
        for (int i = 1; i < A.length; i++){
            curr = Math.max(A[i], prev+A[i]);
            prev = curr;
            max = Math.max(max, curr);
        }
        return max;
    }
}
