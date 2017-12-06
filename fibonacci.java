// java.util.* has been imported for this problem.
// You don't need any other imports.

public static int fib(int n) {
    if(n == 0) return 0;
    if(n == 1 || n == 2) return 1;
    return fib(n - 1) + fib(n - 2);
}