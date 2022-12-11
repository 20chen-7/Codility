public class PassingCars {
//    static int fact(int n){
//        if (n == 0){
//            return 1;
//        }
//        int res = 1;
//        for (int i = 2; i < n; i++){
//            res *= i;
//        }
//        return res;
//    }
//    static int nC(int n, int c){
//        return fact(n)/(fact(c)*fact(n-c));
//    }
    public int solution(int[] A) {
        // write your code in Java SE 8
        int cnt = 0;
        int zeros = 0;
        for (int i = 0; i< A.length; i++){
            if (A[i] == 0){
                zeros ++;
            }
            if (A[i] == 1){
                cnt += zeros;
            }
        }
        if (cnt > 1000_000_000 | cnt < 0){
            return -1;
        }
        return cnt;
//        return nC(zeros, 1)*nC(ones, 1);
    }
}
