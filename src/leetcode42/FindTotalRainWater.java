package leetcode42;

public class FindTotalRainWater {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        
        // Tallest block so far
        int maxLeft = 0;
        int maxRight = 0;
        
        int result = 0;
        
        // 1, 0, 1 = 1
        // 2, 0, 2 = 2
        // 2, 1, 0, 1, 2 = 4
        while(left < right){
            if(height[left] <= height[right]){
                if(height[left] >= maxLeft){
                    maxLeft = height[left];
                } else {
                    result += (maxLeft - height[left]); // Only smaller block could hold water 
                }
                
                left++;
            } else {
                if(height[right] >= maxRight){
                    maxRight = height[right];
                } else {
                    result += (maxRight - height[right]); // Only smaller block could hold water    
                }
                
                right--;
            }
        }
        
        return result;
    }
}
