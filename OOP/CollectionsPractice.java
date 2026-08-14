package OOP;

import java.util.ArrayList;
import java.util.*;
import java.util.Collections;

public class CollectionsPractice {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Abhishek");
        students.add("Rahul");
        students.add("Priya");
        students.add("Kiran");

        Collections.sort(students);

        System.out.println(students);

        students.remove(1);

        System.out.println(students);



        Map<String, Integer> stu = new HashMap<>();

        stu.put("Abhishek",100);
        stu.put("Rahul",99);
        stu.put("Priya",88);
        stu.put("Kiran",90);

        for(Map.Entry<String,Integer> entry : stu.entrySet()){
            System.out.println("Key :"+entry.getKey()+" Value :"+entry.getValue());
        }

        int[] arr = {1,2,3,2,4,1,5};

        Set<Integer> hashSet = new HashSet<>();

        for(int i : arr){
            if(!hashSet.add(i)){
                System.out.println("Duplicate : "+ i);
            }
        }

        Map<Character, Integer> hashMap = new HashMap<>();

        String s = "Abhishek";

        for(char i : s.toCharArray()){
            hashMap.put(i,hashMap.getOrDefault(i,0)+1);
        }

        System.out.println(hashMap);
    }

}
