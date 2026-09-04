void main() {

    String str = "Madam";

    str = str.toUpperCase();

   char[] chars = str.toCharArray();

    System.out.println(checkPalindrome(0,chars.length,chars));




}



boolean checkPalindrome(int i,int n,char[] s){
    if(i>=n/2){
        return true;
    }
    if(s[i]!=s[n-i-1])return false;
     else return checkPalindrome(i+1,n,s);
}