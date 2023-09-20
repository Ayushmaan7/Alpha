import java.util.*;
public class LinearSearch{
    public static int search(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if (arr[i]==key){
                return i;
            }
            i++;
        }
        return -1;
    }
    public static void main(String[] args) {
        int a []=new int [10];
        int key;
        int id;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 10 numbers of your choice");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();

        }
        System.out.println("enter key to search");
        key=sc.nextInt();
        id=search(a, key);
        if(id==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("index no. is "+ id);
        }
        sc.close();
    }
}