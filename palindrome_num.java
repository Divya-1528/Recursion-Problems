public class palindrome_num {
    static void palindromeNum(int num,int reverse,int cpy){
        if(num==0){
            System.out.println(reverse==cpy?"palindrome num":"not palindrome");
            return;
        }
        int digit=num%10;
        reverse=reverse*10+digit;
        palindromeNum(num/10, reverse, cpy);
    }
    public static void main(String[] args) {
        int num=11411;
        int cpy=num;
        palindromeNum(num,0, cpy);
    }

    
}
