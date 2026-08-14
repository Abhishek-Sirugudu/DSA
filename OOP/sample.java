package OOP;

public class sample {
    static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println(a+","+b);
    }
    public static void main(String[] args) {
        int a = 10;
        int b= 10;
        swap(2,10);
        System.out.println(a+","+b);
    }
}
