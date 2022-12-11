import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountDiv {
    public int solution(int A, int B, int K) {
        int numA = Math.floorDiv(A, K);
        int numB = Math.floorDiv(B, K);
        int diff = numB - numA;
        if (A%K == 0){
            diff ++;
        }
        return diff;
    }
}
