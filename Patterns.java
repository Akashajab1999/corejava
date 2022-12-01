public class Patterns {
    public static void main(String[] args){
        
        //print the solid rectangle
        //*****
        //*****
        //*****
        //*****
        
        /*int x=4;
        int y=5;
         //outer looop
        for(int i=1; i<=x; i++){
            for(int j=1;j<=y;j++){
             //inner loop
                System.out.print("*");
            }
            System.out.println();
        }*/



        //print the pattern
        //***** 
        //*   *
        //*   *
        //***** 

                                                                                   //rows=outer loop
                                                                                   //colom=inner loop
        
         /*int x=4;
         int y=5;
         for(int i=1;i<=x;i++){
            for(int j=1;j<=y;j++){
                if(i==1 || j==1 || i==x || j==y){
                System.out.print("*");
            }else {
                System.out.print(" ");
             }
          } 
          System.out.println();                                                                         

       }*/
       

       //print the half piramid
       //* 
       //**
       //*** 
       //**** 

       /*int n=4;
       //outer loop
       for(int i=1; i<=n ;i++) {

        //inner loop
        for(int j=1 ; j<=i ;j++){
            System.out.print("*");
        }
        System.out.println();
       }*/

        //print the following pattern
        //****
        //*** 
        //** 
        //* 

       /*int n=4;
       //outer loop
       for(int i=n; i>=1 ;i--) {

        //inner loop
        for(int j=1 ; j<=i ;j++){
            System.out.print("*");
        }
        System.out.println();
       }*/



       //print the pattern 
       //   *
       //  **
       // ***
       //**** 

       
       /*int n=4;
       for(int i=1 ; i<=n ;i++){
        for(int j=1 ; j<=n-i ; j++){
            System.out.print(" ");
        }
       
       for(int j=1; j<=i ; j++){
        System.out.print("*");
       }
       System.out.println();

       }*/



       //half piramid with numbers
       //1
       //12
       //123
       //1234
       //12345


       /*int n= 5;
       //outer loop
       for(int i=1 ; i<=n ;i++){
        for(int j=1; j<=i; j++){
            System.out.print(j+" ");
        }
        System.out.println();
       }*/


       //inverted half piramid with numbers
       //12345
       //1234
       //123
       //12
       //1
    
      /*  int n= 5;
       //outer loop
       for(int i=1 ; i<=n ;i++){
        for(int j=1; j<=n-i+1; j++){
            System.out.print(j);
        }
        System.out.println();
       }*/


       //Print Floyd's Triangle
       //1
       //2 3
       //4 5 6
       //7 8 9 10
       //11 12 13 14

       /*int n= 5;
       int number = 1;
       //outer loop
       for(int i=1; i<=n; i++){
        //inner loop
        for(int j=1; j<=i; j++){
            System.out.print(number+" ");
            number++; // number=number+1

        }
        System.out.println();
       }*/

      
       //print the pattern 0-1 triangle

       //1
       //01
       //101
       //0101
       //10101
        
       int n= 5;
       //outer loop
       for(int i =1; i<=n ;i++){
        //inner loop
        for(int j=1 ; j<=i; j++){
            int sum =i +j;
            if(sum % 2 ==0) { 
                System.out.print("1 ");
            }else {
                System.out.print("0 ");
            }
        }
        System.out.println();
       }




    }
}
