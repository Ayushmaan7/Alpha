import java.util.Scanner;

public record argumentandreturntype() {
    public static int sum(int x ,int y){
        int sum=x+y;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        int a=sc.nextInt();
        System.out.println("enter b");
        int b=sc.nextInt();
        int sum=sum(a,b);
        System.out.println("sum is : "+sum);
        sc.close();
    }
}
