// java.util.* has been imported for this problem.
// You don't need any other imports.

public static boolean isAnagram(String input1, String input2) {
    if(input1 == null && input2 == null) return false;
    if(input1 == null || input2 == null) return false;
    int[] numOfChars = new int[256];
    if(input1.length() != input2.length() ) return false;
    for(int i = 0; i < input1.length(); i++ ) {
        numOfChars[input1.charAt(i) % 256]++;
    }
    for(int i = 0; i < input2.length(); i++ ) {
        numOfChars[input2.charAt(i) % 256]--;
    }
    
    for(int i = 0; i < numOfChars.length; i++) {
        if(numOfChars[i] != 0) return false;
    }
    return true;
}