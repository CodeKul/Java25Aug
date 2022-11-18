package collectionframework;

import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(43);
        treeSet.add(90);
        treeSet.add(10);
        treeSet.add(19);
        System.out.println(treeSet.descendingSet());
        System.out.println(treeSet.subSet(20,50));
        System.out.println(treeSet.isEmpty());
        System.out.println(treeSet.ceiling(15));
        System.out.println(treeSet.floor(15));
        System.out.println(treeSet.contains(19));
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println(treeSet.lower(99));
        System.out.println(treeSet.higher(50));
        System.out.println(treeSet.headSet(43,false));
        System.out.println(treeSet.tailSet(40,true));
        System.out.println(treeSet);

    }
}
