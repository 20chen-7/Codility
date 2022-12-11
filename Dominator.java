import java.util.HashMap;
import java.util.Map;

public class Dominator {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Map<Integer, Integer> cntMap = new HashMap<>();
        for (int i = 0; i< A.length; i++){
            if(cntMap.containsKey(A[i]) == true){
                cntMap.put(A[i], cntMap.get(A[i])+1);
            }else{
                cntMap.put(A[i],1);
            }
        }
        int max_num = 0;
        int max_cnt = 0;
        for (int key: cntMap.keySet()) {
            int val = cntMap.get(key);
            if (val > max_cnt) {
                max_cnt = val;
                max_num = key;
            }
        }
        if (max_cnt <= ((A.length)/2)){
            return -1;
        }
        for (int i = 0; i < A.length; i++){
            if (A[i] == max_num){
                return i;
            }
        }return -1;
    }
}
