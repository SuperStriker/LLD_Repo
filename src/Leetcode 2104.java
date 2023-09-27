import java.util.*;

class Solution {
    public long subArrayRanges(int[] nums) {
        
        int[] leftsmaller = new int[nums.length];
        int[] leftbigger = new int[nums.length];
        int[] rightsmaller = new int[nums.length];
        int[] rightbigger = new int[nums.length];
        
        Stack<Integer> stack = new Stack();
        int len = nums.length;
        
        for(int i = 0; i< len ; i++){
            leftsmaller [i]= i+1;
        }
        for(int i = 0; i< len ; i++){
            leftbigger [i]= i+1;
        }
        for(int i = 0; i< len ; i++){
            rightsmaller[i]= len - i;
        }
        for(int i = 0; i< len ; i++){
            rightbigger [i]= len - i;
        }
        
        for(int i= len-1; i >= 0 ; i--){
            while(!stack.isEmpty() && nums[stack.peek()] > nums[i]){
                leftsmaller[stack.peek()] =  stack.pop()-1;
            }
            stack.push(i);
        }
        stack = new Stack();
        
        for(int i= 0; i < len ; i++){
            while(!stack.isEmpty() && nums[stack.peek()] > nums[i]){
                rightsmaller[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            
            // rightsmaller[i] = stack.isEmpty() ? len - i : i - stack.peek();
            stack.push(i);
        }
        stack = new Stack();
        for(int i= len-1; i >= 0 ; i--){
            while(!stack.isEmpty() && nums[stack.peek()] < nums[i]){
                leftbigger[stack.peek()] =  stack.pop()-1;
            }
            stack.push(i);
        }
        stack = new Stack();
        
        for(int i= 0; i < len ; i++){
            while(!stack.isEmpty() && nums[stack.peek()] < nums[i]){
                rightbigger[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            
            stack.push(i);
        }
        
       System.out.println("leftsmaller leftbigger rs rb" + Arrays.toString(leftsmaller) + " " + Arrays.toString(leftbigger) + Arrays.toString(rightsmaller) + " " + Arrays.toString(rightbigger) );
        
        long ans = 0;
        
        for(int i = 0; i< len ; i++){
            long bigger = leftbigger[i]*rightbigger[i];
            long smaller = leftsmaller[i]*rightsmaller[i];
            ans += (bigger - smaller)*nums[i];
        }
        
        return ans;
    }
    
    
    
    
    
}