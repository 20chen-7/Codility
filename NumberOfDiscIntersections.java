import java.util.Arrays;

public class NumberOfDiscIntersections {
    public int solution(int[] A) {
        // write your code in Java SE 8
        long[] left = new long[A.length];
        long[] right = new long[A.length];
        for (int i=0; i < A.length; i++){
            left[i] = i-(long)A[i];
            right[i] = i+(long)A[i];
        }
        Arrays.sort(left);
        Arrays.sort(right);
        int index = 0;
        int cnt = 0;
        for (int i = 0; i < A.length; i++){
            while (index < A.length && right[i] >= left[index]){
                cnt += index;
                cnt -= i;
                index ++;
            }
        }
        if (cnt > 10_000_000){
            return -1;
        }
        return cnt;
    }
}
