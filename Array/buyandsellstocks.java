public class buyandsellstocks {
    public static int maxProfit(int a[]){
        int buy=a[0];
        int mp=Integer.MIN_VALUE;
        for(int i=1;i<a.length;i++){
            if(buy<a[i]){
                int cp=a[i]-buy;
                mp=Math.max(cp, mp);
            }
            else{
                buy=a[i];
            }

        }
        if (mp>0){
            return mp;
        }
        else{
            return 0;
        }
    }    
    public static void main(String[] args) {
        int a[]={7,6,4,3,1};
        int b[]={7,6,1,3,8};
        System.out.println(maxProfit(a));
        System.out.println(maxProfit(b));
    }
}
