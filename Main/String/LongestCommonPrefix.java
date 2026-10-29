package String;

import java.util.Arrays;

public class LongestCommonPrefix {
    static void main() {
        String[] str = {"flowers" , "flow" , "fly", "flight" };
//        String[] str = {"dog" , "cat" , "animal", "monkey"  };

        Arrays.sort(str);

        char[] first = str[0].toCharArray();
        char[] last = str[str.length-1].toCharArray();

        String ans = "";
        for (int i = 0; i <first.length ; i++) {
            if(first[i] != last[i]) break;

            ans+=first[i];
        }

        System.out.println(ans);


    }


}
