public class insertionSort { 
    public static void sort(int a[]){
        for(int i=1;i<a.length;i++){
            int prev=i-1;
            int curr=a[i];
            while(prev>=0 && a[prev]>curr){
                a[prev+1]=a[prev];
                prev--;
            }
            a[prev+1]=curr;
        }
    }
    public static void main(String[] args) {
        int arr[]={5,3,4,1,2};
        sort(arr);
        for (int i=0;i<arr.length;i++){
        System.out.print(arr[i]);
    }
    System.out.println();
}
    
}
