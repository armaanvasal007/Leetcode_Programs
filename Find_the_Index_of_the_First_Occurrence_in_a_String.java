/*Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

 

Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
 

Constraints:

1 <= haystack.length, needle.length <= 104
haystack and needle consist of only lowercase English characters.*/

public class Find_the_Index_of_the_First_Occurrence_in_a_String
{
    public static int index(String s,String str)  
    {
        int i=0,j=0;
        String w="";
        w=w+s.charAt(0);       
        if(s.equals(str))
        {
            return 0;
        }
        if(s.length()<str.length())
        {
            return -1;
        }
        while(i!=s.length()-1)                  
        {
            if(w.equals(str))                     
            {
                return i;
            }
            j++;                        
            if(j==s.length())           
            {
                i++;        
                j=i+1;        
                w="";
                if(i!=s.length())   
                {
                w=w+s.charAt(i);      
            }
        }
            if(i<s.length()-1)   
            {
             w=w+s.charAt(j);     
        }
    }
    if(s.charAt(s.length()-1)==str.charAt(0)&&str.length()==1)
        {
            return s.length()-1;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        System.out.println(index("mississippi","issipi"));
    }
}