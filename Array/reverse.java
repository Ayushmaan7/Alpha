import java.util.Scanner;

public class reverse {
    public static void rev(int a[]){
        int tmp;
        int start=0;
        int last=a.length-1;
        while(start<last){
            tmp=a[last];
            a[last]=a[start];
            a[start]=tmp;

            start++;
            last--;
        }
    }
    public static void main(String[] args) {
        int a []=new int [10];
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 10 numbers of your choice");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();

        }
        sc.close();
        rev(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");

        }
        

    }    
    
}
