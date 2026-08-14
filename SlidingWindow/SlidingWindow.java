package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class SlidingWindow {
    public static int maxSubArr(int[] nums,int k){
        int maxi = 0;
        int window = 0;
        for(int i = 0; i < k; i++){
            window += nums[i];
        }

        maxi = Math.max(window,maxi);

        int left = 0;
        int right = k-1;

        while(right < nums.length-1){
            window -= nums[left];
            left++;
            right++;
            window += nums[right];
            maxi = Math.max(window,maxi);
        }
        return maxi;
    }
    public static int maxSubstrrep(String s){
        int maxLen = 0;
        int left = 0;

        Set<Character> set = new HashSet<>();
        for(int right = 0; right < s.length(); right++){
            char ch = s.charAt(right);
            while(set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            maxLen = Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int arr[] = {2,1,5,1,3,2};
        int k = 3;

        System.out.println(maxSubArr(arr,k));

    }
}
