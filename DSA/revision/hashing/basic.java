import java.util.*;
public class basic{
    public static void main(String args[]){
        //create
        HashMap<String, Integer> hm = new HashMap<>();

        //insert
        hm.put("India",100);
        hm.put("china",150);
        hm.put("US",50);

        System.out.println(hm);
/*
        //get - 0(1)

        int population = hm.get("India");
        System.out.println(population);

        System.out.println(hm.get("Indonesia"));

        //contains key -0(1)
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonesia"));
        */

        //remove
        System.out.println(hm.remove("china"));
        System.out.println(hm);

        //size
        System.out.println(hm.size());

        //is empty
        System.out.println(hm.isEmpty());   //false

        hm.clear();
        System.out.println(hm.isEmpty());   //true



    }
}