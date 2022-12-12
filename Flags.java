import java.lang.reflect.Array;
import java.util.ArrayList;

public class Flags {
    public int solution(int[] A) {
        // write your code in Java SE 8
        // find index of peaks
        ArrayList<Integer> peaks = new ArrayList<>();
        for (int i = 1; i < A.length-1; i++) {
            if (A[i] > A[i - 1] && A[i] > A[i + 1]) {
                peaks.add(i);
            }
        }
        if (peaks.size() == 1 || peaks.size() == 0) {
            return peaks.size();
        }
        int left = 1;
        int right = peaks.size();
        int res = 1;
        while (left <= right) {
            int mid = (right + left) / 2;
            int used = 0;
            boolean suc = false;
            int pos = peaks.get(0);
            for (int i = 0; i < peaks.size(); i++) {
                if (peaks.get(i) >= pos) {
                    used++;
                    pos = peaks.get(i) + mid;
                    if (used == mid) {
                        suc = true;
                        break;
                    }
                }
            }
            if (suc) {
                left = mid + 1;
                res = mid;
            } else {
                right = mid - 1;
            }
        }
        return res;
    }
}