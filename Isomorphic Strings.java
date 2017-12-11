// java.util.* has been imported for this problem.
// You don't need any other imports.

public static boolean isIsomorphic(String input1, String input2) {
    if(input1 == null && input2 == null)
        return true;
    if( input1 == null || input2 == null )
        return false;
    if( input1.length() != input2.length() )
        return false;
    HashMap<Character, Integer> hm1 = new HashMap<Character, Integer>();
    HashMap<Character, Integer> hm2 = new HashMap<Character, Integer>();
    for(int i = 0; i < input1.length(); i++ ) {
        char input1Char = input1.charAt(i);
        if( !hm1.containsKey( input1Char ) ) {
            hm1.put( input1Char, 1 );
        } else {
            int count = hm1.get( input1Char );
            count++;
            hm1.put( input1Char, count );
        }
    }
    
    for(int i = 0; i < input2.length(); i++ ) {
        char input2Char = input2.charAt(i);
        if( !hm2.containsKey( input2Char ) ) {
            hm2.put( input2Char, 1 );
        } else {
            int count = hm2.get( input2Char );
            count++;
            hm2.put( input2Char, count );
        }
    }
    
    for(int i = 0; i < input1.length(); i++ ) {
        int input1Count = hm1.get( input1.charAt(i) );
        int input2Count = hm2.get( input2.charAt(i) );
        if( input1Count != input2Count )
            return false;
    }
    return true;
}