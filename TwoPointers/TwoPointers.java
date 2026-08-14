package TwoPointers;

public class TwoPointers {
    public static boolean isPair(int[] nums, int target){
        int left = 0, right = nums.length-1;

        while(left < right){
            int sum = nums[left]+nums[right];

            if(sum == target){
                return true;
            }else if (sum > target){
                right--;
            }else{
                left++;
            }
        }
        return false;
    }

    public static void reverse(int[] nums){
        int left = 0,right = nums.length-1;

        while(left < right){
            int temp =nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
    public static boolean checkPal(String s){
        int left = 0, right = s.length()-1;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void print(int[] nums){
        for(int i : nums){
            System.out.print(i+",");
        }
    }
    public static int[] twoSumSorted(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;

        while(left < right){
            int sum = nums[left]+nums[right];
            if(sum == target){
                return new int[] {left,right};
            }
            else if(sum > target){
                right--;
            }else{
                left++;
            }
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        int[] arr = {2,5,8,12,30};

        int x = 17;

        System.out.println(isPair(arr,x));
        print(arr);
        System.out.println();
        reverse(arr);
        print(arr);
        System.out.println();
        String s = "racecar";
        String s2 = "hello";

        System.out.println(checkPal(s));
        System.out.println(checkPal(s2));
        int nums2[] = {2,7,11,15};
        int target = 9;

//        (twoSumSorted(nums2,target));

        int nums3[] = {1,1,2,3,3,4};

        int left = 0;
        for(int right = 0; right < nums3.length; right++ ){
            if(nums3[right] != nums3[left]){
                left++;
                nums3[left] = nums3[right];
            }
        }


    }
}
