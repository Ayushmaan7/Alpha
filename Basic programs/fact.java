public class fact {
    public static int factorial(int x){
        int fac=1;
        for (int i=1;i<=x;i++){
            fac=fac*i;
        }
        return fac;
    }
    public static void main(String args[]){
        int a=3;
       System.out.println(factorial(a)); 

    }
}
