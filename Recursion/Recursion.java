package Recursion;

public class Recursion {
    public static int fact(int n){
        if(n== 1){
            return n;
        }
        return n * fact(n-1);
    }

    public static int fib(int n){
        if(n == 1 || n== 0){
            return n;
        }

        return fib(n-1)+fib(n-2);
    }

    public static int sumOfDigits(int n){
        if(n == 0){
            return 0;
        }
        return n%10 + sumOfDigits(n/10);
    }

    public static int power(int base , int exp){
        if(exp == 0){
            return 1;
        }
        return base *  power(base,exp-1);
    }

    public static String reverseString(String s){
        if(s.isEmpty()){
            return "";
        }

        return s.charAt(s.length()-1) + reverseString(s.substring(0,s.length()-1));
    }

    public static boolean isPalindrome(String s){
        if(s.length() <= 1){
            return true;
        }
        if(s.charAt(0) != s.charAt(s.length()-1)){
            return false;
        }
        return isPalindrome(s.substring(1,s.length()-1));
    }

    public static void printTail(int n){
        if(n == 0){
            return;
        }
        System.out.print(n+",");
        printTail(n-1);
    }

    public static void printHead(int current){
        if(current == 0){
            return;
        }
        printHead(current-1);
        System.out.println(current);
    }

    public static int recursiveBS(int[] arr, int left, int right,int target){
        if(left > right){
            return -1;
        }
        int mid = left + (right-left)/2;


        if(arr[mid] == target){
            return mid;
        }else if(arr[mid] > target){
            return recursiveBS(arr,left,mid-1,target);
        }else{
            return recursiveBS(arr,mid+1,right,target);
        }
    }

    public static int findMax(int[] arr,int index){
        if(index == arr.length-1){
            return arr[index];
        }

        return Math.max(arr[index],findMax(arr,index+1));

    }

    public static boolean isSorted(int[] arr,int index){
        if(arr.length-1 == index){
            return true;
        }
        if(arr[index] > arr[index+1]){
            return false;
        }
        return isSorted(arr,index+1);
    }

    public static int countOccurrences(int[] arr,int index,int target){
        if(index == arr.length){
            return 0;
        }
        return (arr[index] == target ? 1 : 0) + countOccurrences(arr,index+1,target);
    }

    public static int arraySum(int[] arr,int index){
        if(index == arr.length){
            return 0;
        }

        return arr[index] + arraySum(arr,index+1);
    }
}
