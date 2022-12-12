public class MinPermeterRectangle {
    public int solution(int N) {
        // write your code in Java SE 8
        int best_peri = (int) Math.sqrt(N);
        int res = (1+N)*2;
        for (int i = best_peri-1; i>0;i--) {
            if (N % i == 0) {
                int sec_peri = N / i;
                res = 2 * (sec_peri + i);
                break;
            }
        }return res;
    }
}
