import java.util.*;

public class binarySearch {
    public static int search(int a[],int key){
        int si=0;
        int ei=a.length-1;
        while(si<=ei){
            int mid = (si+ei)/2;
        if (a[mid]==key){
            return mid;

        }
         else if(a[mid]<key){
        si=mid+1;
        }
        else{
            ei=mid-1;
        }

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

    

