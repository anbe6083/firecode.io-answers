// java.util.* has been imported for this problem.
// You don't need any other imports.

public static int betterFibonacci(int n) {
    if(n == 0) return 0;
    if(n == 1 || n == 2) return 1;
    int last = 1, secToLast = 1;
    int current = 0;
    for(int i = 3; i <= n; i++) {
        current = last + secToLast;
        secToLast = last;
        last = current;
    }
    return current;
}