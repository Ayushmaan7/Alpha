public class prefixsum {
    public static void sum(int a[]){
        int cs;
        int ms=Integer.MIN_VALUE;
        int prefix[]=new int[a.length];
        prefix[0]=a[0];
        for (int i=1;i<a.length;i++){
            prefix[i]=prefix[i-1]+a[i];
        }
        for(int i =0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                
                cs=i==0?prefix[j]:prefix[j]-prefix[i-1];
                
                if(cs>ms){
                    ms=cs;
                    
                }
            }
            System.out.println();
        }
        System.out.println(ms);
    }
    public static void main(String[] args) {
        
        int a[]={1,-2,6,-1,3};
        
        sum(a);
    }
}
