








































public class AdvancePatterns {
    public static void main(String args[]){

        //print butterfly pattrrn
        
        
        
       /*  int n=5;
        //upper half
        for(int i=1;i<=n; i++){
            //1st part
            for(int j=1; j<=i;j++){
            System.out.print("*");
        }
        //spaces
        int spaces=2*(n-i);
        for(int j=1; j<=spaces; j++){
            System.out.print(" ");
        }
        //2nd part
        for(int j=1;j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
        }
       

        //lower half

        for(int i=n;i>=1; i--){
            //1st part
            for(int j=1; j<=i;j++){
            System.out.print("*");
        }
        //spaces
        int spaces=2*(n-i);
        for(int j=1; j<=spaces; j++){
            System.out.print(" ");
        }
        //2nd part
        for(int j=1;j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
        }*/




        //print the pattern solid rhombus
        //    *****
        //   *****
        //  *****
        //*****
        
        /*int n=5;

        for(int i=1; i<=n ; i++){
            //spaces
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=5; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/



        //number pyramid
        //   1
        //  2 2 
//         3 3 3
//        4 4 4 4
    //   5 5 5 5 5



   /* int n=5;
    for(int i=1; i<=n; i++){
        //spaces
        for(int j=1; j<=n-i;j++){
            System.out.print(" ");
        }
        //numbers= print row no,row no times

        for(int j=1;j<=i;j++){
            System.out.print(i +" ");
        }
        System.out.println();
       }*/



       //palindrome pattern
       //     1
       //    212
       //   32123
       //  4321234
       // 543212345


       /*int n=5;
        //1st half
        for(int i=1; i<=n;i++){
            //spaces
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            //1st half numbers
            for(int j=i;j>=1; j--){
                System.out.print(j);
            }
            //2nd half numbers
            for(int j=2; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }*/


        //print diamond pattern
        int n=5;
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");

            }
            //stars
            for(int j=1; j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half
        for(int i=n;i>=1;i--){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");

            }
            //stars
            for(int j=1; j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        






    }



}
    
 

    

