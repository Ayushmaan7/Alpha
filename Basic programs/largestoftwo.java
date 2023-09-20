import java.util.Scanner;

public class largestoftwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        int a= sc.nextInt();
        int b = sc.nextInt();
        if (a>b){
            System.out.println(a+" is Largest");
        }
        else{
            System.out.println(b+" is Largest");

        }
        sc.close();

    }
    
}
