package String;

import java.util.ArrayList;
import java.util.List;

public class ReverseString {
    static void main() {
    List<Character> s = new ArrayList<>(List.of('h','e','l','l','o'));
    reverseString(s);
    }

    static void reverseString(List<Character> s){
        int n= s.size();
        for(int i=0;i<n;i++){
            char temp = s.get(n-i-1);
            s.set(n-i-1,s.get(i));
            s.set(i,temp);
        }

        System.out.println(s);

    }
}
