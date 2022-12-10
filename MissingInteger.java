import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MissingInteger {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < A.length; i++){
            set.add(A[i]);
        }
        for (int j = 1; j < A.length+1; j++){
            if (set.contains(j) == true){
                set.remove(j);
            } else{
                return j;
            }

        }return A.length+1;
    }
}