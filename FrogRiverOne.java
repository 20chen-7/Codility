import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {
    public int solution(int X, int[] A) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i=1; i<=X; i++){
            set.add(i);
        }
        for (int i = 0; i< A.length; i++){
            if(set.contains(A[i]) == true){
                set.remove(A[i]);
            }
            if(set.isEmpty() == true){
                return i;
            }
        }
        return -1;
    }
}
