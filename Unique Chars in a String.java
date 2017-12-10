// java.util.* has been imported for this problem.
// You don't need any other imports.

public static boolean areAllCharactersUnique(String str){
    if(str == null || str == " ") return true;
    HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
    for(int i = 0; i < str.length(); i++ ) {
        if(!hm.containsKey( str.charAt(i) )) {
            hm.put( str.charAt(i), 1 );
        } else {
            return false;
        }
    }
    return true;
}