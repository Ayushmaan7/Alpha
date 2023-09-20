import java.util.Scanner;

public class avg {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three number which you want to know average of :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        double average=(a+b+c)/3;
        System.out.println(average);
        sc.close();

    }
    
}
