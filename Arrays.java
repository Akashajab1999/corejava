import java.util.*;

public class Arrays {
    public static void main(String[] args){

        /*int[] marks = new int[3];
        marks[0]=85;                                                //int marks[]={85,86,88};
        marks[1]=86;
        marks[2]=88;

        /*System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);*/

        /*for(int i= 0; i<3 ; i++){
            System.out.println(marks[i]);
        }*/

        
        //example 2
        
        
        /*Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[]= new int[size];

        //input
        
        for(int i=0;i<size ;i++){
            numbers[i]= sc.nextInt();
        }

        //output

        for(int i=0; i<size ;i++){
            System.out.println(numbers[i]);
        }*/


        //example 3
        // take an array as input from the user. search for a given x and print the index at which it occurs.


        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[]= new int[size];

        //input
        
        for(int i=0;i<size ;i++){
            numbers[i]= sc.nextInt();
        }

        int x = sc.nextInt();

        //output

        for(int i=0; i<numbers.length ;i++){
           
            if(numbers[i]==x)
                System.out.println("x found at index :" + i);
            }

        }
}
