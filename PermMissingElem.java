
import java.util.HashSet;
import java.util.Set;

public class PermMissingElem {
    public int solution(int[] A) {
        if (A.length == 0){
            return 1;
        }
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < A.length; i++){
            set.add(A[i]);
        }
        for (int i = 1; i <A.length+1; i++){
            if (set.contains(i) != true){
                return i;
            }
        }
        return A.length+1;
    }
}

