import java.util.stream.IntStream;

public class TapeEquilibrium {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int diff = Integer.MAX_VALUE;
        if (A.length == 1){
            return Math.abs(A[0]);
        }
        int Sum = IntStream.of(A).sum();
        int preSum = 0;
        int postSum = 0;
        for (int i = 1; i < A.length; i++ ){
            preSum += A[i-1];
            postSum = Sum - preSum;
            diff = Math.min(diff, Math.abs(postSum-preSum));
        }return diff;
    }
}
