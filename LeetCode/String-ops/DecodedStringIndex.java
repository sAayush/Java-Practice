public class DecodedStringIndex {
    public String decodeAtIndex(String s, int k) {
        long length = 0; // initialize length to 0
        int i = 0; // initialize i to 0

        // calculate the length of the decoded string
        while (length < k) {        
            if (Character.isDigit(s.charAt(i))) { // if the current character is a digit
                length *= s.charAt(i) - '0'; // multiply length by the digit value
            } else { // if the current character is a letter
                length++; // increment length
            }
            i++; // move to the next character
        }

        // decode the string backwards
        for (int j = i - 1; j >= 0; j--) {
            if (Character.isDigit(s.charAt(j))) { // if the current character is a digit
                length /= s.charAt(j) - '0'; // divide length by the digit value
                k %= length; // set k to the remainder of k divided by length
            } else { // if the current character is a letter
                if (k == 0 || k == length) { // if k is at the beginning or end of the decoded string
                    return Character.toString(s.charAt(j)); // return the current character
                }
                length--; // decrement length
            }
        }

        return ""; // return an empty string if k is out of bounds
    }

    public static void main(String[] args) {
        DecodedStringIndex dsi = new DecodedStringIndex();
        String s = "leet2code3";
        int k = 1;
        System.out.println(dsi.decodeAtIndex(s, k));
    }
}