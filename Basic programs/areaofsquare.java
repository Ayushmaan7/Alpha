import java.util.Scanner;

public class areaofsquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the side of square");
        float s = sc.nextFloat();
        float area= s*s;
        System.out.println(area);
        sc.close();
        
    }
    
}
