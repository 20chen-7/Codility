public class MaxProfit {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if (A.length <= 1){
            return 0;
        }
        int min_price = A[0];
        int max_pro = 0;
        for (int i = 1; i < A.length; i++){
            if (A[i]-min_price > max_pro){
                max_pro = A[i]-min_price;
            }else if (min_price > A[i]){
                min_price = A[i];
            }
        }return max_pro;
    }
}
