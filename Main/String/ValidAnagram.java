package String;

import java.util.Arrays;

public class ValidAnagram {
    static void main() {
        String s = "anagram";
        String t = "nagaram";

        char[] s1 = s.toCharArray();
        Arrays.sort(s1);
        char[] t1 = t.toCharArray();
        Arrays.sort(t1);

        String ans1 = new String(s1);
        String ans2 = new String(t1);

        System.out.println(ans1.equals(ans2));
    }
}
