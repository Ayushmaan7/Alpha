public class pairsInArray{
    public static void pairs(int a[]){
        for(int i=0;i<a.length;i++){
            int curr=a[i];
            for(int j=i+1;j<a.length;j++){
                System.out.print("("+curr+","+a[j]+")");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int a[]={2,3,4,5,6};
        pairs(a);
    }
}