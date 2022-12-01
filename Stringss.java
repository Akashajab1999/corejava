public class Stringss{
    public static void main(String[] args){
       /*  StringBuilder sb= new StringBuilder("Akash");
        System.out.println(sb);

    //char at index 0
    System.out.println(sb.charAt(0));

    //set char at index 0
    sb.setCharAt(0, 'p');
    System.out.println(sb);
    
    //insert
    sb.insert(0, 's');
    System.out.println(sb);

    //delate
    sb.delete(0,2);
    System.out.println(sb);

     */

     //example2
     
   /*  StringBuilder sb= new StringBuilder("A");
    sb.append("k");
    sb.append("a");
    sb.append("s");
    sb.append("h");
    System.out.println(sb);
    System.out.println(sb.length());
    */

    //example 3 reverse string

    StringBuilder sb= new StringBuilder("hello");

    for(int i=0; i<sb.length()/2 ;i++){
        int front= i;
        int back= sb.length()-1-i;  //5-1-0 = >4

        char frontChar =sb.charAt(front);
        char backchar =sb.charAt(back);

        sb.setCharAt(front, backchar);
        sb.setCharAt(back, frontChar);
    }
System.out.println(sb);


    }
}
