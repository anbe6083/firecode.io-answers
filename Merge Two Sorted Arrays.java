// java.util.* has been imported for this problem.
// You don't need any other imports.

public static int[] merge(int[] arrLeft, int[] arrRight){
    int leftPtr = 0, rightPtr = 0, resultPtr = 0;
    int[] result = new int[arrLeft.length + arrRight.length ];
    while( leftPtr < arrLeft.length && rightPtr < arrRight.length ) {
        if( arrLeft[leftPtr] < arrRight[rightPtr] ) {
            result[resultPtr++] = arrLeft[leftPtr++];
        } else {
            result[resultPtr++] = arrRight[rightPtr++];
        }
    }
    while( leftPtr < arrLeft.length ) {
        result[resultPtr++] = arrLeft[leftPtr++];
    }
    while( rightPtr < arrRight.length ) {
        result[resultPtr++] = arrRight[rightPtr++];
    }
    return result;
}