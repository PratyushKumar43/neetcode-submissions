class Solution {
    public int maxArea(int[] heights) {
        int water = 0;
        int left = 0;
        int right = heights.length - 1;

        while (left < right) {
            int area = Math.min(heights[left], heights[right]) * (right - left);

            water = Math.max(water, area);

            if (heights[left] > heights[right]) {
                right--;
            } else {
                left++;
            }
        }

        return water;
    }
}