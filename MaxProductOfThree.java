import java.util.Arrays;

public class MaxProductOfThree {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int max_p = A[A.length-1]*A[A.length-2]*A[A.length-3];
        int max_n = A[0]*A[1]*A[A.length-1];
        return Math.max(max_n, max_p);
    }
}
