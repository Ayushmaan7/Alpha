public class trappingRainwater {
   public static int trappedwater(int a[]){
    int water=0;
    int n=a.length;
    int lm[]=new int[n];
    int rm[]=new int[n];
    lm[0]=a[0];
    rm[n-1]=a[n-1];
    for (int i=1;i<n;i++){
        if(a[i]>lm[i-1]){
            lm[i]=a[i];
        }
        else{
            lm[i]=lm[i-1];
        }
    }
    for (int i=n-2;i>=0;i--){
        if(a[i]>rm[i+1]){
            rm[i]=a[i];
        }
        else{
            rm[i]=rm[i+1];
        }
        
    }
    for(int i=0;i<n;i++){
        water+=(Math.min(lm[i],rm[i]))-a[i];
    }
    return water;
    
  }
    public static void main(String[] args) {
        int a[]={4,2,0,6,3,2,5};
        System.out.println(trappedwater(a));
    }
    
}
