// java.util.* has been imported for this problem.
// You don't need any other imports.

public static Boolean isIntPalindrome(int x) {            
    if(x < 0) return false;
    int reverse = 0;
    int num = x;
    while(x > 0) {
        int remainder = x % 10;
        reverse = reverse * 10 + remainder;
        x /= 10;
    }
    return reverse == num;
}