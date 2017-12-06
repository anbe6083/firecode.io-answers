/*
Edge cases: str is empty, null or has 1 character. If these are true, just return true

Description: Uses two pointers, first and last. If at any point neither of these pointers equal each other, return false
else, return true. 
*/
public static boolean isStringPalindrome(String str){
    if(str == null || str==" " || str.length() == 1) return true;
    int first = 0, last = str.length() - 1;
    while( first < last ) {
        if( str.charAt(first) != str.charAt(last) ) return false;
        first++;
        last--;
    }
    return true;
}