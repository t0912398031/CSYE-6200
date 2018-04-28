package test;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {
	public int uniqueMorseRepresentations(String[] words) {
        String[] MORSE = new String[]{".-","-...","-.-.","-..",".","..-.","--.",
                         "....","..",".---","-.-",".-..","--","-.",
                         "---",".--.","--.-",".-.","...","-","..-",
                         "...-",".--","-..-","-.--","--.."};

        Set<String> seen = new HashSet();
        for (String word: words) {
            StringBuilder code = new StringBuilder();
            for (char c: word.toCharArray()) {
            	
              code.append(MORSE[c - 'a']);
//            System.out.println(MORSE[c - 'a']);
//            System.out.println(c-'a');
            
            }
            
            seen.add(code.toString());
        }

        return seen.size();
    }
	public static void demo() {
		System.out.println("\n UniqueMorseCodeWords");
		UniqueMorseCodeWords umcw = new UniqueMorseCodeWords();
		String[] MORSE = new String[] {"bbb", "zen", "gig", "msg"};
		System.out.println(umcw.uniqueMorseRepresentations(MORSE));
		
	}
}
