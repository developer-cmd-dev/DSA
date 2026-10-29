package String;

public class RotateString {
    static void main() {

        String s = "abcde";
        String goal="cdeab";
        int rotation = 0;
        StringBuilder ans = new StringBuilder(s);

        while(rotation<s.length()){

            char temp = ans.charAt(0);

            for(int i=1;i<s.length();i++){
                ans.setCharAt(i-1,ans.charAt(i));
            }

            ans.setCharAt(s.length()-1,temp);
            System.out.println(ans);

            if(ans.toString().equals(goal)){
                System.out.println(true);
                break;
            }
            rotation++;


        }


    }
}
