package collectionframework;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {

        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        treeMap.put(1,10);
        treeMap.put(2,20);
        treeMap.put(3,30);
        treeMap.put(4,40);
        treeMap.put(5,50);
        treeMap.put(6,60);

        System.out.println(treeMap.descendingMap());
        System.out.println(treeMap.get(4));
        System.out.println(treeMap.descendingKeySet());
        System.out.println(treeMap.entrySet());
        System.out.println(treeMap.firstEntry());
        System.out.println(treeMap.lastKey());
        System.out.println(treeMap.higherEntry(20));
        System.out.println(treeMap.lowerEntry(20));
        System.out.println(treeMap.headMap(20));
        System.out.println(treeMap.tailMap(20));
        System.out.println(treeMap.subMap(3,true,4,true));
        System.out.println(treeMap);
    }
}
