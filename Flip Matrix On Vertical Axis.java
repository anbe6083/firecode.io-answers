// java.util.* has been imported for this problem.
// You don't need any other imports.

public static void flipItVerticalAxis(int[][] matrix) {
    int rows = matrix.length - 1, cols = matrix[0].length - 1;
    for(int i = 0; i <= rows; i++) {
        for(int j = 0; j <= cols / 2; j++) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[i][cols - j];
            matrix[i][cols - j] = temp;
        }
    }
}