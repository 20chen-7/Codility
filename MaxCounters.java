import java.util.Arrays;

public class MaxCounters {
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int[] arr = new int[N];
        int min = 0;
        int max = 0;
        for (int i=0; i < A.length; i++){
            if ((A[i] <= N) & (A[i] >= 1)){
                if (arr[A[i]-1] < min){
                    arr[A[i]-1] = min;
                }
                arr[A[i]-1] ++;
                if (arr[A[i]-1] > max) {
                    max = arr[A[i] - 1];
                }
            }else if (A[i] == N+1){
                min = max;
            }
        }
        for (int j = 0; j < A.length; j++){
            if (arr[j] < min){
                arr[j] = min;
            }
        }
        return arr;
    }

}
