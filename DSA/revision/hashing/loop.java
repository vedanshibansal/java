import java.util.*;

public class loop{
    public static void main(String args[]){
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India",100);
        hm.put("china",150);
        hm.put("US",50);
        hm.put("Indonesia",6);
        hm.put("nepal",5);

        //iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);

       

        for(String k:keys){
            System.out.println("key = " + k + ", value= "+hm.get(k));
        }
        


    }
}