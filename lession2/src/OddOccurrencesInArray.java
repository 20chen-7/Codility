import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {
    public int OddOccurrencesInArray(int[] A) {
        HashMap<Integer, Integer> intCountMap = new HashMap<Integer, Integer>();
        for (int num : A){
            if (intCountMap.containsKey(num)){
                intCountMap.put(num, intCountMap.get(num)+1);
            }else{
                intCountMap.put(num, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry: intCountMap.entrySet()){
            if (entry.getValue() %2 != 0){
                return entry.getKey();
            }
        }
        return 0;
    }
}
