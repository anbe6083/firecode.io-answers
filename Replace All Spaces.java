// java.util.* has been imported for this problem.
// You don't need any other imports.

public static String replace(String a, String b) {
    if(a == null) return null;
    String[] strArr = a.split(" ");
    return String.join(b, strArr);
}