// java.util.* has been imported for this problem.
// You don't need any other imports.

public static int[] bubbleSortArray(int[] arr){
    boolean swapped = true;
    while(swapped) {
        swapped = false;
        for(int i = 0; i < arr.length - 1; i++) {
            if( arr[i] > arr[i + 1] ) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                swapped = true;
            }
        }
    }
    return arr;
}