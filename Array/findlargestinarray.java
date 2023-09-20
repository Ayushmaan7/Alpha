import java.util.*;

public class findlargestinarray {
    public static int largest(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
        }
        
    }
        return largest;
    }
    public static void main(String[] args) {
        int a []=new int [10];
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 10 numbers of your choice");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();

        }
        System.out.println("largest is "+ largest(a));
        sc.close();
    }

    
}
