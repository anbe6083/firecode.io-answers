// java.util.* has been imported for this problem.
// You don't need any other imports.

public static void flipItVerticalAxis(int[][] matrix) {
    int m = matrix.length - 1, n = matrix[0].length - 1;
    for(int i = 0; i <= m; i++) {
        for(int j = 0; j <= n / 2; j++) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[i][n - j];
            matrix[i][n - j] = temp;
        }
    }
}