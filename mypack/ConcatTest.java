package mypack;
import java.util.StringTokenizer;  

public class ConcatTest{  
    public static void main(String[] args){  
        StringBuilder s1 = new StringBuilder("Hello lello kello");    //String 1 
        System.out.println(s1);  //Displays result  

        StringTokenizer st = new StringTokenizer(s1.toString()," ");  
        System.out.println(st.countTokens());  //Displays result  

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

    }  
    
}  