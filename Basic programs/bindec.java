public class bindec {
    public static void bintodec(int x){
        int mynum=x;
        int ld=0;
        int pow=0;
        int dec=0;
        while(x>0){
            ld=x%10;
            dec=dec+(ld*(int)Math.pow(2, pow));
            pow++;
            x=x/10;
        }
        System.out.println("decimal of"+mynum+"="+dec);
    }
     public static void dectobin(int x){
        int mynum=x;
        int ld=0;
        int pow=0;
        int bin=0;
        while(x>0){
            ld=x%2;
            bin=bin+(ld*(int)Math.pow(10, pow));
            pow++;
            x=x/2;
        }
        System.out.println("binary of "+mynum+"="+bin);
    }
    public static void main(String[] args) {
        bintodec(111);
        dectobin(7);
    }
}
