import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryGap {
    public int BinaryGap(int N) {
        String val = Integer.toBinaryString(N);
        int cnt = 0;
        List<Integer> cnts = new ArrayList<>();
        for (int i = 0; i < val.length(); i++) {
            char current = val.charAt(i);
            if (current == '0'){
                cnt += 1;
            }else{
                cnts.add(cnt);
                cnt = 0;
            }
        }
        return Collections.max(cnts);
    }
}
