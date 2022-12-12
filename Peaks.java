import java.util.ArrayList;
import java.util.List;

public class Peaks {
    public int solution(int[] A) {
        // write your code in Java SE 8
        List<Integer> peaks = new ArrayList<>();
        for (int i = 1; i < A.length-1; i++){
            if (A[i-1] < A[i] && A[i+1] < A[i]){
                peaks.add(i);
            }
        }
        int N = A.length;
        for (int numBlock = N; numBlock >= 1; numBlock --){
            if (N % numBlock == 0){
                int blockSize = N/numBlock;
                int ithblockpeak = 0;
                for (int index : peaks){
                    if (index/blockSize==ithblockpeak){
                        ithblockpeak ++;
                    }
                }
                if (ithblockpeak == numBlock){
                    return numBlock;
                }
            }
        }return 0;
    }
}
