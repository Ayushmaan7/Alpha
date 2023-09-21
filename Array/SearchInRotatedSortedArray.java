public class SearchInRotatedSortedArray{
    public static int search(int a[],int key){
        int start=0;
        int end=a.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(a[mid]==key){
                return mid;
            }
            if(a[start]<a[mid]){
                if(a[start]<=key && key<a[mid]){
                    end=mid-1;

                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(a[mid]<key && key<=a[end]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        
        }
        return -1;

    }
    public static void main(String args[]){
        int a[]={4,5,6,7,0,1,2};
        int key=3;
        System.out.println(search(a, key));

    }
}