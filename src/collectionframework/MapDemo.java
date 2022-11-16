package collectionframework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Pune", 10);
        map1.put("Mumbai", 20);
        map1.put("Nashik", 30);
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Pune", 10);
        map2.put("Mumbai", 20);
        map2.put("Nashik", 30);
        Map<String, Integer> map3 = new HashMap<>();
        map3.put("Pune", 10);
        map3.put("Mumbai", 20);
        map3.put("Nashik", 30);

     /*   System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.values());
        System.out.println(map.isEmpty());
        System.out.println(map.keySet());
        System.out.println(map.entrySet());*/

        /*map.forEach((k,v)->{
            System.out.println(k+" "+v);
        });

        for (Map.Entry<String,Integer> m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
     }*/

        List<Map<String, Integer>> list = new ArrayList<>();
        list.add(map1);
        list.add(map2);
        list.add(map3);


        list.forEach(l -> {
            l.forEach((k, v) -> {
                System.out.println(k + " " + v);
            });
        });
    }
}
