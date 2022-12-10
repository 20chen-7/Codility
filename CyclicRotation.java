
public class CyclicRotation {
    public int[] CyclicRotation(int[] A, int K){
        int[] a = new int[A.length];
        for (int i = 0; i < A.length; i++){
            int pos = (i+K)%A.length;
            a[pos] = A[i];
        }
        return a;
    }
}
