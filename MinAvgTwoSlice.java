public class MinAvgTwoSlice {
    public int solution(int[] A) {
        // write your code in Java SE 8
        float min = Integer.MAX_VALUE;
        int idx = 0;
        for (int i = 0; i < A.length-2; i++){
            float avg = (A[i]+A[i+1])/2;
            float avg_3 = (A[i]+A[i+1]+A[i+2])/3;
            if (avg > avg_3){
                avg = avg_3;
            }
            if (avg < min){
                idx = i;
                min = avg;
            }
        }
        float avg = (A[A.length-1]+A[A.length-2]) /2;
        if (avg < min){
            idx = A.length-2;
            min = avg;
        }return idx;
    }
}
