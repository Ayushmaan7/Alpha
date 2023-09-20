public class kadanes {
    public static void sum(int a[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            cs=cs+a[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(ms, cs);
        }
        System.out.println(ms);
    }
    public static void main(String[] args) {
        int a[]={-2,-3,4,-5,6,1,-2,1,-7};
        sum(a);
    }
    
}
