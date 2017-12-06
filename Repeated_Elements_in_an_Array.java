/*
    Treeset is used so that a treeset will automatically put the elements in order
*/


public static String duplicate(int[] numbers){
    if(numbers == null) return null;
    TreeSet<Integer> ts = new TreeSet<>();
    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    for(int i = 0; i < numbers.length; i++) {
        if(!hm.containsKey(numbers[i])  ) {
            hm.put( numbers[i], 1 );
        } else {
            ts.add(numbers[i]);
        }
    }
    return ts.toString();
}