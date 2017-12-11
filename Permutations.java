// java.util.* has been imported for this problem.
// You don't need any other imports.

public static boolean permutation(String str1, String str2) {
    if( str1 == null && str2 == null )
        return true;
    else if(str1 == null || str2 == null)
        return false;
    if( str1.length() != str2.length() )
        return false;
    else {
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        for(int i = 0; i < str1.length(); i++) {
            if( !hm.containsKey( str1.charAt(i)) ) {
                hm.put( str1.charAt(i), 1 );
            } else {
                int count = hm.get( str1.charAt(i) );
                count++;
                hm.put( str1.charAt(i), count );
            }
        }
        
        for(int i = 0; i < str2.length(); i++ ) {
            if( !hm.containsKey( str2.charAt(i) ) ) {
                return false;
            } else {
                int count = hm.get( str2.charAt(i) );
                if( count <= 0 )
                    return false;
                count--;
                hm.put( str2.charAt(i), count );
            }
        }
        return true;
    }
}