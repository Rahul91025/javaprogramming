package ArrayList;
import java.util.*;
import java.io.*;

public class Swap {
    public static void swap(ArrayList<Integer> list,int idx1,int idx2){
     int temp = list.get(idx1);
     list.set(idx1,list.get(idx2));
     list.set(idx2,temp);
        for(int i =0;i<list.size()-1;i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        

    }
    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        int idx1=1;
        int idx2=3;
        swap(list,idx1,idx2);

        

        
        
        
        
        
    }
    
}
