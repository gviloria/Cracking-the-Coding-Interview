// Time Complexity  :  O(n) where n is the length of the string
// Space Complexity :  O(1) we're always dealing with 128 possible ASCII values.

public class isUnique {

    public static boolean isUnique(String s){
        boolean[] table = new boolean[128];
        for(int i = 0; i < s.length(); i++) {
            int c = s.charAt(i);
            if (table[c]) {
                return false;
            } else {
                table[c] = true;
            }
        }
        return true;
    }
}
