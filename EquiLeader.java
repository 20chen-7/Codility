import java.util.HashMap;
import java.util.Map;

public class EquiLeader {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Map<Integer, Integer> cntMap = new HashMap<>();
        for (int i = 0; i < A.length; i++){
            if (cntMap.containsKey(A[i])){
                cntMap.put(A[i], cntMap.get(A[i])+1);
            }else{
                cntMap.put(A[i], 1);
            }
        }
        int leader_cnt = 0;
        int leader_val = 0;
        for (int key: cntMap.keySet()){
            if (cntMap.get(key) > leader_cnt){
                leader_cnt = cntMap.get(key);
                leader_val = key;
            }
        }
        if (leader_cnt <= A.length/2){
            return 0;
        }
        int left_leader = 0;
        int pair = 0;
        for (int i = 0; i < A.length; i++){
            if (A[i] == leader_val){
                left_leader ++;
            }
            if (left_leader > (i+1)/2){
                int right_leader = leader_cnt-left_leader;
                if (right_leader > (A.length-i-1)/2){
                    pair++;
                }
            }
        }return pair;

    }
}
