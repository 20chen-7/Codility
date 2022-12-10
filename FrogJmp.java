public class FrogJmp {
    public int solution(int X, int Y, int D){
        if (Y <= X){
            return 0;
        }
        int ceil = 0;
        if ((Y-X)%D != 0){
            ceil = 1;
        }
        return Math.floorDiv((Y-X), D) + ceil;
    }
}
