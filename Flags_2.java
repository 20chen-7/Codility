public class Flags_2 {
    public int solution(int[] A) {
        int[] peaks = new int[A.length];
        int peakStart = 0;
        int peakEnd = 0;
        for (int i = 1; i < A.length-1; i++){
            if (A[i] > A[i-1] && A[i] > A[i+1]){
                peaks[i] = 1;
                peakEnd = i + 1;
            }
            if (peakStart == 0){
                peakStart = i;
            }
        }
        int max_dist = (int) Math.ceil(Math.sqrt(A.length));
        int cnt = 0;
        int max = Integer.MIN_VALUE;
        int prevPeak = 0;
        int dist = 1;
        while (dist <= max_dist){
            cnt = 0;
            prevPeak = 0;
            for (int i = peakStart; i < peakEnd; i++){
                if (peaks[i] == 1 && (prevPeak == 0 || dist <= i - prevPeak)){
                    cnt ++;
                    prevPeak = i;
                }
                if (cnt == dist){
                    break;
                }
            }
            if (cnt <= max){
                return max;
            }
            max = cnt;
            dist ++;
        }return max;
    }
}
