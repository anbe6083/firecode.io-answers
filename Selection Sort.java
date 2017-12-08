// java.util.* has been imported for this problem.
// You don't need any other imports.

public static int[] selectionSortArray(int[] arr){
    for(int i = 0; i < arr.length - 1; i++) {
        int smallestIndex = i;
        for(int j = i + 1; j < arr.length; j++) {
            if(arr[j] < arr[smallestIndex]){ 
                smallestIndex = j;
            };
        }
        int temp = arr[i];
        arr[i] = arr[smallestIndex];
        arr[smallestIndex] = temp;
    }
    return arr;
}