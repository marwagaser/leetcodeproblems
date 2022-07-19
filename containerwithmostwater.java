class Solution {
    public int maxArea(int[] height) {
     int start = 0; 
        int area =0;
        int length =0;
     int end = height.length-1;
       while(start<end){
           int width = end  - start;
           
           if (height[start]<height[end]){
                length = height[start];
               start+=1;
           }
           else{
                length = height[end];
                 end-=1;
           }
          
           if (area<width*length){
               area = length*width;
           }
           
       }
        return area;
    }
}
