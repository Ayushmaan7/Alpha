public class printSubArrays {
    public static void subarrays(int a[]){
        int ts=0;
        for(int i =0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(a[k]);
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(ts);
    }
    public static void main(String[] args) {
        int a[]={2,3,4,5,6};
        subarrays(a);
    }
}
