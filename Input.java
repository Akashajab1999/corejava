import java.util.*;

public class Input {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        //String name= sc.next();
         //System.out.println(name);


        /*  int a=sc.nextInt();
         int b=sc.nextInt();
         int sum=a+b;
         System.out.println(sum);*/


         //example 2
         
         /*int age= sc.nextInt();

         if(age<18){
            System.out.println("you are adult");
         }
         else{
            System.out.println("you are not adult");
         }*/


         //example 3     CONDITIONAL STATEMENTS     IF ELSE


         /*int x= sc.nextInt();
         if(x % 2 == 0){
            System.out.println("Even number");

         }
         else{
            System.out.println("Odd number");
         }*/


         //example 4


         /*int a= sc.nextInt();
         int b=sc.nextInt16();

         if(a>b){
            System.out.println("a is greter than b");
         }
         else if(a==b){
            System.out.println("a is equal to b");
         }

         else{
            System.out.println("a is less than b");
         }*/


         //example 5     ELSE IF

         /*int button= sc.nextInt();
         if(button==1){
            System.out.println("Ram Ram");
         }
         else if(button==2){
            System.out.println("Namaste");
            
         }
         else{
            System.out.println("Invalid Button");
        }*/
              
        //SWITCH  BREAK

        int button= sc.nextInt();
        switch(button){
            case 1:System.out.println("Ram Ram");
            break;

            case 2:System.out.println("namste");
            break;

            case 3:System.out.println("invalid button");
        }

         
         
        
    
    }
    
}
