public class subarrayssum {
    public static void maxsubarrayssum(int a[]){
        int cs;
        int ms=Integer.MIN_VALUE;
        for(int i =0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                cs=0;
                for(int k=i;k<=j;k++){
                    cs+=a[k];
                }
                
                System.out.println(cs);
                if(cs>ms){
                    ms=cs;
                    
                }
            }
            System.out.println();
        }
        System.out.println(ms);
    }
    public static void main(String[] args) {
        int a[]={2,3,4,5,6};
        maxsubarrayssum(a);
    }
    
}
