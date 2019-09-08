package charfrequency;
/**
 *
 * @author Tek Raj Awasthi
 */
import java.io.*;
import java.util.*;

public class CharFrequency {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sr = new Scanner(System.in);
        String str;
        int num=0;
        str=sr.nextLine();
        int[] freq = new int[20];
        for(int i=0; i<str.length(); i++)
        {
           freq[str.charAt(i)-'a']++; 
        }
        
        for(int i=0; i<str.length(); i++)
        {
           if(freq[str.charAt(i)-'a'] !=0)
           {
               num++;
           }
            
        }
        for(int i=0; i<num; i++)
        {
            if(freq[str.charAt(i)-'a'] !=0)
            {
                System.out.print(str.charAt(i) +" ");
            System.out.println(freq[str.charAt(i)-'a']);
            }
            freq[str.charAt(i)-'a']=0;
        }
        
        
    }
    
}
