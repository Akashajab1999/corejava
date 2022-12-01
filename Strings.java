import java.util.*;

import javax.swing.filechooser.FileNameExtensionFilter;
public class Strings {
    public static void main(String[] args){
        //string declaration
        //String name="Akash";
        //String fullName="Akash Shivaji Ajab"
       
       //example 2
       
       //Scanner sc =new Scanner(System.in);
       //String name = sc.nextLine();
       //System.out.println("Your name is " +name);
    
     //example 3


     /*String firstName= "Akash";
     String lastName=" Ajab";

     String fullName=firstName + lastName ;

     System.out.println(fullName);
     //Akash Ajab
     System.out.println(fullName.length());
     //10

     //how to print all character 

     for(int i=0; i<fullName.length(); i++){
        System.out.println(fullName.charAt(i));
     }*/


     //compare string
    //example 4


    String name1= "Akash";
    String name2="Akash";


    /*if(name1.compareTo(name2)==0) {
        System.out.println("Strings are equal");
    }
    else {
        System.out.println("Strings are not  eqaul");
    }*/

                                                                //use compareTo fuction anytime because == gives error some time.
    /*if(name1==name2) {
        System.out.println("Strings are equal");
    }
    else {
        System.out.println("Strings are not  eqaul");
    }*/


    /*if(new String("Akash")== new String("Akash")){
        System.out.println("strings are equal");
    }
    else{
        System.out.println("strings are not eqaul");
       }*/

                                                      //substring(int beginIndex, int endIndex)
       String sentence ="my name is akash";
       String name =sentence.substring(3,6);
       System.out.println(name);

       //strings are Immutable
       
    }
}
