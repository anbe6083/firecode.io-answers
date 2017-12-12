// java.util.* has been imported for this problem.
// You don't need any other imports.

public static ArrayList<String> removeDuplicates(List<String> input) {
    ArrayList<String> result = new ArrayList<String>();
    HashMap<String, Integer> hm = new HashMap<String, Integer>();
    for(String entry: input) {
        if( !hm.containsKey( entry ) ) {
            hm.put( entry, 1 );
        } else {
            int count = hm.get( entry );
            count++;
            hm.put( entry , count);
        }
    }
    
    for(String entry: input) {
        int count = hm.get(entry);
        if(count == 1) {
            result.add(entry);
            count--;
        } else {
            count--;
            hm.put( entry, count-- );
        }
    }
    Collections.sort(result);
    return result;
}