package collection;

import java.util.ArrayList;

public class ConvertLtoA {
    public static void main(String[] args) {
        ArrayList<Integer> val=new ArrayList<Integer>();
        val.add(1);
        val.add(3);
        val.add(4);
        val.add(5);
        System.out.println("list value ");
        System.out.println(val);
        //converting list to array
        int a[]= new int[val.size()];
        for(int i=0;i< val.size();i++){
            a[i]=val.get(i);
        }
        System.out.println("Array value ");
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
}
