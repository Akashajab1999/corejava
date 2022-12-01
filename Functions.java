import java.util.*;
public class Functions {
    
    /*public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String name = sc.next();
        printMyName(name); 
        
        //call kiya function ko
    }*/


        //calculateSum of two numbers
    /*public static int calculateSum(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();


        int sum  = calculateSum(a, b);
        System.out.println("sum of 2 numbers"+ sum);
     }*/


     //make a function to multiply 2 numbers and return the product
    //example no 2

     /*public static int calculateProduct(int a,int b){
        return a*b ;
     }
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();

        System.out.println("product of two numbers " + calculateProduct(a, b));
     }*/


     //example no 3
     // find the factorial of a number 


     public static void printFactorial(int n){

        //loop
        if(n<0){
            System.out.println("Invalid Number");
        }

        int factorial=1;

        for(int i=n; i>=1;i--){
            factorial=factorial*i;

        }
        System.out.println(factorial);
        return;
     }
      
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        printFactorial(n);
     }

}
