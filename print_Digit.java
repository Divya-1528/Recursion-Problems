public class print_Digit{
     static void printDigit(int num){
        if(num==0){
            return;
        }
        //small problem
        printDigit(num/10);
        //post-processing(at the time of fall)
        System.out.println(num%10);

    }
    
    public static void main(String[] args) {
        printDigit(12345);
        }
}