public static boolean isPowOfTwo(int num) {
    if(num < 2) return true;
    if(num % 2 != 0) return false;
    else {
        return isPowOfTwo(num / 2);
    }
    
}