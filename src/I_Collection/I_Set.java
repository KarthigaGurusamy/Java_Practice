package I_Collection;

import java.util.HashSet;
import java.util.Iterator;

public class I_Set {
    public static void main(String[] args) {

        HashSet<Integer> list = new HashSet<>();

        list.add(1);
        list.add(2);
        list.add(null);
        list.remove(1);

        System.out.println(list);
        System.out.println(list.size());

        System.out.println("-With Iterator-");

        Iterator<Integer> Ilist = list.iterator();
        while(Ilist.hasNext())
        {
            System.out.println(Ilist.next());
        }
    }
}
