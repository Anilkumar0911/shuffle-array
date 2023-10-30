package Maccess;
import java.util.*;
public class Random {
		    public static void shuffle(int nums[])
		    {
		        for (int i = nums.length - 1; i>= 1; i--)
		        {
		            Random rd = new Random();
		            int j = rd.nextInt(i + 1);
		            swap_elements(nums, i, j);
		        }
		    }
		    int nextInt(int i) {
		return 0;
	}
		    private static void swap_elements(int[] nums, int i, int j) {
		        int temp = nums[i];
		        nums[i] = nums[j];
		        nums[j] = temp;
		    }

		    public static void main (String[] args)
		    {
		        int[] nums = { 1, 2, 3, 4, 5, 6 };
		        System.out.println("Original Array: "+Arrays.toString(nums));

		        shuffle(nums);

		        System.out.println("After Shuffled : "+Arrays.toString(nums));
		    }
		

	}



