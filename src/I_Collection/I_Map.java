package I_Collection;

import java.util.HashMap;
import java.util.Map;

public class I_Map {
    public static void main(String[] args) {

        Map<Integer,String> list = new HashMap<>();
        list.put(1,"One");
        list.remove(1);
        list.put(2,"Two");

        System.out.println("-Key-");
        System.out.println(list.keySet());
        System.out.println("-Value-");
        System.out.println(list.get(2));

        System.out.println("-Looping-");
        for(Integer key : list.keySet())
        {
            System.out.println(list.get(key));
        }
    }
}
