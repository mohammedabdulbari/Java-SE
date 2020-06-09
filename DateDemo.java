package hashdemo;

import java.util.*;

public class HashDemo 
{
    public static void main(String[] args) 
    {
        HashMap<Integer,String> hm=new HashMap<>();
        LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>();

        hm.put(5,"E");
        hm.put(1,"A");
        hm.put(4, "D");
        hm.put(2, "B");
        hm.put(3,"C");
        hm.put(6,"A");
        
        lhm.put(5,"E");
        lhm.put(1,"A");
        lhm.put(4,"D");
        lhm.put(2,"B");
        lhm.put(3,"C");
        lhm.put(6,"A");
        
        System.out.println(hm);
        String s=lhm.get(5);
        lhm.put(4,"K");
        lhm.get(1);
        System.out.println(lhm);
    }    
}
