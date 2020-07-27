public class DecryptStringFromAlphabetToIntegerMapping {
    public static String freqAlphabets(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < chars.length; i++) {
            if(i + 2 < chars.length && chars[i + 2] == '#') {
                StringBuilder test = new StringBuilder();
                test.append(chars[i]);
                test.append(chars[i + 1]);
                sb.append(Character.toChars('a' + Integer.parseInt(test.toString()) - 1));
                i += 2;
            } else {
                sb.append(Character.toChars('a' + Integer.parseInt(String.valueOf(chars[i])) - 1));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(DecryptStringFromAlphabetToIntegerMapping.freqAlphabets("10#11#12"));
    }

}
