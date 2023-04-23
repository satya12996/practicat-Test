package com.green_apex.practicalTest;

import java.util.Arrays;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the size of an array: ");
		int n = scanner.nextInt();
		
		int[] nums = new int[n];
		System.out.println("Enter the element of an array in non-decreasing order: ");
		for (int i = 0; i < n; i++) {
			nums[i] = scanner.nextInt();
		}
		System.out.println("Enter the target value: ");
		int target = scanner.nextInt();
		int[] result = searchRange(nums,target);
		System.out.println("Result: "+ Arrays.toString(result));
		scanner.close();
	}

	public static int[] searchRange(int[] nums, int target) {
		int[] result= {-1,-1};
		int left = 0;
		int right = nums.length-1;
		while(left<=right) {
			int mid = left + (right - left)/2;
			if(nums[mid]== target) {
				result[0] = findLeft(nums,target,left,mid);
				result[1] = findRight(nums, target, mid, right);
				break;
			}else if(nums[mid]< target) {
				left = mid+1;
				
			}else {
				right=mid-1;
			}
		}
		return result;
	}
	
	public static int findLeft(int[] nums, int target, int left, int right) {
		int result = right;
		while(left<=right) {
			int mid = left+(right-left)/2;
			if(nums[mid]==target) {
				result=mid;
				right=mid-1;
			}else {
				left = mid+1;
			}
		}
		return result;
	}

	public static int findRight(int[] nums, int target, int left, int right) {
		int result = left;
		while(left<=right) {
			int mid = left+(right-left)/2;
			if(nums[mid]==target) {
				result=mid;
				left=mid+1;
			}else {
				right = mid-1;
			}
		}
		return result;
	}
}
