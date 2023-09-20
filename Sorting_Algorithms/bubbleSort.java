public class bubbleSort{
    public static void sort(int a[]){
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
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