/*Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1
 

Constraints:

1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Each element in the array appears twice except for one element which appears only once.*/


class  Single_Number
{
    public static int nums(int a[])        
    {
        int i=0,j=0,c=0;
        while(i!=a.length)       
        { 
            if(a[i]!=a[j])          
            {
                c++;       
            }
            if(c==a.length-1)        
            {
                return a[i];
            }
                j++;         
                if(j==a.length)     
                {
                    i=i+1;    
                    j=0;   
                    c=0;   
            }
        }
        return 0;
    }
    public static void main(String[] args)
    {
        int a[]={1};
        System.out.println(nums(a));
    }
}