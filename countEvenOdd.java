// //void method
// public class countEvenOdd {

//     static void CountEvenOdd(int range,int even,int odd){
//         if(range==0){
//             System.out.println("Even Count "+ even +" Odd count "+odd);
//             return;
//         }
//         if(range%2==0){
//             even++;
//         }
//         else{
//             odd ++;
//         }
//          CountEvenOdd(range-1,even , odd);
        

//      }
//     public static void main(String[] args) {
        
//         CountEvenOdd(10,0,0);
//     }
// }


//int  method
public class countEvenOdd {

    static int[] CountEvenOdd(int range){
        if(range==0){
            int result[]=new int[2];
            return result;
        }
        int result[]=CountEvenOdd(range-1);
        if(range%2==0){
            result[0]=result[0]+1;
            
        }
        else{
            result[1]=result[0]+1;
            
        }
        return result;
    }


        static void CountEvenOdd(int range,int even,int odd){
                    if(range==0){
                        System.out.println("Even Count "+ even +" Odd count "+odd);
                        return;
                    }
                    if(range%2==0){
                        even++;
                    }
                    else{
                        odd ++;
                    }
                     CountEvenOdd(range-1,even , odd);
                    
            
                 }
                public static void main(String[] args) {
                    
                    CountEvenOdd(10,0,0);
                }
            }
         
        

     
   