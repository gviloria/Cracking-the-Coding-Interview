
// Time Complexity  :  O(n) where n is the length of either of the strings.
// Space Complexity :  O(1) we're always dealing with 128 possible ASCII values.

public class checkPermutation {

    public static boolean checkPermutation(String one, String two){
        int length_one = one.length();
        int length_two = two.length();
        
        /* If they don't have the same length, they can't possibly be
           permutations of each other. */
        if (length_one != length_two) {
            return false;
        }

        /* We iterate through one string and add the counts of each
           character into the array. When we iterate through the second
           string, we subtract. */
        int[] counts = new int[128];

        /* toCharArray() is a O(N) operation.
           Initializing it as a character array before the for loop is the
           same as initializing it like below. */
        for (char c : one.toCharArray()) {
            counts[c]++;
        }
        for (int i=0;i<two.length();i++) {
            // charAt() is a O(1) operation.
            int c = two.charAt(i);
            counts[c]--;
            if (counts[c] < 0) {
                return false;
            }
        }
        return true;
    }
}
