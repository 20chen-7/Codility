import java.util.HashSet;
import java.util.Set;

public class PermCheck {
    public int solution(int[] A) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 1; i < A.length+1; i++){
            set.add(i);
        }
        for (int i = 0; i< A.length; i++){
            if (set.contains(A[i]) == true){
                set.remove(A[i]);
            }
            if (set.isEmpty() == true){
                return 1;
            }
        }
        return 0;
    }
}
