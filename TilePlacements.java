package REcursionA;

public class TilePlacements {
    public static int printTiles(int n, int m){
        if(n == m){
            return 2;
        }
        if(n < m){
            return 1;
        }
        //Vertically
        int vertPlacements = printTiles(n-m, m);
        //Horizontally
        int horPlacements = printTiles(n-1, m);

        return vertPlacements + horPlacements;
    }
    public static void main(String[] args) {
        int n = 4, m = 2;
        System.out.println(printTiles(n, m));
    }
}
// 5
