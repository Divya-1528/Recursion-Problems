//with the help of void -> at the time of stack build
// public class sum_of_digit {
//      static void sumOfDigit(int num,int sum){

//         if(num==0){
//             System.out.println(sum);
//             return;
//         }
//         int digit=num%10;
//          sum=sum+digit;
//          sumOfDigit(num/10, sum);

//     }
//     public static void main(String[] args) {
//         sumOfDigit(123,0 );
        
//     }
    
// }


//with the help of int-> at the time of stack fall
public class sum_of_digit {
    static int sumOfDigit(int num){
        if(num==0){

            return 0;
        }
       int sum= sumOfDigit(num/10);
       int digit=num%10;
       sum=sum+digit;
       return sum;
    }
    static void sumOfDigit(int num,int sum){

        if(num==0){
            System.out.println(sum);
            return;
        }
        
        int digit=num%10;
        sum=sum+digit;
        sumOfDigit(num/10, sum);
    }

   
   public static void main(String[] args) {
       System.out.println(sumOfDigit(123));
       
   }
   
}
