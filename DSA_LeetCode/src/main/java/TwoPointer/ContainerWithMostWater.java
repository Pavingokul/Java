class Solution {
    public int maxArea(int[] height) {
        int maxarea = 0;
        int left = 0;
        int right = height.length - 1;
        while (left <= right) {
            int h = Math.min(height[left], height[right]);
            int width = right-left;
            int area = h * width;
            maxarea = Math.max(area, maxarea);
            if (height[right] >= height[left]) {
                left++;
            } else {
                right--;
            }
        }
        return maxarea;
    }
}
