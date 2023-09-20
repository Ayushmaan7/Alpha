import java.util.Scanner;

public class sumofevenodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int rem;
        int even=0;
        int odd=0;
        while(n>0){
            rem=n%10;
            n=n/10;
            if(rem%2==0){
                even=even+rem;
            }
            else{
                odd=odd+rem;
            }


            }
            System.out.println(odd);
            System.out.println(even);
            sc.close();
        }
    }
    

