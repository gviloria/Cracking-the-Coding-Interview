/* Time Complexity  :  O(n) where n is the length of the string
   Space Complexity :  O(n + 2s) n is the size of the string
                                 s is the number of spaces we multiplied by two */

public class URLify {

    public static String URLify(String s){
        int space_count = 0;
        /* Count number of spaces in the string to determine how
           much space we need in our new character array. */
        for (char c : s.toCharArray()){
            if(c == ' '){
                space_count++;
            }
        }
        /* Example:
           Original - "Mr Brightside"   (size 13)
           After    - "Mr%20Brightside" (size = 13 + (1*2) => 15) */
        char[] ch = new char[s.length()+(space_count * 2)];

        int original_ite = 0;
        for (int i=0;i<ch.length;i++){
            /* If we encounter a space insert "%20" and
               increment i by 2, so the values don't get overwritten. */
            if (s.charAt(original_ite) == ' '){
                ch[i] = '%';   // i + 1
                ch[i+1] = '2'; // i + 1
                ch[i+2] = '0'; // i + 1 (from for loop)
                i+=2;          // So only increment by 2
            } else {
                /* Otherwise, just copy the characters from the string
                   over to the character array. */
                ch[i] = s.charAt(original_ite);
            }
            original_ite++;
        }
        /* Do not use ch.toCharArray(), it will return
           the address of the character array instead.
           So wrap the array within a String object */
        return new String(ch);
    }
}
