package MAP;
import java.util.*;

public class Map {
    public static void main(String [] args){
        
        HashMap hm = new HashMap();
        hm.put(07,"Rahul");
        hm.put(null,"Rohan");
        hm.put(05,null);
        System.out.println(hm);
        
        LinkedHashMap lhm = new LinkedHashMap();
        lhm.put(07,"Rahul");
        lhm.put(null,"Rohan");
        lhm.put(05,null);
        System.out.println(lhm);
        
        

    }
    
}
