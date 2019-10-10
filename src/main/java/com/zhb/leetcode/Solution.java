package com.zhb.leetcode;

/**
 * @Author: Zhang Hengbo
 * @CreateTime: 2019/10/10 19:09
 * @Description:
 */
public class Solution {




    /**
     * #66
     * @param digits
     * @return
     */
    public static int[] plusOne(int[] digits) {
        int index = digits.length - 1;
        int x = 10;
        while (x > 9 && index > -1) {
            x = plusOne_Add(digits, index);
            index--;
        }
        if (x > 9) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            System.arraycopy(digits, 0, result, 1, digits.length);
            return result;
        }
        return digits;
    }

    private static int plusOne_Add(int[] digits, int index) {
        int num = digits[index] + 1;
        digits[index] = num > 9 ? 0 : num;
        return num;
    }

    /**
     * #4
     * @param nums1
     * @param nums2
     * @return
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length,
                len2 = nums2.length,
                index1 = 0,
                index2 = 0;
        int[] temp = new int[len1 + len2];
        for (int i = 0; i < len1 + len2; i++) {
            if (index1 <= len1 || index2 <= len2) {
                if (index1 >= len1) {
                    temp[i] = nums2[index2];
                    index2++;
                } else if (index2 >= len2) {
                    temp[i] = nums1[index1];
                    index1++;
                } else if (nums2[index2] > nums1[index1]) {
                    temp[i] = nums1[index1];
                    index1++;
                } else{
                    temp[i] = nums2[index2];
                    index2++;
                }
            }

        }
        int tempLen = temp.length;
        if (tempLen % 2 == 0) {
            return (double) (temp[tempLen/2 - 1] +  temp[tempLen/2])/2;
        } else {
            return temp[tempLen/2];
        }
    }

}
