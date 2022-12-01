 import java.util.*;
 
 public class Loop {
    
    public static void main(String[] args){


        // for loop

        /*for(int counter=0;  counter<100;  counter=counter+1){
            System.out.println("hello world");

        }*/

        //example 2

        //counter++ = counter+1

        /*for(int counter=0;  counter<11;  counter++){
            System.out.println(counter);

        }*/

        //example 3
        

         /*for(int i=0;i <11; i++){
            System.out.println(i);
         }*/

         //using while loop


        /* int i=0;
         while (i<11){
            System.out.println(i);
            i=i+1;   //i++
         }*/


         //eample 4
         //do while loop

         /*int i=0;
         do{
        System.out.println(i);
        i++;
         }
         while(i<11);*/



         //example 5
         //print the sum of first n natural number
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        
        /*int sum=0;
        for(int i=0; i<n;i++){
            sum =sum+i;

        }
            System.out.println(sum);*/

            // print the table of any number

          for(int i=1; i<11;i++){
            System.out.println(i*n);
            
          }



         



    }
}
