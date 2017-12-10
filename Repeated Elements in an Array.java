// java.util.* has been imported for this problem.
// You don't need any other imports.

public static String duplicate(int[] numbers){
    if(numbers == null) return null;
    
    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    ArrayList<Integer> result = new ArrayList<Integer>();
    for(int i = 0; i < numbers.length; i++) {
        if(!hm.containsKey(numbers[i]) ) {
            hm.put( numbers[i], 1 );
        } else {
            int count = hm.get( numbers[i] );
            count++;
            hm.put( numbers[i], count );
        }
    }
    
    for(int i = 0; i < numbers.length; i++) {
        int count = hm.get(numbers[i]);
        if(count > 1 && !result.contains(numbers[i]) ) {
            result.add( numbers[i] );
        }
    }
    return result.toString();
    
}