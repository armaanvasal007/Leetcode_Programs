/*There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.


Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
Example 3:

Input: nums = [1], target = 0
Output: -1*/

class Search_in_Rotated_Sorted_Array_33 {
    public int search(int[] a, int target) {
        int idx = sea(a, target, 0, a.length - 1);
        if (idx < 0) {
            return -1;
        } else {
            return idx;
        }
    }

    public static int sea(int a[], int target, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2;
        if (a[mid] == target) {
            return mid;
        }
        // mid on L1
        if (a[si] <= a[mid]) {
            // case a:left
            if (a[si] <= target && target <= a[mid]) {
                return sea(a, target, si, mid - 1);
            } else {
                // case b:right
                return sea(a, target, mid + 1, ei);
            }
        }
        // mid on L2
        else {
            // case c:right
            if (a[mid] <= target && target <= a[ei]) {
                return sea(a, target, mid + 1, ei);
            } else {
                return sea(a, target, si, mid - 1);
            }
        }
    }
}