public class CountFactors {
    public int solution(int N) {
        // write your code in Java SE 8
        int cnt = 0;
        int incr = N%2 == 0? 1: 2;
        for (int i = 1; i<= Math.sqrt(N); i += incr) {
            if (N%i == 0){
                cnt ++;
                if (i != N/i){
                    cnt++;
                }
            }
        }return cnt;
    }
}
