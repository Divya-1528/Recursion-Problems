public class factorial {
    public static int calcfact(int n){
        if(n==1){
            return 1;
        }
        int fact=calcfact(n-1);
        int fact_n=n*fact;
        return fact_n;
    }
    public static void main(String[] args) {
        
        int n=5;
        int result=calcfact(n);
        System.out.println(result);
    }
    
}