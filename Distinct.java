import java.util.HashMap;
import java.util.Map;

public class Distinct {
    public int solution(int[] A) {
        // write your code in Java SE 8
        HashMap<Integer, Integer> cntMap = new HashMap<Integer, Integer>();
        for (int num:A){
            if (cntMap.containsKey(num)){
                cntMap.put(num, cntMap.get(num)+1);
            }else{
                cntMap.put(num, 1);
            }
        }
        return cntMap.size();
    }
}
