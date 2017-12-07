// java.util.* has been imported for this problem.
// You don't need any other imports.

public static double pow(double x, int n) {
    if(n < -1) return 1/x * pow(x, n+1);
    if(n == -1) return 1/x;
    if(n == 0) return 1;
    if(n == 1) return x;
    return x * pow(x, n-1);
}