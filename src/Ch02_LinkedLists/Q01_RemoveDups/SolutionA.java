package Ch02_LinkedLists.Q01_RemoveDups;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;

public class SolutionA {

    public static LinkedList<Integer> removeDups(LinkedList<Integer> list) {
        Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();

        Iterator<Integer> listIterator = list.iterator();
        while (listIterator.hasNext()) {
            ht.put(listIterator.next(), 0);
        }

        return new LinkedList<Integer>(ht.keySet());
    }

    public static void main(String[] args) {
        LinkedList<Integer> listDups = new LinkedList<Integer>();
        LinkedList<Integer> list = new LinkedList<Integer>();

        listDups.add(1);
        listDups.add(2);
        listDups.add(3);
        listDups.add(1);
        listDups.add(2);
        listDups.add(1);
        listDups.add(1);

        for (Integer integer : listDups) {
            System.out.println(integer);
        }
        System.out.println("--------------------");

        list = removeDups(listDups);

        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
