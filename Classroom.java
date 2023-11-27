package ArrayList;

import java.util.*;
import java.io.*;

public class Classroom {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();
        // add operation = O(1)

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

         list.add(1,9); //  O(n)


        System.out.println(list);

        // Get Operation = O(1)

        int element  =list.get(2);
        System.out.println(element);

        //Delete operation = (n)

        list.remove(2);
        System.out.println(list);

        //Set Element at Index = O(n)

        list.set(2,10);
        System.out.println(list);

        //Contains Element = O(n)

        System.out.print(list.contains(1) + " ");

        //size() 

        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) + " ");

        }
        System.out.println();
    }

}
