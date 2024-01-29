/*Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...
 

Example 1:

Input: columnNumber = 1
Output: "A"
Example 2:

Input: columnNumber = 28
Output: "AB"
Example 3:

Input: columnNumber = 701
Output: "ZY"
 

Constraints:

1 <= columnNumber <= 231 - 1*/


public class Excel_Sheet_Column_Title
{
    public static  String convertToTitle(int n)        
    {
        String str="";
        if(n<=26)    
        {
            str=str+(char)(64+n);
            return str;
        }
        while(n>26)       
        {
            int r1=n%26;     
            if(r1==0)
            {
                str="Z"+str;      
                n/=26;   
                n=n-1;
                if(n<=26)
                {
                    str=(char)(64+n)+str;
                    return str;
                }
                continue;
            }
            str=(char)(64+r1)+str;       
            n/=26;     
            if(n<=26) 
            {
                str=(char)(64+n)+str;  
            }
        }
        return str;
    }
    public static void main(String[] args)
    {
        System.out.println(convertToTitle(702));
    }
}