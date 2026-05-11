package REcursionA;

// Q)Count total paths in maze to move from (0,0) to (n,m).(Condition you can only move in right or down).

public class CountPaths {
    public static int printCount(int i, int j, int n, int m){
        if(i == n || j == m){
            return 0;
        }
        if(i == n-1 && j == m-1){
            return 1;
        }
        // Move downward
        int downCount = printCount(i+1, j, n, m);
        // Move right
        int rightCount = printCount(i, j+1, n, m);

        return downCount + rightCount;
    }
    public static void main(String[] args) {
        int n = 3, m = 3;
        int totalCount = printCount(0, 0, n, m);
        System.out.println(totalCount);
    }
}
// 6