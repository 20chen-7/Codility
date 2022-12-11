import java.util.HashSet;
import java.util.Set;

public class GenomicRangeQuery {
    public int[] solution(String S, int[] P, int[] Q) {
        int[] res = new int[P.length];
        int[][] map = new int[S.length()+1][4];
        for (int i = 0; i< S.length(); i++){
            if (S.charAt(i) == 'A'){
                map[i+1][0] = 1;
            } else if (S.charAt(i) == 'C') {
                map[i+1][1] = 1;
            } else if (S.charAt(i) == 'G') {
                map[i+1][2] = 1;
            } else if (S.charAt(i) == 'T') {
                map[i+1][3] = 1;
            }
        }
        for (int i = 1; i < S.length(); i++){
            for (int j = 0; j <4; j++){
                map[i][j] += map[i-1][j];
            }
        }
        for (int i = 0; i< P.length; i++){
            int a = map[Q[i]+1][0] - map[P[i]][0];
            int c = map[Q[i]+1][1] - map[P[i]][1];
            int g = map[Q[i]+1][2] - map[P[i]][2];
            int t = map[Q[i]+1][3] - map[P[i]][3];
            if (a > 0) {
                res[i] = 1;
            }else if(c > 0){
                res[i] = 2;
            } else if (g>0) {
                res[i] = 3;
            } else if (t >0) {
                res[i] = 4;
            }
        }return res;
    }
}
