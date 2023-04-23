package com.green_apex.practicalTest;

import java.util.Arrays;

import org.junit.Test;

public class AppTest 
{

    @Test
    public void testSearchRange()
    {
        int[] nums1= {5,7,7,8,8,10};
        int target1=8;
        int[] expected1= {3,4};
        int[] actual1 = App.searchRange(nums1, target1);
        System.out.println("Expected: "+Arrays.toString(expected1));
        System.out.println("Actual1: "+Arrays.toString(actual1));
        
        int[] nums2= {5,7,7,8,8,10};
        int target2=6;
        int[] expected2= {-1,-1};
        int[] actual2 = App.searchRange(nums2, target2);
        System.out.println("Expected: "+Arrays.toString(expected2));
        System.out.println("Actual1: "+Arrays.toString(actual2));
       
        int[] nums3= {};
        int target3=0;
        int[] expected3= {-1,-1};
        int[] actual3 = App.searchRange(nums3, target3);
        System.out.println("Expected: "+Arrays.toString(expected3));
        System.out.println("Actual1: "+Arrays.toString(actual3));
        
    }
}
