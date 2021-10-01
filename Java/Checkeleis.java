package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Checkeleis {
    public static void main(String[] args) {
        ArrayList<Integer> val=new ArrayList<Integer>();
        val.add(1);
        val.add(3);
        val.add(4);
        val.add(5);
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value to check/search");
        int vl=sc.nextInt();
        boolean find=val.contains(vl);
      //  System.out.println(find);
        if(find){
            System.out.println("value"+vl+" found at index of "+val.indexOf(vl));
        }
        else {
            System.out.println("Value not found");
        }


        System.out.println("Linear Search");
        boolean flg=false;
        for(int i=0;i<val.size();i++){
            if (val.get(i)==vl) {
                flg = true;
            }
        }
        if(flg){
            System.out.println("value"+vl+" found at index of "+val.indexOf(vl));
        }
        else {
            System.out.println("Value not found");
        }


    }
}
