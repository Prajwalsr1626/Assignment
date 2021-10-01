package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Checkinhash {
    public static void main(String[] args) {
       HashSet<Integer> val=new HashSet<>();
        val.add(1);
        val.add(3);
        val.add(4);
        val.add(5);
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value to check/search");
        int vl=sc.nextInt();
        boolean find=val.contains(vl);
        System.out.println(find);
        if(find){
            System.out.println("value "+vl +" is found in Hashset");
        }
        else {
            System.out.println("Value not found");
        }
    }
}
