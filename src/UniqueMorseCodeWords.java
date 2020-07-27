import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {
    public static int uniqueMorseRepresentations(String[] words) {
        String[] alphabet = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        for(String s : words) {
            char[] word = s.toCharArray();
            StringBuilder sb = new StringBuilder();
            for(char c : word) {
                sb.append(alphabet[c - 'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }

    public static void main(String[] args) {
        System.out.println(UniqueMorseCodeWords.uniqueMorseRepresentations(new String[] {"gin", "zen", "gig", "msg"}));
    }

}
