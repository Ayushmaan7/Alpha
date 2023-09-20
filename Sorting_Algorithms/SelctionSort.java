public class SelctionSort {
    public static void sort(int a[]){
        for (int i=0;i<a.length-1;i++){
            int min=i;
             for (int j=i+1;j<a.length;j++){
                if(a[min]>a[j]){
                    min=j;
                }
                
                }
                int temp=a[min];
                a[min]=a[i];
                a[i]=temp;

        }
    }
    public static void main(String[] args) {
        int arr[]={3,4,1,2,5};
        sort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    
}
