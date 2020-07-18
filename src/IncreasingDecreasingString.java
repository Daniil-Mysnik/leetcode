public class IncreasingDecreasingString {
    public static String sortString(String s) {
        StringBuilder newS = new StringBuilder();
        int[] chars = new int[26];
        int length = chars.length - 1;
        for(int i = 0; i < s.length(); i++) {
            chars[(int) s.charAt(i) - 97] ++;
        }
        while (s.length() != newS.length()) {
            for(int i = 0; i <= length; i++) {
                if(chars[i] != 0) {
                    newS.append(Character.toChars (i + 97));
                    chars[i] --;
                }
            }
            for(int i = 0; i <= length; i++) {
                if(chars[length - i] != 0) {
                    newS.append(Character.toChars (length - i + 97));
                    chars[length - i] --;
                }
            }
        }
        return newS.toString();
    }

    public static void main(String[] args) {
        System.out.println(IncreasingDecreasingString.sortString("jcdlgiszuuzsigldcj"));
    }

}
