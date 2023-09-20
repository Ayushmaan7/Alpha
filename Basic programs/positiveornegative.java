import java.util.Scanner;

public class positiveornegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int a= sc.nextInt();
        if (a>=0){
            System.out.println("number is positive");
        }
        else{
            System.out.println("number is negative");
        
        }
        sc.close();
    }
    
}
