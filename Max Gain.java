// java.util.* has been imported for this problem.
// You don't need any other imports.

public static int maxGain(int[] a) {
    if(a == null) 
        return 0;
    int maxGain = 0, minElem = Integer.MAX_VALUE;
    for(int i = 0; i < a.length; i++) {
        if( a[i] < minElem )
            minElem = a[i];
        if( a[i] > minElem ) {
            int currGain = a[i] - minElem;
            if( Math.abs(currGain) > Math.abs(maxGain) )
                maxGain = currGain;
        }
    }
    return Math.abs(maxGain);
}