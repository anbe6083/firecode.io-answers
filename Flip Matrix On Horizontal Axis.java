/*
* We want to flip it on the vertical axis, so we have to divide the columns by two. 
For every row, flip the elements until we reach the middle column. Then the matrix is flipped. 
*/
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