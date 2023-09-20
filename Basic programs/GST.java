import java.util.*;

public class GST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the price of pencil");
        float pencil= sc.nextFloat();
        System.out.println("enter the price of pen");
        float pen=sc.nextFloat();
        System.out.println("enter the price of eraser");
        float eraser=sc.nextFloat();
        float total=pen+pencil+eraser;
        double gst=(total*18)/100;
        System.out.println("total:"+total);
        System.out.println("gst:"+gst);
        double tp= total + gst;
        System.out.println("total payable amount:"+ tp);
        sc.close();

    }
    
}
