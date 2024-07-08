public class PowerRec {

    //void method building stack
    
//     static void computePower(int num,int pow,int result){
//         if(pow==0){
//             System.out.println(result);
//             return;
//         }
//         computePower(num, pow-1, num*result);
//     }
//     public static void main(String[] args) {
//         computePower(2, 3,1 );
//     }




    //int method falling stack
    
    
    static int computePower(int num,int pow){

        if(pow==1){
            return num;

        }
        int result=computePower(num, pow-1);
        return result*num;
        
    }
        static void computePower(int num,int pow,int result){
            if(pow==0){
                System.out.println(result);
                return;
            }
            computePower(num, pow-1, num*result);

        }
    
    public static void main(String[] args) {
        int r= computePower(2, 5 );
        System.out.println(r);
    }
}

