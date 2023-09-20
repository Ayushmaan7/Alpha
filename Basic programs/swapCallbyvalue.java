public class swapCallbyvalue {
   public static void swap(int x,int y){
    int temp;
    temp=x;
    x=y;
    y=temp;

    System.out.println("a: "+ x);
    System.out.println("b: "+y);


   }
   
    public static void main(String[] args) {
        int a=10;
        int b=15;
        swap(a,b);
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
    
}
