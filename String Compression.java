public static String compressString(String text) {
    if(text== null || text==" " || text.length() == 1 ) return text;
    StringBuilder result = new StringBuilder();
    TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();
    for(int i = 0; i < text.length(); i++ ) {
        if(!tm.containsKey( text.charAt(i) )) {
            tm.put( text.charAt(i), 1 );
        } else {
            int count = tm.get( text.charAt(i) );
            count++;
            tm.put( text.charAt(i), count );
        }
    }
    
    for(Map.Entry<Character, Integer> entry: tm.entrySet()) {
        char key = entry.getKey();
        int value = entry.getValue();
        result.append( key );
        if(value > 1) {
            result.append( value );
        }
        
    }
    return result.toString();
}