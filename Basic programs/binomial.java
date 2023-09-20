public class binomial {
    public static int factorial(int x){
        int fac=1;
        for (int i=1;i<=x;i++){
            fac=fac*i;
        }
        return fac;
    }
    public static double bincoef(int n,int r){
        int nfac=factorial(n);
        int rfac=factorial(r);
        int nmrfac=factorial(n-r);
        return nfac/(rfac*nmrfac);
    }
    public static void main(String[] args) {
      System.out.println(bincoef(5, 3));  
    }
    
}
