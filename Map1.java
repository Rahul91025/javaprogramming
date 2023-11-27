package MAP;
import java.util.*;

public class Map1 {
    public static void main(String [] args){
        HashMap map = new HashMap();
        map.put(1,"Rahul");
        map.put(2,"Rohit");
        map.put(3,"Virat");
        map.put(4,"Ramesh");
        System.out.println(map);

        System.out.println(map.get(3));
        System.out.println(map.get(4));

        Set keySet = map.keySet();
        Iterator iter = keySet.iterator();
        while(iter.hasNext()){
           System.out.println( iter.next());

        }
        Collection value = map.values();
        Iterator iter1 = value.iterator();
        while(iter1.hasNext()){
            System.out.println(iter1.next());
        }

        Set entryset = map.entrySet();
        Iterator iter3 =entryset.iterator();
        while(iter3.hasNext()){
            System.out.println(iter3.next());
        }

    }
    
}
