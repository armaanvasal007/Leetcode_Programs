/*Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.


Example 1:

Input: s = "leetcode"
Output: 0
Example 2:

Input: s = "loveleetcode"
Output: 2
Example 3:

Input: s = "aabb"
Output: -1

Constraints:
1 <= s.length <= 105
s consists of only lowercase English letters.*/

public class First_Unique_Character_in_a_String_387
{
    public static int firstUniqChar(String s) 
    {
        int ans=Integer.MAX_VALUE;
        for (char  i = 'a'; i <= 'z'; i++) 
        {
            if ((s.indexOf(i)!=-1)&&(s.indexOf(i) == s.lastIndexOf(i))) 
            {
                ans=s.indexOf(i)<ans?s.indexOf(i):ans;
            }
        }
        return (ans==Integer.MAX_VALUE?-1:ans);
    }

    public static void main(String[] args)
    {
        String s="loveleetcode";
        System.out.println(firstUniqChar(s));
    }
}