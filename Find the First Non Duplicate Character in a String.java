/*
* Edge cases: String is empty or string is null
* Description: use a hashmap to store a key, value pair for each character and its count.
* Loop over the string once to input the count. Once completed, loop over
* the string again. Return the first character that has a count of one.
* if there's none, just return null.
*/
public static Character firstNonRepeatedCharacter(String str) {
    if(str == null || str == " " ) return null;
    HashMap<Character, Integer> hm = new HashMap<>();
    for(int i = 0; i < str.length(); i++ ) {
        if( !hm.containsKey(str.charAt(i)) ) {
            hm.put( str.charAt(i), 1 );
        } else {
            int count = hm.get( str.charAt(i) );
            count++;
            hm.put( str.charAt(i), count );
        }
    }
    for(int i = 0; i < str.length(); i++ ) {
        if( hm.get( str.charAt(i) ) == 1  ) {
            return str.charAt(i);
        }
    }
    return null;
}