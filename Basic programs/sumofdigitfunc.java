public class sumofdigitfunc {
    public static int sumdigit(int x){
        int sum=0;
        while(x>0){
            int ld=x%10;
            sum=sum+ld;
            x=x/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("sum of digit of number 6789 is: "+sumdigit(6789));
    }
    
}
