import java.util.Scanner;

public class incometax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your income");
        int sal=sc.nextInt();
        int tax;
        if(sal<500000){
            tax=0;
        }
        else if (sal>=500000 && sal<1000000){
            tax=(int) (sal*0.2);

        }
        else{
            tax=(int) (sal*0.3);
        }

        System.out.println("tax is : "+tax);
        sc.close();
    }
    
}
