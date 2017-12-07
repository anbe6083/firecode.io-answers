// java.util.* has been imported for this problem.
// You don't need any other imports.

public static String insertPairStar(String s) {
    if(s == null || s.length() == 1 || s==" ") return s;
    if(s.charAt(0) == s.charAt(1)){
        return s.substring(0,1) + "*" + insertPairStar(s.substring(1, s.length()));
        
    }else {
        return s.substring(0,1) + insertPairStar(s.substring(1, s.length()) );
    }
}