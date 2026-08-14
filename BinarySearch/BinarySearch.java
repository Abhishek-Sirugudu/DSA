package BinarySearch;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while(left <= right) {
            int mid = left + (right - left) / 2;

            if(arr[mid] == target) return mid;
            else if(arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
    public static int firstOccBS(int[] arr, int k){
        int left = 0,right = arr.length-1;

        int res = -1;
        while(left <= right){
            int mid = left + (right - left) / 2;

            if(arr[mid] == k){
                res = mid;
                right = mid-1;
            }else if(arr[mid] < k){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return res;
    }
    public static int lastOccBS(int[] arr, int k){
        int left = 0,right = arr.length-1;
        int res = -1;
        while(left <= right){
            int mid = left + (right-left) /2;

            if(arr[mid] == k){
                res = mid;
                left = mid+1;
            }else if(arr[mid] < k){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return res;
    }
    public static int searchRotated(int[] arr,int k){
        int left = 0, right = arr.length-1;

        while(left <= right){
            int mid = left + (right - left) /2;

            if(arr[mid] == k){
                return mid;
            }

            if(arr[left] <= arr[mid]) {//left half is sorted
                if(k >= arr[left] && k < arr[mid]){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }else{//right half is sorted
                if(k > arr[mid] && k <= arr[right]){
                    left = mid+1;
                }else{
                    right = mid-1;
                }

            }
        }
        return -1;
    }
    public static int squareRoot(int n){
        int left = 1, right = n;
        int res = -1;

        while(left <= right){
            int mid = left + (right - left)/2;
            if((long) mid * mid <= n){
                res = mid;
                left = mid+1;//possible answer but we can find bigger one
            }else{
                right = mid-1; // too big
            }
        }
        return res;
    }
    public static int countOccurrences(int[] arr, int k){
        int first = firstOccBS(arr,k);
        if(first == -1) return 0;
        int last = lastOccBS(arr,k);

        return last-first+1;


    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12};
        int[] arr1 = {1,2,2,2,3,4};
        int[] rotated = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(searchRotated(rotated, 0));  // should print 4
        System.out.println(searchRotated(rotated, 3));  // should print -1
        System.out.println(searchRotated(rotated, 4));

//        System.out.println(firstOccBS(arr1,2));
//        System.out.println(firstOccBS(arr1,3));
//        System.out.println(firstOccBS(arr1,5));
        System.out.println(lastOccBS(arr1,2));
        System.out.println(lastOccBS(arr1,3));
//        System.out.println(binarySearch(arr, 8));   should print 3
//        System.out.println(binarySearch(arr, 5));   should print -1
//        System.out.println(binarySearch(arr, 2));   should print 0
//        System.out.println(binarySearch(arr, 12));  should print 5
    }
}
