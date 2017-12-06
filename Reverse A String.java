/*
Edge case: str can be null
*/
public static String reverseString(String str){
    if(str == null) return null;
    String inputString = str;
    StringBuilder result = new StringBuilder();
    for(int i = str.length() - 1; i >= 0; i--) {
        result.append(str.charAt(i));
    }
    
    
    return result.toString();
}