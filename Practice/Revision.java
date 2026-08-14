package Practice;

import BinarySearch.BinarySearch;

import java.util.HashMap;
import java.util.Map;

public class Revision {
    private static int task1(String[] arr){
        //task 1
        //Write a method that takes a String array and returns the most frequent element using HashMap.


        Map<String, Integer> hashMap = new HashMap<>();

        for (String s : arr) {
            hashMap.put(s, hashMap.getOrDefault(s, 0) + 1);
        }

        int maxi = -1;

        for(int i : hashMap.values()){
            maxi = Math.max(i,maxi);
        }
        return maxi;

    }
    private static boolean task2(String s1){
        //task2
        //Write a method that checks if a string is a palindrome using two pointers. Skip non-alphanumeric characters.
        StringBuilder cleanedStr = new StringBuilder();

        for(char ch : s1.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                cleanedStr.append(Character.toLowerCase(ch));
            }
        }
        int left = 0, right = cleanedStr.length()-1;

        while(left < right){
            if(cleanedStr.charAt(left)!= cleanedStr.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    private static int maxSubarray(int k,int[] arr){
        int window = 0;

        for(int i = 0; i < k; i++){
            window += arr[i];
        }
        int maxi = window;

        for(int right = k ; right < arr.length; right++){
            window = window - arr[right-k] + arr[right];

            maxi = Math.max(maxi,window);
        }
        return maxi;
    }

    private static int binarySearch(int[] arr, int k){
        int left = 0, right = arr.length-1;

        while(left < right){
            int mid = left + (right-left)/2;

            if(arr[mid] == k){
                return mid;
            }else if(arr[mid] > k){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] arr = {"apple","banana","apple","cherry","banana","apple"};

//        System.out.println(task1(arr));

        String st1 = "A man a plan a canal Panama";
        String st2 = "race a car";

//        System.out.println(task2(st1));
//        System.out.println(task2(st2));

        int[] arr1 = {2,1,5,1,3,2};
        int k = 2;


//        System.out.println(maxSubarray(k, arr1));

        int[] arr2 = {1,2,3,4,5,6,6};
        System.out.println(binarySearch(arr2,6));

    }
}
