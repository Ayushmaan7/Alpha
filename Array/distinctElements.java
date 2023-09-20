import java.util.Scanner;

public class distinctElements {
    public static boolean distinctValues(int a[]){
        for(int i=0;i<a.length-1;i++){
            int x=a[i];
            for (int j=i+1;j<a.length;j++){
                if(x==a[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many numbers do you want to enter:  ");
        int x= sc.nextInt();
        System.out.println("enter "+ x + " numbers");
        int a[]=new int[x];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        } 
        sc.close();
        if(distinctValues(a)){
            System.out.println("find duplicate value");
        }
        else{
            System.out.println("no duplicate value");
        }
    }
    
}
