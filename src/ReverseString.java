public class ReverseString {
    public static char[] reverseString(char[] s) {
        for(int i = 0; i < s.length/2; i++) {
            char c = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = c;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(ReverseString.reverseString(new char[] {'h', 'e', 'l', 'l', 'o'}));
    }

}
