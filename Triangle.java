import java.util.Arrays;

public class Triangle {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        if (A.length < 3){
            return 0;
        }
        for (int i = 0; i<A.length-2; i++){
            if ((long)A[i] >0 & (long)A[i] + (long)A[i+1] > (long)A[i+2]){
                return 1;
            }
        }return 0;
    }
}
