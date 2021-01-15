package leetcode42;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		
		System.out.println("Height: " + Arrays.toString(height));
		
		FindTotalRainWater solution = new FindTotalRainWater();
		
		System.out.println("Solution: " + solution.trap(height));
	}
}
