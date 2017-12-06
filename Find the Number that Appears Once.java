// java.util.* has been imported for this problem.
// You don't need any other imports.

public static int singleNumber(int[] A) {
    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    for(int i = 0; i < A.length; i++) {
        if(!hm.containsKey(A[i]) ) {
            hm.put( A[i], 1 );
        } else {
            int count = hm.get( A[i] );
            count++;
            hm.put( A[i], count );
        }
    }
    
    for(int i = 0; i < A.length; i++) {
        if(hm.get(A[i]) == 1) return A[i];
    }
    return -1;
}