package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteratec {
    public static void main(String[] args) {
        ArrayList<Integer> val=new ArrayList<Integer>();
        val.add(1);
        val.add(3);
        val.add(4);
        val.add(5);
        System.out.println("iterator of Array list using hasnext");
        Iterator it= val.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("iterator of Array list using for loop ");
        for (int i=0;i<val.size();i++)
        {
            System.out.println(val.get(i));
        }

        System.out.println("iterator of Array list using for each");
        for(Object o: val) {
            System.out.println(o);
        }
    }

}
