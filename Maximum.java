package ArrayList;
import java.util.*;
import java.io.*;


public class Maximum {
    public static void main(String [ ] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(15);
        list.add(6);
        int max = 0;
        int maxi=0;
        for(int i =0;i<list.size()-1;i++){
            //if(list.get(i)>max){
              //  max=list.get(i);
                 maxi=Math.max(maxi,list.get(i));
            }
            System.out.println("The Maximum element is " + maxi);
        }
        

        
         
        


    }
    

