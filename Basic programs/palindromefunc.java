public class palindromefunc {
    public static boolean isPalindrome(int x){
       int y=x;
       int rev=0;
        while(x>0){
            int ld=x%10;
            rev=rev*10+ld;
            x=x/10;

        }
        if(rev==y){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(131));
    }
}
